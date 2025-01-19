package parte1;

import java.util.Scanner;

public class Ejer18 {
	
	public static void main(String[] args) {
	    	
	    	// Creo el escaner.
	    	Scanner sc = new Scanner(System.in);
	    	
	        // Variables que contendran el titulo y el contenido...
	        String titulo = "";
	        String contenido = "";
	        
	        // Pido el titulo de la pagina.
	        System.err.print("Indicame el titulo de la pagina: ");
	        titulo = sc.nextLine();
	        
	        // Pido el contenido de la pagina.
	        System.err.print("Indicame el contenido de la pagina: ");
	        contenido = sc.nextLine();
	        
	        // genero el html con la funcion...
	        String html = generarHTML(titulo, contenido);
	
	        // Muestro el resultado
	        System.out.println(html);
	        
	        // Cierro uso de escaner.
	        sc.close();
	    }
	
	// Funcion que va a generar un codigo html con los parametros de titulo y contenido que se le pase...
    public static String generarHTML(String titulo, String contenido) {
    	
        // Construimos el código HTML como una cadena
        String html = "<!DOCTYPE html>\n" +
                      "<html>\n" +
                      "    <head>\n" +
                      "        <title>" + titulo + "</title>\n" +
                      "    </head>\n" +
                      "    <body>\n" +
                      "        <h1>" + titulo + "</h1>\n" +
                      "        <p>" + contenido + "</p>\n" +
                      "    </body>\n" +
                      "</html>";
        
        // Devuelvo el codigo html generado
        return html;
        
    }
}

