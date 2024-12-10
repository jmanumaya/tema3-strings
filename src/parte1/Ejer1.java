package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// String que contedrá la primera frase
		String frase1 = "";
		
		// String que contedrá la segunda frase
		String frase2 = "";
		
		// Variable que contendrá la respuesta de la comparacion de cadenas
		int respuesta;
		
		// Leo la primera frase
		System.out.println("Dime una frase:");
		frase1 = sc.nextLine();
		
		// Leo la segunda frase
		System.out.println("Dime otra frase:");
		frase2 = sc.nextLine();
		
		// Muestro las dos frases introducidas
		System.out.println("Frases Introducidas:");
		System.err.println(frase1);
		System.err.println(frase2);
		
		// Guardo en respuesta lo que me de al comparar la frase1 con la 2.
		// Si me da un negativo significa que la primera frase es menor que la segunda.
		// Si me da un positivo significa que la primera frase es mayor que la segunda.
		// Si me da un 0 significa que son las dos frases iguales.
		respuesta  = frase1.compareToIgnoreCase(frase2);
		
		// Compruebo con if si la respuesta es negativa, 0 o positiva-
		// para imprimir el resultado que corresponda.
		if (respuesta == 0) {
			System.out.println("Las frases son de igual tamaño.");
		} else if (respuesta > 0) {
			System.out.println("La primera frase es de mayor tamaño");
		} else {
			System.out.println("La segunda frase es de mayor tamaño");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
