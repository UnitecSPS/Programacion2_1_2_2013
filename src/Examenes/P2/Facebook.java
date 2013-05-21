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
public class Facebook extends SocialClass implements iComment{

    ArrayList<Comment> cms;
    
    public Facebook(String u){
        super(u);
        cms = new ArrayList<>();
    }
    
    @Override
    public void viewMyInfo() {
        System.out.println(username);
        
        for(int p=0; p < posts.size(); p++){
            System.out.println(posts.get(p));
            for(Comment cm : cms){
                if(cm.postId == p){
                    System.out.println(cm.msg);
                }
            }
        }
    }

    @Override
    public boolean addComment(int postId, String msg) throws NoPostException {
        if( postId >= 0 && postId < posts.size() ){
            cms.add( new Comment(postId, msg));
            return true;
        }
        else{
            throw new NoPostException();
        }
    }
    
}
