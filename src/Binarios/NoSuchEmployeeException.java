/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Binarios;

/**
 *
 * @author Gotcha
 */
public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(int cod){
        super("Empleado " + cod + " No existe");
    }
}
