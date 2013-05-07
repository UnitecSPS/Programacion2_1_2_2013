/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

/**
 *
 * @author Gotcha
 */
public abstract class Animal {
    public String raza;
    public int patas;
    
    public Animal(String r, int pa){
        raza = r;
        patas = pa;
    }

    public final String getRaza() {
        return raza;
    }

    public final int getPatas() {
        return patas;
    }
    
    public abstract void comoHabla();
}
