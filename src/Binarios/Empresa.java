/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

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
       File f = new File("files");
       f.mkdir();
    }

    private void initCodigos() throws IOException {
        RandomAccessFile rcod =  new RandomAccessFile("codigos.pat","rw");
        
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
        RandomAccessFile rcod =  new RandomAccessFile("codigos.pat","rw");
        int cod = rcod.readInt();
        rcod.seek(0);
        rcod.writeInt(cod+1);
        return cod;
    }
    
    public void agregarEmpleado(String nom,double sal,TipoEmpleado tipo){
       
    }
}
