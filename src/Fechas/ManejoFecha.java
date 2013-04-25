/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import Herencia.Empleado;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class ManejoFecha {
    public static void main(String[] args) {
        
        Empleado e = new Empleado(1,"ss");
        
        
        
        //actual
        Date now = new Date();
        //procesoo--------------
        for(int x=0;x<1000000;x++){
            System.out.println("Debo Aprender a usas las fechas");
        }
        Date now2 = new Date();
        
        long diff = now2.getTime() - now.getTime();
        System.out.println("Diff: " + (diff/1000));
        System.out.println("Fecha: " + now);
        System.out.println("Fecha: " + now2);
        
        //milis
        if( now2.getTime() >= now.getTime() )
            System.out.println("FECHA 2 PASO DESPUES QUE LA 1");
        else
            System.out.println("LA FECHA 1 PASO DESPUES QUE LA 2");
        
        
        if( now2.after(now)  )
            System.out.println("FECHA 2 PASO DESPUES QUE LA 1");
        else
            System.out.println("LA FECHA 1 PASO DESPUES QUE LA 2");
        
        if( now2.compareTo(now) >= 0 )
            System.out.println("La fecha 2 es igual o paso antes que la 1");
        
        
        
        
    }
}
