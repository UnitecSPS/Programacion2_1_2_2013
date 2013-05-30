/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Binarios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class Empresa {
    private RandomAccessFile rVenta;
    
    public Empresa(){
        try {
            asegurarFolder();
            initCodigos();
            rVenta = new RandomAccessFile("files/ventas.pat","rw");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private void asegurarFolder() {
       File f = new File("files/empleados");
       f.mkdirs();
    }

    private void initCodigos() throws IOException {
        RandomAccessFile rcod =  new RandomAccessFile("files/codigos.pat","rw");
        
        if( rcod.length() == 0 )
            rcod.writeInt(1);
        
        rcod.close();
    }
    
    /**
     * Esta funcion es para sacar el codigo para un empleado nuevo
     * @return El codigo a asignar
     * @throws IOException Si falla algo en el archivo
     */
    private int getCodigo()throws IOException{
        RandomAccessFile rcod =  new RandomAccessFile("files/codigos.pat","rw");
        int cod = rcod.readInt();
        rcod.seek(0);
        rcod.writeInt(cod+1);
        return cod;
    }
    
    /**
     * Funcion para agregar un nuevo empleado al sistema
     * @param nom Nombre del nuevo empleado
     * @param sal Salario base del nuevo empleado
     * @param tipo Tipo de Empleado
     * @throws IOException Errores en los archivos
     */
    public void agregarEmpleado(String nom,double sal,TipoEmpleado tipo)throws IOException{
        int codigo = getCodigo();
        String filepath = "files/empleados/empleado"+codigo+".pat";
        RandomAccessFile rEmp = new RandomAccessFile(filepath,"rw");
        
        //codigo
        rEmp.writeInt(codigo);
        //nombre
        rEmp.writeUTF(nom);
        //salario base
        rEmp.writeDouble(sal);
        //fecha ultima pago
        rEmp.writeLong(0);
        //Tipo Empleado
        rEmp.writeUTF(tipo.name());
        //activo
        rEmp.writeBoolean(true);
        
        rEmp.close();
    }
    
    /**
     * Listar empleados disponibles
     * @throws IOException Errores en los archivos
     */
    public void listarDisponibles()throws IOException{
        File dir = new File("files/empleados");
        File emps[] = dir.listFiles();
        System.out.println("\nLISTA DE EMPLEADOS\n---------");
        
        for(File emp : emps){
            if( emp.isFile() ){
                RandomAccessFile remp = new RandomAccessFile(emp,"r");

                int cod = remp.readInt();
                String nom = remp.readUTF();
                double sal = remp.readDouble();
                remp.readLong();
                String tipo = remp.readUTF();

                if( remp.readBoolean() ){
                    System.out.printf("%d- %s Lps. %f - %s\n",
                            cod, nom, sal, tipo);
                }

                remp.close();
            }
        }
        System.out.println("\n");
    }
    
    /**
     * Agregar una nueva venta al sistema
     * @param cod Codigo del empleado
     * @param monto Monto de Venta
     * @throws IOException Errores en archivo
     * @throws NoSuchEmployeeException Por si el empleado no
     *        existe
     */
    public void agregarVenta(int cod, double monto)throws IOException{
        activo(cod);
        rVenta.seek(rVenta.length());
        rVenta.writeInt(cod);
        rVenta.writeLong(new Date().getTime());
        rVenta.writeDouble(monto);
    }

    /**
     * Buscar un empleado en el sistema
     * @param cod Codigo del Empleado
     * @return El RandomAccessFile que maneja el archivo
     * @throws IOException Errores en archivo
     * @throws NoSuchEmployeeException Empleado no existe
     */
    private RandomAccessFile buscarEmpleado(int cod)throws IOException {
        String filepath = "files/empleados/empleado" + cod + ".pat";
        File fi = new File(filepath);
        
        if(  fi.exists() )
            return new RandomAccessFile(filepath,"rw");
        else
            throw new NoSuchEmployeeException(cod);
    }
    
    /**
     * Actualizar Salario del Empleado si Existe y esta Activo
     * @param cod Codigo del Empleado
     * @param newSal Nuevo Salario
     * @throws IOException Error en el archivo
     */
    public void updateSalario(int cod, double newSal)throws IOException{
        RandomAccessFile ram = activo(cod);
        
        String cad = ram.readUTF();
        double sal = ram.readDouble();
        ram.seek(ram.getFilePointer()-8);
        ram.writeDouble(newSal);
            
        System.out.printf("Se actualizo el Salario de %s de Lps. %.1f a %.1f\n",
                        cad, sal, newSal);
        ram.close();
    }
    
    /**
     * Retorna un RandomAccessFile si el usuario esta activo y existe
     * @param cod Codigo del Empleado
     * @return RandonAccessFile con el archivo del Empleado
     * @throws IOException 
     */
    private RandomAccessFile activo(int cod)throws IOException{
        RandomAccessFile remp = buscarEmpleado(cod);
        remp.readInt();
        remp.readUTF();
        remp.seek(remp.getFilePointer()+16);
        remp.readUTF();
        
        if( remp.readBoolean() ){
            remp.seek(4);
            return remp;
        }
        else{
            throw new NoSuchEmployeeException(cod);
        }
    }
    
    public double ventasNoPagadasDe(int cod)throws IOException{
        double ventas = 0;
        RandomAccessFile remp = activo(cod);
        
        remp.readUTF();
        remp.readDouble();
        long ultima = remp.readLong();
        
        rVenta.seek(0);
        
        while( rVenta.getFilePointer() < rVenta.length() ){
            int codigo = rVenta.readInt();
            long fecha = rVenta.readLong();
            double monto = rVenta.readDouble();
            
            if( codigo == cod ){
                Date now = new Date();
                
                if(fecha > ultima && fecha <= now.getTime()){
                    ventas += monto;
                }
            }
        }
        
        return ventas;
    }
}
