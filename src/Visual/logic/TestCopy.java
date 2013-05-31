/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual.logic;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.*;
/**
 *
 * @author Gotcha
 */
public class TestCopy {
    public static File copyFile(File original,String folder){
        try{
            String dest = folder + "/" + original.getName();
            File destino = new File(dest);

            Path source = original.toPath();
            Path target = destino.toPath();

            Files.copy(source, target, REPLACE_EXISTING);
            
            return destino;
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return null;
    }
}
