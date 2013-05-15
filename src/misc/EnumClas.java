/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class EnumClas {
    
    static final int PATITO = 4;
    static final int POLLITO = 5;
    
    public static void main(String[] args) {
        TipoMusica x = TipoMusica.RANCHERA;
        System.out.println("x: " + x.ordinal());
        int y = Calendar.JANUARY;
        
        int z = PATITO;
        
        switch(z){
            case PATITO:
                break;
        }
        
        Scanner lea = new Scanner(System.in);
        TipoMusica tm;
        
        tm = TipoMusica.valueOf(lea.next());
        
        System.out.println("TM: " + tm);
        
        switch(tm){
            case RANCHERA:
                
                //
            case POP:
                //
                
        }
    }
}
