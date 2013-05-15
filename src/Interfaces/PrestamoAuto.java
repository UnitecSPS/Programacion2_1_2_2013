/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public final class PrestamoAuto extends Prestamo implements Serializable {

    private double montoSeguro;
    
    public PrestamoAuto(String n, double m, double ms){
        super(n,m);
        montoSeguro = ms;
    }
    
    @Override
    public void pagoMensual(double monto) {
        montoTotal -= monto;
        Scanner lea = new Scanner(System.in);
        montoSeguro -= lea.nextDouble();
    }
    
}
