/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P1;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class PlanBackberry extends Plan{
    private ArrayList<String> bbm;
    private String pin;
    
    public PlanBackberry(int n, String s, String p){
        super(n,s);
        bbm = new ArrayList<>();
        pin = p;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public double pagoMensual(int mins, int msgs) {
        int tot = 40 * 20;
        if( mins > 200)
            tot += (mins-200)*15;
        if( msgs > 300 )
            tot += (msgs-300)*8;
        return tot;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("pin: " + pin);
    }
    
    public void addPinAmigo(String pamigo){
        if( !bbm.contains(pamigo) ){
            bbm.add(pamigo);
        }
    }
}
