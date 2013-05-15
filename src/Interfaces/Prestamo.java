/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public abstract class Prestamo {
    protected String nombre;
    protected double montoTotal;
    public static final String NOMBREBANCO = "BAC";
    
    public Prestamo(String n, double m){
        nombre = n;
        montoTotal = m;
    }

    public final String getNombre() {
        return nombre;
    }

    public final double getMontoTotal() {
        return montoTotal;
    }
    
    public abstract void pagoMensual(double monto);
    
}
