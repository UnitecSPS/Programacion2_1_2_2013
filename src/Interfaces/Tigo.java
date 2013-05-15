/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class Tigo {
    public static void main(String[] args) {
        
        CellPhone sp = new BlackBerry(33, 112, "carlos",112);
        
        if( sp instanceof SmartDevice ){
            ((SmartDevice)sp).verCorreo();
        }
        
        ArrayList<SmartDevice> devices = new ArrayList<>();
        devices.add(new BlackBerry(1,2, null,3));
        devices.add(new iPhone(4, 5, null));
        devices.add(new PS3());
        System.out.println("DEVICES\n");
         
        for(SmartDevice sd : devices){
            sd.verCorreo();
        }
        System.out.println("\n\n");
       // sp.verCorreo();
        //sp.runApp();
        
        
        if( sp instanceof BlackBerry &&
            sp instanceof SmartDevice &&
            sp instanceof CellPhone){
            
            ((BlackBerry)sp).verCorreo();
            sp.mandarMsg("dsds");
            System.out.println("SI SOY TODO ESO!");
        }
        
        MultiplayerGame mg = new MultiplayerGame() {

            @Override
            public void username() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int maxusers() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}
