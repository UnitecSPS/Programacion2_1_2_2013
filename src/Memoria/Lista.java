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
    
    public void print(){
        Nodo rec = inicio;
        
        while(rec    != null){
            rec.print();
            rec = rec.sigte;
        }
    }
    
    public void addInTheMiddle(Nodo obj, String dato){
        Nodo antes = search(dato);
        
        if( antes != null ){
            obj.sigte = antes.sigte;
            antes.sigte = obj;
        }
    }

    public Nodo search(String dato) {
        Nodo rec = inicio;
        
        while(rec != null){
            if( rec.dato.equals(dato))
               return rec;
            rec = rec.sigte;
        }
        return null;
    }
    
    public void remove(String dato){
        if( inicio != null ){
            if( inicio.dato.equals(dato)){
                inicio = inicio.sigte;
            }
            else{
                Nodo rec = inicio;
                
                while(rec.sigte != null){
                    if(rec.sigte.dato.equals(dato)){
                        rec.sigte = rec.sigte.sigte;
                        break;
                    }
                    else
                        rec = rec.sigte;
                }
            }
        }
    }
}
