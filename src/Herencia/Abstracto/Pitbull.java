/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

/**
 *
 * @author Gotcha
 */
public class Pitbull extends Perro{
    public Pitbull(){
        super("pitbull");
    }

    @Override
    public void comoHabla() {
        super.comoHabla();
        System.out.println("ya tu sabes");
    }
}
