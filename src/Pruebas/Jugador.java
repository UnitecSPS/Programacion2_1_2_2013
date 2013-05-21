/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Jugador {

    private String nombre;
    
    public Jugador(String n){
        nombre = n;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + nombre + "}";
    }
    
    public static Posicion getPosicion(){
        Scanner lea = new Scanner(System.in);
        Posicion pos;
        
        do{
            try{
                pos = Posicion.valueOf(lea.next());
                break;
            }
            catch(Exception e){
                System.out.println("Ingrese una posicion correcta");
            }
            
        }while(true);
        
        return pos;
    }
    
    public static void main(String[] args) {
        //Posicion p = getPosicion();
        //System.out.println("Posicion: " + p);
        
        Jugador j = new Jugador("Carlos");
        
        String cad= "Jugador: " + j;
        System.out.println(cad);
        
        
    }
}
