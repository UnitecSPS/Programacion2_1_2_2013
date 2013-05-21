/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Patito {
    public static void main(String[] args) {
        System.out.println("Iniciando ");
        
        try{
            estanque();
        }
        catch(NullPointerException e){
            System.out.println("Instancie el objeto");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ingrese una coordenada correcta");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("FInalizando");
    }

    private static void estanque()throws PatitoException {
        System.out.println("Cuando calienta el sol");
        algas();
        System.out.println("Se vino la noche");
    }

    private static void algas()throws PatitoException {
        Scanner lea = new Scanner(System.in);
        System.out.println("Flotando");
        
        int x = lea.nextInt();
        int z[] = {1,2};
        System.out.println(z[x]);
        
        if( x == 0 ){
            PatitoException e = new PatitoException("Este es un pato loco");
            throw e; 
        }
        
        System.out.println("Paseando en el agua");
    }
}
