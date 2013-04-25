/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 * 
 */
public class Empleado extends Trabajador {
    protected double salario;
    
    public Empleado(int n, String no, double sal){
        super(n,no);
        this.salario=sal;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void quienSoy() {
        super.quienSoy();
        System.out.println("DE TIPO EMPLEADO");
    }
    
    @Override
    public double pagar(){
        return salario;
    }
    
    
}
