package parte1;

import java.util.Scanner;

public class Ejer6 {
	
	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde voy a guardar la frase
		String frase = "";
		
		Boolean res;
		
		// Pido la frase al user
		System.out.println("Dime una frase y te diré si es palíndroma: ");
		frase = sc.nextLine();
		
		res = esPalindroma(frase);
		
		if (res == true) {
			System.out.println("Es palindroma");
		} else {
			System.out.println("No es palindroma");
		}
		
	}

	private static Boolean esPalindroma(String frase) {
		
		Boolean res;
		
		String fraseSinEspacios = frase.replace(" ", "");
		String fraseVuelta = darVuelta(fraseSinEspacios);
		
		res = frase.equals(fraseVuelta);
		
		return res;
	}
	
	// Función que le va a dar la vuelta a la frase
	private static String darVuelta(String frase) {
		
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
