/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Gotcha
 */
public class CuentaBancaria {
    protected int num;
    protected String nom;
    protected double sal;

    public CuentaBancaria(int num, String nom) {
        this.num = num;
        this.nom = nom;
        sal = 0;
    }
    
    public void deposito(double mon){
        sal += mon;
    }
    
    
}
