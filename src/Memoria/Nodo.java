/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class Nodo {
    public String dato;
    public Nodo sigte;
    
    public Nodo(String d){
        dato = d;
        sigte = null;
    }
    
    public void print(){
        System.out.println("Dato: " + dato);
    }
}
