package parte1;

import java.util.Scanner;

public class Ejer6 {
	
	public static void main(String[] args) {
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Declaro una variable para almacenar la frase ingresada por el usuario.
		String frase = "";
		
		// Variable booleana donde guardaré el resultado de la comprobación.
		Boolean res;
		
		// Solicito al usuario que introduzca una frase.
		System.out.println("Dime una frase y te diré si es palíndroma: ");
		frase = sc.nextLine();
		
		// Llamo a la función esPalindroma para verificar si la frase lo es.
		res = esPalindroma(frase);
		
		// Compruebo el resultado y muestro el mensaje correspondiente.
		if (res) {
			System.out.println("Es palíndroma");
		} else {
			System.out.println("No es palíndroma");
		}
		
		// Cierro el escaner.
		sc.close();
	}

	// Función que verifica si una frase es palíndroma
	private static Boolean esPalindroma(String frase) {
		
		// Quito los espacios de la frase para hacer la comparación correctamente
		String fraseSinEspacios = frase.replace(" ", "").toLowerCase();
		
		// Obtengo la frase invertida llamando a la función darVuelta
		String fraseVuelta = darVuelta(fraseSinEspacios);
		
		// Comparo la frase original (sin espacios) con su versión invertida
		return fraseSinEspacios.equals(fraseVuelta);
	}
	
	// Función que invierte una frase
	private static String darVuelta(String frase) {
		
		// Convierto la frase en un array de caracteres
		char fraseLetras[] = frase.toCharArray();
		
		// Inicializo una variable para construir la frase invertida
		String newFrase = "";
		
		// Recorro el array desde el último carácter hasta el primero
		for (int i = fraseLetras.length - 1; i >= 0; i--) {
			// Añado cada carácter al resultado
			newFrase += fraseLetras[i];
		}
		
		// Devuelvo la frase invertida
		return newFrase;
	}
}
