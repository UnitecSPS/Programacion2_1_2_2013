/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class Pepsi {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabs = new ArrayList<>();
        
        trabs.add(new Trabajador(1,"Carlos"));
        trabs.add(new Empleado(2,"Lilian",20000));
        trabs.add(new EmpleadoTemporal(3, "Jose", 5));
        trabs.add(new EmpleadoPorHora(4, "Marco"));
        
        for(Trabajador tt : trabs){

            if( tt instanceof EmpleadoTemporal )
                ((EmpleadoTemporal)tt).setFechaFin(2014,1,1);
            else if( tt instanceof EmpleadoPorHora)
                ((EmpleadoPorHora)tt).setHt(70);
            
            System.out.println("Pago de " + tt.nombre + 
                    " : Lps." + tt.pagar());
        }
    }
}
