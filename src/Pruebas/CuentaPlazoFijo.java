/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class CuentaPlazoFijo extends CuentaBancaria {
    private Date fechafin;

    public CuentaPlazoFijo(int num, String nom) {
        super(num, nom);
    }
    
    public void setFechaFin(int anio, int mes, int di){
        Calendar c = Calendar.getInstance();
        c.set(anio, mes - 1, di);
        fechafin = c.getTime();
    }

    @Override
    public void deposito(double mon) {
        Date now = new Date();
        
        if( fechafin.after(now))
            super.deposito(mon);
    }
    
    
}
