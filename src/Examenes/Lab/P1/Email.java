/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

/**
 *
 * @author Gotcha
 */
public class Email {
    private String from, subject, content;
    
    public Email(String f, String s, String c){
        from = f;
        subject = s;
        content = c;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
    
    public void imprimir(){
        System.out.println("From:<" + from + ">");
        System.out.println("Subject: " + subject);
        System.out.println("\n-----------------");
        System.out.println(content + "\n");
    }
}
