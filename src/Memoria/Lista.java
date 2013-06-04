/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class Lista {
    private Nodo inicio = null;
    
    public void add(Nodo obj){
       
        if( inicio == null ){
            inicio = obj;
        }
        else{
            Nodo rec = inicio;
            
            while(rec.sigte != null){
                rec = rec.sigte;
            }
            
            rec.sigte = obj;
        }
    }
}
