/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class TestFile {
    public static void main(String[] args) {
        MiFile mf = new MiFile();
        int op = 0;
        Scanner lea = new Scanner(System.in);
        
        do{
            System.out.println("1- Set Archivo o Folder");
            System.out.println("2- Ver Informacion");
            System.out.println("3- Crear Archivo"); 
            System.out.println("4- Crear Directorios");
            System.out.println("5- Borrar");
            System.out.println("6- Listar");
            System.out.println("7- Salir");
            System.out.print("\nEscoja opcion: ");
            
            try{
                op = lea.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Ingrese dir: ");
                        mf.setFile(lea.next());
                        break;
                    case 2:
                        System.out.println("\n");
                        mf.viewInfo();
                        System.out.println("\n");
                        break;
                    case 3:
                        if( mf.createFile())
                            System.out.println("Creado exitosamente");
                        else
                            System.out.println("No se pudo crear archivo");
                        break;
                    case 4:
                        if( mf.createFolder())
                            System.out.println("Creado Exitosamente");
                        else
                            System.out.println("No se pudo crear folder");
                        break;
                    case 5:
                        if( mf.delete() )
                            System.out.println("Se borro exitosamente");
                        else
                            System.out.println("No se pudo borrar");
                        break;
                    case 6:
                        mf.dir();
                        break;
                }
            }
            catch(InputMismatchException e){
                lea.next();
                System.out.println("Ingrese un valor valido");
            }
            catch(Exception e){
                System.out.println("Error:" + e.getMessage());
            }
        }while(op!=7);
        
    }
}
