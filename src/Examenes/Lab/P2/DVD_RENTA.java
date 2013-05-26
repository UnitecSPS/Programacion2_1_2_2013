/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P2;

import java.util.ArrayList;
import java.util.Scanner;


public class DVD_RENTA extends ITEMRenta {
    public StatusMovie status;
    public ArrayList<String> actores;
    private Scanner  lea = new Scanner(System.in);
    
    
    public DVD_RENTA(String n, int c, int co){
        super(n, c , co);
        status = StatusMovie.ESTRENO;
        actores = new ArrayList<>();
    }
    
    public final void setStatusMovie(String stat){
        status = StatusMovie.valueOf(stat);
    }
    
    public void ingresarActor(String name){
        actores.add(name); 
    }
    
    @Override
    public double generarRenta(int dias) {
       double total =status.getPrecio();
       
       if(dias > 2)
           total += status.getPrecio() * 0.8 * (dias-2);
       
       copias--;
       return total;
    }

    @Override
    public TipoItem getTipoItem() {
        return TipoItem.DVD;
    }
    
    public void listarActores(){
        for(String a: actores){
            System.out.println("Nombre del Actor: "+ a);
        }
    }

    @Override
    public String toString() {
      String acts = "";
      for(String a: actores){
        acts += " " + a;
      }
      
      return super.toString() + " Status: " + status + acts;
    }
    
    
    
}
