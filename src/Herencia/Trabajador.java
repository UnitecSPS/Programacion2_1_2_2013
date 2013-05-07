/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class Trabajador {
    protected int numero;
    protected String nombre;
    protected Date fechan;
    protected Date fechai;
    public static final double rap = 0.35;
    
    public Trabajador(int n, String no){
        numero = n;
        nombre = no;
        fechai = new Date();
        fechan = new Date();
    }
    
    public static Trabajador getInstance(){
        return new Empleado(-1, "lilian", 0);
    }
    
    public void setFechaNacimiento(int y, int m, int d){
        Calendar c = Calendar.getInstance();
        c.set(y, m - 1, d);
        fechan = c.getTime();
    }
    
    public void quienSoy(){
        System.out.println("YO "+nombre+" SOY UN SIMPLE TRABAJADOR");
    }
    
    public double pagar(){
        final int x;
        x = 0;
        return x;
    }
}
