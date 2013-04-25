/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class Empresa {
    public static void main(String[] args) {
        //upcasting
        Trabajador emp = new EmpleadoPorHora(1,"Carlos");
        emp.quienSoy();
        
        //downcasting indirecto
        EmpleadoPorHora eh = (EmpleadoPorHora)emp;
        eh.setHt(100);
        //downcasting directo
        ((EmpleadoPorHora)emp).setHt(70);
        
        System.out.println("Pagar: " + emp.pagar());
       
        //Object n = new Trabajador(1, "");
        if( emp instanceof Empleado ){
            System.out.println("SOY EMPLEADO!");
        }
        
        emp.nombre = "";
    }
}
