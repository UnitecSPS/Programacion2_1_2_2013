/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual.Basico;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * 
 * @author Gotcha
 */
public class MiFiltro extends FileFilter {
    
    String types[] ={ "jpeg", "gif", "png", "bmp", "jpg" };
    
    @Override
    public boolean accept(File f) {
        
        if( f.isDirectory() )
            return true;
        
        String ext = "";
        int pos = f.getName().lastIndexOf(".");
        if( pos > 0 ){
            ext = f.getName().substring(pos+1).toLowerCase();
            System.out.println("EXT: " + ext);
            for(String ex : types){
                if( ex.equals(ext))
                    return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Escoja una imagen.";
    }
    
}
