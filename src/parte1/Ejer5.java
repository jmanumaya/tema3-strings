package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Variable que va a almacenar la palabra introducida
		String palabra = "";
		
		// Variable que va a almacenar la frase.
		String frase = "";
		
		// Indico al usuario.
		System.out.println("Introduce palabras y formaré la frase");
		
		// Pido la palabra
		System.out.print("palabra: ");
		palabra = sc.next();
		sc.nextLine();
		
		// Bucle para pedir palabras siempre que no indique fin
		while (!palabra.equalsIgnoreCase("fin")) {
		
			// la asigno a frase la nueva palabra introducida y luego un espacio
			frase += palabra; 
			frase += " ";
			
			// Vuelvo a pedir una nueva palabra
			System.out.print("palabra: ");
			palabra = sc.next();
			sc.nextLine();
			
		}
		
		// Imprimo la frase formada
		System.out.println(frase);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
