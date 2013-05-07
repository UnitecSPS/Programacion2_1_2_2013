/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class SMTPServer extends InternetServer{
    
    public SMTPServer(String d){
        super(d);
    }

    @Override
    public void imprimir() {
        System.out.println("Mailboxs\n-------");
        for(Registro reg : regs){
            System.out.println("-" + reg.getKey());
        }
    }

    
    
    @Override
    public void addRegistro(String key, Object contenido) {
        ArrayList<Email> mails = new ArrayList<>();
        super.addRegistro(key, mails);
    }
    
    public void verInbox(String mailbox){
        Object mails = devolverPeticion(mailbox);
        
        if( mails != null ){
            
            System.out.println("INBOX de: " + mailbox);
            ArrayList<Email> inbox = (ArrayList<Email>)mails;
            
            for(int pos = inbox.size() - 1; pos >= 0; pos--){
                inbox.get(pos).imprimir();
            }
        }
        else
            System.out.println("NO EXISTE DICHO MAILBOX: " + mailbox);
    }
    
    public void gotMail(String mailbox, Email email){
        Object mails = devolverPeticion(mailbox);
        
        if( mails != null ){
            ArrayList<Email> inbox = (ArrayList<Email>)mails;
            inbox.add(email);
            System.out.println(mailbox + " you got mail\n");
        }
    }
}
