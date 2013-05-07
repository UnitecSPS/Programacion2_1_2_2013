/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

/**
 *
 * @author Gotcha
 */
public class WebServer extends InternetServer {
    private boolean tieneSSL;
    
    public WebServer(String d, boolean ssl){
        super(d);
        tieneSSL = ssl;
        
        if(tieneSSL)
            dominio = "https." + dominio;
    }

    public boolean isTieneSSL() {
        return tieneSSL;
    }

    @Override
    public void addRegistro(String key, Object contenido) {
        if( contenido instanceof String)
            super.addRegistro(key, contenido);
    }
    
    
}
