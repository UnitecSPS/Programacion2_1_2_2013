/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class TestMem {
    public static void main(String[] args) {
        Nodo a = new Nodo("Carlos");
        Nodo b = a;
        
        a.print();
        b.print();
        
        b.dato = "Javier";
        Nodo c = b;
        c.dato = "Lilian";
        
        a.print();
        b.print();
        c.print();
        
        int x = 10;
        int y = x;
         
        y = 20;
        System.out.println("x: " + x + " y: " + y);
        
    }
}
