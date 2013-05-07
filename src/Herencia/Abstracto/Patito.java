/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

/**
 *
 * @author Gotcha
 */
public class Patito extends Animal {

    public Patito(String r){
        super(r,2);
    }
    
    @Override
    public void comoHabla() {
        System.out.println("cuac cuac cuac");
    }
    
}
