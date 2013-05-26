/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class MiFile {
    private File file = null;
    
    public void setFile(String pathname){
        file = new File(pathname);
    }
    
    public void viewInfo(){
        try{
            if( file.exists() ){
                System.out.println("Nombre: " + file.getName());
                System.out.println("Absoluta: " + file.getAbsolutePath());
                System.out.println("Path: " + file.getPath());
                System.out.println("Bytes: "  + file.length());
                
                if(file.isDirectory())
                    System.out.println("Es un Directorio");
                if(file.isFile())
                    System.out.println("Es un Archivo");
                if(file.isHidden())
                    System.out.println("Esta escondido");
                if(file.isAbsolute())
                    System.out.println("Esta utilizando una dir absoluta");
                
                Date ultima = new Date(file.lastModified());
                System.out.println("Ultima Modificacion: " + ultima);
                
            }
            else
                System.out.println("LO QUE USTED MANEJA NO EXISTE");
        }
        catch(NullPointerException e){
            System.out.println("CONFIGURE UN ARCHIVO PRIMERO");
        }
    }
    
    public boolean createFile()throws IOException{
        try{
            return file.createNewFile();
        }
        catch(NullPointerException e){
            System.out.println("CONFIGURE UN ARCHIVO PRIMERO");
        }
        
        return false;
    }
    
    public boolean createFolder(){
        try{
            return file.mkdirs();
            
            
        }
        catch(NullPointerException e){
            System.out.println("CONFIGURE UN ARCHIVO PRIMERO");
        }
        
        return false;
    }
    
    public boolean delete(){
        try{
            return file.delete();
        }
        catch(NullPointerException e){
            System.out.println("CONFIGURE UN ARCHIVO PRIMERO");
        }
        
        return false;
    }
    
    public void dir(){
        try{
            if(  file.isDirectory() ){
                File files[] = file.listFiles();
                int cf = 0, cd = 0, cb = 0;
                
                for(File fi : files){
                    if( !fi.isHidden() ){
                        //fecha
                        Date fech = new Date(fi.lastModified());
                        System.out.print(fech + "\t");

                        //file o folder
                        if(fi.isDirectory()){
                            System.out.print("<DIR>\t");
                            cd++;
                        }

                        if(fi.isFile()){
                            System.out.print("     \t");
                            System.out.print(fi.length() + " ");
                            cb += fi.length();
                            cf++;
                        }

                        //nombre
                        System.out.println(fi.getName());
                    }
                }
                System.out.println(cf + " File(s)\t" + cb + " bytes");
                System.out.println(cd + " Dir(s)\t" + file.getFreeSpace() 
                        + " bytes");
            }
        }
        catch(NullPointerException e){
            System.out.println("CONFIGURE UN ARCHIVO PRIMERO");
        }
        
    }
}
