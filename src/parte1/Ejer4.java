package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		// Variable para guardar la frase.
		String frase = "";
		
		// Frase dada la vuelta.
		String newFrase = "";
		
		// Indico al usuario y recojo la frase
		System.out.println("dime una frase y le daré la vuelta");
		frase = sc.nextLine();
		
		// Le doy el valor que me devuelve la función (la frase dada la vuelta)-
		// a la variable que contendrá esa nueva frase.
		newFrase = darVueta(frase);
		
		// Imprimo la nueva frase
		System.out.println(newFrase);
		
		// Cierro uso de escaner
		sc.close();
	}

	// Función que le va a dar la vuelta a la frase
	private static String darVueta(String frase) {
		
		// Tabla que va a contener cada letra de la frase
		char fraseLetras[];
		
		// Doy valor a la tabla con las letras de la frase
		fraseLetras = frase.toCharArray();
		
		// Inicializo la frase
		String newFrase = "";
		
		// Cojo la longitud máxima de la frase
		int max = fraseLetras.length;
		--max;
		
		// Recorro la tabla con i y le voy asignando cada caracter a la nueva frase-
		// desde el ultimo al primero.
		for (int i = max; i >= 0; i--) {
			newFrase += fraseLetras[i];
		}
		
		// Devuelvo la nueva frase dada la vuelta
		return newFrase;
	}

}
