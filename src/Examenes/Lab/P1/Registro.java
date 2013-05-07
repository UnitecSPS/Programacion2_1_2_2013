/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

/**
 *
 * @author Gotcha
 */
public class Registro {
    private String key;
    private Object contenido;

    public Registro(String key, Object contenido) {
        this.key = key;
        this.contenido = contenido;
    }

    public String getKey() {
        return key;
    }

    public Object getContenido() {
        return contenido;
    }
    
    
}
