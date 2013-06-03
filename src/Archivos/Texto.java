/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Texto {
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        //filewriter
        String file = "";
        
        do{
            System.out.println("Filename: ");
            file = lea.next();
            
            if( !file.equals("SALIR")){
                fileWriter(file);
                System.out.println("\n\n");
                fileRead(file);
            }
            
            
            
        }while(!file.equals("SALIR"));
    }

    private static void fileWriter(String file) {
        System.out.println("Append? (s/n): ");
        char ap = lea.next().charAt(0);
        
        try{
            FileWriter fw = new FileWriter(file, 
                Character.toLowerCase(ap) == 's' ? true : false );
        
            do{
                System.out.println("Que Quiere Escribir: ");
                String dato = lea.next();
                
                if(!dato.equals("$$$")){
                    fw.write(dato+"\n");
                    //fw.flush();
                }
                else
                    break;
                
            }while(true);
            
            fw.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    private static void fileRead(String file) {
        try{
            FileReader fr = new FileReader(file);
            File fi = new File(file);
            
            char buffer[] = new char[10];
            int bytes = fr.read(buffer);
            
            System.out.print(buffer);
            System.out.println("Bytes leido: " + bytes);
            
            buffer = new char[(int)fi.length()];
            bytes = fr.read(buffer);
            
            System.out.print(buffer);
            System.out.println("Bytes leido: " + bytes);
            
            fr.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
