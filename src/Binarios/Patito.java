/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Binarios;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Patito {
    static Empresa emp = new Empresa();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op=0;
        
        do{
            System.out.println("1- Agregar Empleado");
            System.out.println("2- Listar Empleados");
            System.out.println("3- Agregar Venta");
            System.out.println("4- Actualizar Salario");
            System.out.println("7- Salir");
            System.out.print("Escoja opcion: ");
            
            try{
                op = lea.nextInt();
                
                switch(op){
                    case 1:
                        agregar();
                        break;
                    case 2:
                        emp.listarDisponibles();
                        break;
                    case 3:
                        venta();
                        break;
                    case 4:
                        updateSalario();
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }while(op != 7);
        
    }

    private static void agregar()throws IOException {
        System.out.println("Ingrese Nombre: ");
        String nom = lea.next();
        System.out.println("Ingrese Salario: ");
        double sal = lea.nextDouble();
        System.out.println("Ingrese tipo: ");
        TipoEmpleado te = TipoEmpleado.valueOf(lea.next());
        
        emp.agregarEmpleado(nom, sal, te);
    }

    private static void venta() throws IOException{
        System.out.println("Codigo: ");
        int cod = lea.nextInt();
        System.out.println("Monto: ");
        double vent = lea.nextDouble();
        
        emp.agregarVenta(cod, vent);
    }

    private static void updateSalario()throws IOException {
        System.out.println("Codigo: ");
        int cod = lea.nextInt();
        System.out.println("Salario Nuevo: ");
        double sal = lea.nextDouble();
        
        emp.updateSalario(cod, sal);
    }
}
