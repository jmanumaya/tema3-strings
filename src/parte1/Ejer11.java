package parte1;

import java.util.Scanner;

public class Ejer11 {
	
public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde almacenaré la palabra o frase original
		String original = "";
		
		// Variable que va a contener cada caracter a decodificar.
		char c;
		
		// Variable donde almacenaré la palabra o frase decodificada
		String decodificada = "";
		
		// Conjuntos para decodificar.
		char[] conjunto1 = {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] conjunto2 = {'p','v','i','u','m','t','e','r','k','q','s'};
		
		// Pido al usuario que me de la frase o palabra.
		System.out.print("Dime la Frase o Palabra: ");
		original = sc.nextLine().toLowerCase();
		
		// For para recorrer todos los caracteres de la frase o palabra y llamar a la función para decodificarlo
		for(int i = 0; i < original.length(); i++) {
			c = original.charAt(i);
			decodificada += decodificar(conjunto1, conjunto2, c);
		}
		
		// Imprimo la frase o palabra ya decodificada
		System.out.println(decodificada);
		
		// Cierro uso de escaner.
		sc.close();
	}

	// Función que va a decodificar cada caracter de la palabra o frase que le asignemos.
	private static char decodificar(char[] conjunto1, char[] conjunto2, char c) {
		
		// Caracter decodificado o no.
		char caracterDecodificado = c;
		
		// Variable que va a hacer las veces de contador.
		int cont = 0;
		
		// Variable que va a hacer las veces de salida directa.
		boolean encontrado = false;
		
		// While para buscar el caracter en el cojunto y decodificarlo si procede (salimos cuando lo haga).
		while (cont < conjunto2.length && !encontrado) {
			
			if (c == conjunto2[cont]) {
				caracterDecodificado = conjunto1[cont];
				encontrado = true;
			}
			
			++cont;
		}
		
		// Devuelvo el caracter.
		return caracterDecodificado;
	}

}
