/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P1;

import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class Plan {
    protected int numero;
    protected String cliente;
    protected Date creacion;

    public Plan(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        creacion = new Date();
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getCreacion() {
        return creacion;
    }
    
    public double pagoMensual(int mins, int msgs){
        return 0;
    }
    
    public void imprimir(){
        System.out.println("Num: " + numero + 
                "clie: " + cliente + " crea: " + creacion);
         
    }
    
    
}
