/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TG1;

/**
 *
 * @author Gotcha
 */
public class BarcoPesquero extends Barco{
    private int pecesCapturados;
    public static double PRECIO_X_PESCADO = 80.99;
    
    public BarcoPesquero(String n){
        super(n);
        pecesCapturados = 0;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("peces Capturados=" + pecesCapturados);
    }
    
    @Override
    public void agregarElemento(){
        pecesCapturados++;
    }
    
    @Override
    public double vaciarCobrar(){
        double tot = pecesCapturados * PRECIO_X_PESCADO;
        pecesCapturados = 0;
        return tot;
    }
}
