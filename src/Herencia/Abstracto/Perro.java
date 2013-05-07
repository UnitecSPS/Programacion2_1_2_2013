/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

/**
 *
 * @author Gotcha
 */
public class Perro extends Animal{
    
    public Perro(String r){
        super(r, 4);
    }

    @Override
    public void comoHabla() {
        System.out.println("Guau Guau Guau");
    }
    
    
}
