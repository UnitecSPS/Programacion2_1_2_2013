/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TG1;

import java.util.Date;

/**
 *
 * @author Gotcha
 */
public abstract class Barco {
    protected String nombre;
    protected Date fecha;
    
    public Barco(String n){
        nombre = n;
        fecha = new Date();
    }

    public void imprimir() {
        System.out.println("nombre=" + nombre + ", fecha=" + fecha);
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public abstract void agregarElemento();
    
    public abstract double vaciarCobrar();
}
