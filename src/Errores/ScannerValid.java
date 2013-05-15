/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class ScannerValid {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        do{
            try{
                System.out.print("Ingrese numero: ");
                int x = lea.nextInt();
                break;
            }
            catch(InputMismatchException e){
                lea.next();
                System.out.println("Ingrese un dato entero");
            }
        }while(true);
        
    }
}
