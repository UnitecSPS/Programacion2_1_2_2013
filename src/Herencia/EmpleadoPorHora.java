/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 */
public class EmpleadoPorHora extends Trabajador{
    private double ht;
    private static double PAGO_X_HORA = 50;
    
    public EmpleadoPorHora(int n, String no){
        super(n,no);
        ht = 0;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }

    @Override
    public void quienSoy() {
        super.quienSoy();
        System.out.println("POR HORA");
    }

    @Override
    public double pagar() {
        return ht * PAGO_X_HORA;
    }
    
    
}
