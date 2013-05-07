/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Abstracto;

import java.util.ArrayList;


/**
 *
 * @author Gotcha
 */
public class ReinoAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> anis = new ArrayList<>();
        anis.add(new Perro("chihuahua"));
        anis.add(new Pitbull());
        anis.add(new Patito("Donald"));
        anis.add(new Gato("Silvestre"));
        anis.add(new Vaca("Goofy"));
        
        for(Animal ani : anis){
            ani.comoHabla();
        }        
        
        Animal ani = new Animal("marciana",6) {

            @Override
            public void comoHabla() {
                System.out.println("JUE JUA");
            }
        };
        
        Vaca vac = new Vaca("Clarabella"){
            public void comoHabla(){
                System.out.println("Muua Muaaa");
            }
        };
        vac.comoHabla();
        ani.comoHabla();
        
    }
}
