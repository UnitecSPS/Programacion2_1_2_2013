/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P2;

/**
 *
 * @author Gotcha
 */
public class Twitter extends SocialClass {
    public Twitter(String u){
        super(u);
    }

    @Override
    public void viewMyInfo() {
        for(String post : posts){
            System.out.println(post);
        }
    }
    
    
}
