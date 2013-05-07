/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class InternetServer {
    protected String dominio;
    protected ArrayList<Registro> regs;
    
    public InternetServer(String d){
        dominio = d;
        regs = new ArrayList<>();
    }

    public String getDominio() {
        return dominio;
    }
   
    public Object devolverPeticion(String key){
        for(Registro reg : regs){
            if( key.equals(reg.getKey()))
                return reg.getContenido();
        }
        return null;
    }
    
    public void imprimir(){
        System.out.println("Dominio: " + dominio);
        imprimir(0);
    }

    private void imprimir(int pos) {
        if( pos < regs.size() ){
            Registro reg = regs.get(pos);
            
            System.out.println(reg.getKey() + "\n------------\n");
            System.out.println(reg.getContenido());
        }
    }
    
    public void addRegistro(String key, Object contenido){
        Object cont = devolverPeticion(key);
        if( cont == null )
            regs.add(new Registro(key, contenido));
    }
}
