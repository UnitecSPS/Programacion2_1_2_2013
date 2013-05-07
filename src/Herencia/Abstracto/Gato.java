/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

/**
 *
 * @author Gotcha
 */
public class Gato extends Animal{

    public Gato(String r){
        super(r,4);
    }
    
    @Override
    public void comoHabla() {
        System.out.println("Miau Miau Miau");
    }
    
}
