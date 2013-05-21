/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P2;

public class FriendExistException extends RuntimeException{
    public FriendExistException(){
        super("Amigo ya existe!");
    }
}
