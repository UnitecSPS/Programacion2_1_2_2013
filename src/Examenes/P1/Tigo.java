/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Tigo {
    static ArrayList<Plan> planes;
    
    public static void main(String[] args) {
        planes = new ArrayList<>();
    }
    
    public static boolean busqueda(int nt, String de){
        return busqueda(nt, de, 0);
    }
    
    private static boolean busqueda(int nt, String de, int pos) {
        if( pos < planes.size() ){
            Plan p = planes.get(pos);
            
            if( p.getNumero() == nt )
                return true;
            
            if( p instanceof PlanIphone ){
                if( ((PlanIphone)p).getEmail().equals(de) )
                    return true;
            }
            else if( p instanceof PlanBackberry ){
                if( ((PlanBackberry)p).getPin().equals(de))
                    return true;
            }
            
            return busqueda(nt,de,pos+1);
        }
        return false;
    }
    
    public static void addPlan(int nt, String no, String tipo){
        Scanner lea = new Scanner(System.in);
        
        if( tipo.equals("IPHONE")){
            String em = lea.next();
            
            if( !busqueda(nt,em) )
                planes.add(new PlanIphone(nt,no, em));
        }
        else if(tipo.equals("BLACKBERRY")){
            String pin = lea.next();
            
            if(!busqueda(nt,pin))
                planes.add(new PlanBackberry(nt, no, pin));
        }
            
    }

    public static double pagoPlan(int nt, int mins, int msgs){
        for(Plan p : planes){
            if(p.getNumero()==nt)
                return p.pagoMensual(mins, msgs);
        }
        return 0;
    }
    
    public static void addAmigo(int nt, String pin){
        for(Plan p : planes){
            if(p.getNumero() == nt){
                if( p instanceof PlanBackberry ){
                    ((PlanBackberry)p).addPinAmigo(pin);
                    break;
                }
            }
        }
    }
    
    public static void implista(){
        for(Plan p : planes)
            p.imprimir();
    }
}
