/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class Clase {
    public static void main(String[] args) {
        Lista lil = new Lista();
        
        lil.add(new Nodo("Carlos"));
        lil.add(new Nodo("Luis"));
        lil.add(new Nodo("Lilian"));
        lil.add(new Nodo("Jose"));
        
        lil.addInTheMiddle(new Nodo("German"), "Luis");
        lil.addInTheMiddle(new Nodo("Javier"), "Kratos");
        
        lil.print();
        
        System.out.println("\n\n");
        
        lil.remove("Carlos");
        lil.remove("Jose");
        lil.remove("Lilian");
        lil.remove("Javier");
        
        lil.print();
    }
}
