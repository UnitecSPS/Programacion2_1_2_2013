/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Lab.P1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class WorldWideWeb {
    static ArrayList<InternetServer> servers;
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        servers = new ArrayList<>();
        
        int op;
        
        do{
            System.out.println("\n\n1-Agregar Server");
            System.out.println("2-Agregar Web");
            System.out.println("3-Agregar Correo");
            System.out.println("4-Mandar Correo");
            System.out.println("5-Navegador");
            System.out.println("6-Ver Mi Inbox");
            System.out.println("7-Ver Detalle Servidor");
            System.out.println("8- Salir");
            System.out.print("\nEscoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("Dominio: ");
                    String dom = lea.next();
                    System.out.print("Tipo (WEB o MAIL): ");
                    String tipo = lea.next();
                    
                    addServer(dom, tipo);
                    break;
                case 2:
                    System.out.print("Dominio de Servidor: ");
                    dom = lea.next();
                    
                    agregarPaginaWeb(dom);
                    break;
                case 3:
                    System.out.print("Correo deseado: ");
                    String correo = lea.next();
                    
                    agregarCorreo(correo);
                    break;
                case 4:
                    System.out.print("Tu Correo: ");
                    String from = lea.next();
                    System.out.print("To: ");
                    String to = lea.next();
                    
                    mandarCorreo(from, to);
                    break;
                case 5:
                    System.out.print("URL: ");
                    String url = lea.next();
                    
                    navegador(url);
                    break;
                case 6:
                    System.out.print("Mailbox: ");
                    String mailbox = lea.next();
                    
                    verInbox(mailbox);
                    break;
                case 7:
                    System.out.print("Dominio: ");
                    dom = lea.next();
                    System.out.print("Tipo (WEB o MAIL): ");
                    tipo = lea.next();
                    
                    verDetalleServer(dom, tipo);
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION CORRECTA");
            }
        }while(op!=8);
    }

    private static InternetServer busqueda(String dom, String tipo){
        for(InternetServer is : servers){
            if( tipo.equals("WEB") && is instanceof WebServer ||
                tipo.equals("MAIL") && is instanceof SMTPServer){
                
                if( is.getDominio().equals(dom) )
                    return is;
            }
        }
        return null;
    }
    
    private static void addServer(String dom, String tipo) {
        if( busqueda(dom, tipo) == null ){
            if( tipo.equals("WEB") ){
                System.out.println("Es con SSL? (s/n): ");
                char ssl = lea.next().charAt(0);
                
                servers.add( new WebServer(dom, ssl == 's' ? true : false));
            }
            else if( tipo.equals("MAIL")){
                servers.add( new SMTPServer(dom) );
            }
            else{
                System.out.println("TIPO INCORRECTO");
            }
        }
        else
            System.out.println("YA EXISTE DICHO DOMINIO");
    }

    private static void agregarPaginaWeb(String dom) {
        InternetServer server = busqueda(dom, "WEB" );
        
        if( server != null ){
            System.out.print("URL: ");
            String url = lea.next();
            System.out.print("Contenido: ");
            String content = lea.next();
            
            server.addRegistro(url, content);
        }
    }

    private static void mandarCorreo(String from, String to) {
        String datos[] = to.split("@");
        
        if( datos.length == 2 ){
            String dominioTo = datos[1];
            String mailboxTo = datos[0];
            
            InternetServer server = busqueda(dominioTo, "MAIL");
            
            if( server != null ){
                System.out.print("Subject: ");
                String subj = lea.next();
                System.out.print("Contenido: ");
                String content = lea.next();
                
                Email email = new Email(from, subj, content);
                
                ((SMTPServer)server).gotMail(mailboxTo, email);
            }
            else
                System.out.println("Servidor " + dominioTo + " no existe.");
        }
        else
            System.out.println("Correo TO es incorrecto");
    }

    private static void navegador(String url) {
        String datos[] = url.split("/");
        String dominio = datos[0];
        String urlPage;
        
        //no necesario en examen
        if( datos.length == 1 )
            urlPage = "index";
        else
            urlPage = datos[1];
        
        InternetServer server = busqueda(dominio, "WEB");
        
        if( server != null ){
            Object content = server.devolverPeticion(urlPage);
            
            if( content != null )
                System.out.println(content);
            else
                System.out.println("404 PAGE NOT FOUND");
        }
        else
            System.out.println("SERVER NOT FOUND");
    }

    private static void verInbox(String correo) {
        String datos[] = correo.split("@");
        
        if( datos.length == 2 ){
            String mailbox = datos[0];
            String dominio = datos[1];
            
            InternetServer server = busqueda(dominio, "MAIL");
            if( server != null ){
                ((SMTPServer)server).verInbox(mailbox);
            }
            else
                System.out.println("NO EXISTE EL SERVER " + dominio);
        }
        else
            System.out.println("CORREO INCORRECTO");
    }

    private static void verDetalleServer(String dom, String tipo) {
        InternetServer server = busqueda(dom, tipo);
        
        if( server!=null ){
            server.imprimir();
        }
        else
            System.out.println("NO EXISTE DICHO SERVIDOR");
    }

    private static void agregarCorreo(String correo) {
        String datos[] = correo.split("@");
        
        if( datos.length == 2 ){
            
            String mailbox = datos[0];
            String dominio = datos[1]; 
            
            InternetServer serv = busqueda(dominio, "MAIL");
            
            if( serv != null ){
                serv.addRegistro(mailbox, "");
            }
            else
                System.out.println(dominio + " NO EXISTE");
        }
        else
            System.out.println("CORREO INCORRECTO");
    }
}
