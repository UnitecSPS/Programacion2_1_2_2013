/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.P2;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class UberSocial {
    static ArrayList<SocialClass> redes;
    
    public static void main(String[] args) {
        redes = new ArrayList<>();
    }
    
    static SocialClass buscar(String user, TipoCuenta tc){
        for(SocialClass sc : redes){
            if( sc.username.equals(user)){
                if( sc instanceof Facebook && tc == TipoCuenta.FACEBOOK ||
                    sc instanceof Twitter && tc == TipoCuenta.TWITTER){
                    
                    return sc;
                }
            }
        }
        return null;
    }
    
    static void agregarCuenta(String user, TipoCuenta tc){
        SocialClass sc = buscar(user, tc);
        
        if( sc == null ){
            switch(tc){
                case FACEBOOK:
                    redes.add(new Facebook(user));
                    break;
                case TWITTER:
                    redes.add(new Twitter(user));
            }
        }
    }
    
    static void agregarAmigo(String u1, String u2, TipoCuenta tc){
        SocialClass user1 = buscar(u1, tc);
        SocialClass user2 = buscar(u2, tc);
        
        try{
            if( user1 != null && user2 != null ){
                user1.addFriend(u2);

                if( tc == TipoCuenta.FACEBOOK )
                    user2.addFriend(u1);
            }
        }
        catch(FriendExistException e){
            System.out.println(e.getMessage());
        }
    }
    
    static void agregarComentario(String user, int postid, String msg)
            throws NoPostException{
        
        SocialClass u = buscar(user, TipoCuenta.FACEBOOK);
        
        if( u != null )
            ((Facebook)u).addComment(postid, msg);
    }
    
    static void agregarPost(String username, String post, TipoCuenta tc){
        SocialClass user = buscar(username, tc);
        if( user != null )
            user.crearPost(post);
    }
}
