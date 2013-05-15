/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual.logic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Gotcha
 */
public abstract class Superheroe extends JLabel{
    protected String skill;
    public String picFileName;
    
    public Superheroe(String sk, String pic){
        super(new ImageIcon(pic));
        skill = sk;
        picFileName = pic;
    }
    public abstract void ataque();
    public abstract String[] getVillanos();
}
