package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde almacenaré la palabra o frase original
		String original = "";
		
		// Variable que va a contener cada caracter a codificar.
		char c;
		
		// Variable donde almacenaré la palabra o frase codificada
		String codificada = "";
		
		// Conjuntos para codificar.
		char[] conjunto1 = {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] conjunto2 = {'p','v','i','u','m','t','e','r','k','q','s'};
		
		// Pido al usuario que me de la frase o palabra.
		System.out.print("Dime la Frase o Palabra: ");
		original = sc.nextLine().toLowerCase();
		
		// For para recorrer todos los caracteres de la frase o palabra y llamar a la función para codificarlo
		for(int i = 0; i < original.length(); i++) {
			c = original.charAt(i);
			codificada += codificar(conjunto1, conjunto2, c);
		}
		
		// Imprimo la frase o palabra ya codificada
		System.out.println(codificada);
		
		// Cierro uso de escaner.
		sc.close();
	}

	// Función que va a codificar cada caracter de la palabra o frase que le asignemos.
	private static String codificar(char[] conjunto1, char[] conjunto2, char c) {
		
		// Caracter Codificado.
		char caracterCodificado = ' ';
		
		// Asigno el caracter codificado a una cadena para poder devolverlo
		String codificadoReturn = "";
		
		// Variable que va a hacer las veces de contador.
		int cont = 0;
		
		// While para buscar el caracter en el cojunto y codificarlo si procede (salimos cuando lo haga).
		while (cont < conjunto1.length) {
			
			if (c == conjunto1[cont]) {
				caracterCodificado = conjunto2[cont];
				cont = conjunto1.length;
			} else {
				caracterCodificado = c;
				++cont;
			}
		}
		
		// Le asigno el caracter al string
		codificadoReturn += caracterCodificado;
		
		// Devuelvo el caracter.
		return codificadoReturn;
	}

}
