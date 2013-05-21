/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P2;

/**
 *
 * @author Gotcha
 */
public interface iComment {
    boolean addComment(int postId, String msg)throws NoPostException;
}
