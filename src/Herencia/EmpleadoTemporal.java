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
public final class EmpleadoTemporal extends Empleado{
    private Date fechafin;

    @Override
    public void quienSoy() {
        super.quienSoy();
        System.out.println("DE TIPO TEMPORAL");
    }

    public void setFechaFin(int y, int m, int d){
        Calendar c = Calendar.getInstance();
        c.set(y, m - 1, d);
        fechafin = c.getTime();
    }
    
    @Override
    public double pagar() {
        Date now = new Date();
        if( now.before(fechafin) )
            return super.pagar();
        return 0;
    }
    
    public EmpleadoTemporal(int c, String n, double s){
        super(c,n,s);
    }
    
    
}
