/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual.logic;

/**
 *
 * @author Gotcha
 */
public class Superman extends Superheroe {
    
    public Superman(){
        super("Soy el hombre de hierro",
                "src/Images/superman.jpg");
    }
    
    @Override
    public void ataque() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getVillanos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
