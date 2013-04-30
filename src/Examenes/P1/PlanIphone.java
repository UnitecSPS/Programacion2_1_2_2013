/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P1;

/**
 *
 * @author Gotcha
 */
public class PlanIphone extends Plan {
    private String email;
    
    public PlanIphone(int n, String s, String em){
        super(n,s);
        email = em;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public double pagoMensual(int mins, int msgs) {
        return (20*22) + (mins*20) + (msgs * 5);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Em: " + email);
    }
    
    
    
    
}
