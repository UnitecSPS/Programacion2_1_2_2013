/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author Gotcha
 */
public enum AnchoBanda {
    A256(10), A512(25), A1(45), A2(60);

    int precio;
    private AnchoBanda(int p){
        precio = p;
    }
    
    public int getPrecio(){
        return precio;
    }
}
