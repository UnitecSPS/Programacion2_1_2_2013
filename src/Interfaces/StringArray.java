/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public class StringArray implements ArrayActions {

    @Override
    public void print() {
        System.out.println("Soy String Array");
    }

    @Override
    public Object calcular() {
        return null;
    }

    @Override
    public Object subarray(int offset, int count) {
        return null;
    }
    
}
