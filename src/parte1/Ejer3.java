package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		// Variable que va a contener la frase introducida
		String frase = "";
		
		// Variable que va a contener la respuesta dada por la función.
		int cont;
		
		// Indico al usuario y recojo la frase.
		System.out.println("Dame una frase y te diré cuantos espacios tiene:");
		frase = sc.nextLine();
		
		// Doy valor a contador con los espacios encontrados en la función
		cont = contarEspacios(frase);

		// Imprimo el resultado al usuario.
		System.out.println("La frase:\n" + frase + "\nTiene " + cont + " espacios.");
		
		// Cierro uso de escaner.
		sc.close();
	}

	private static int contarEspacios(String frase) {
		
		// Variable para contar los espacios que se encuentran
		int cont = 0;
		
		// Variable para almacenar la primera posicion encontrada
		int pos1;
		
		// Variable para actualizar desde que posición buscar el espacio
		int pos2 = 0;
		
		// Variable para salir cuando se encuentren todos los espacios
		int salir = 0;

		// Bucle while para buscar los espacios hasta que no se encuentren mas
		while(salir != -1) {
			
			// Busco los espacios desde la última posicion encontrada (comienza en 0)
			pos1 = frase.indexOf(" ", pos2);
			
			// Si encuentra alguno se incrementa contador y se actualiza la posición-
			// desde la que se comienza a buscar en la siguiente vuelta
			// (lo incremento porque quiero empezar a buscar desde el siguiente del-
			// espacio)
			if (pos1 != -1) {
				++cont;
				pos2 = pos1;
				++pos2;
			// Si no encuentra pues le doy valor a salir para no hacer de nuevo el bucle
			} else {
				salir = -1;
			}
		}
		
		// Devuelvo el valor de contador.
		return cont;
	}

}
