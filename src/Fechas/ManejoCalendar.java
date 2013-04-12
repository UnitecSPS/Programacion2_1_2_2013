/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class ManejoCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        c.set(1982, Calendar.AUGUST, 10);
        System.out.println("cal: " + c.getTime());
        
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int dia_year = c.get(Calendar.DAY_OF_YEAR);
        int semana = c.get(Calendar.WEEK_OF_YEAR);
        
        System.out.println("Dia: " + dia + " dia year: " + dia_year+
                " semana#: " + semana);
        
        Calendar n = Calendar.getInstance();
        int edad = n.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        System.out.println("Edad: " + edad);
        
        n.add(Calendar.DATE, -3);
        System.out.println("3 dias despues: " + n.getTime());
        
        
    }
}
