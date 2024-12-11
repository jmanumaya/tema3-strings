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
		
		// Variable que contendrá la longitud de la primera frase.
		int long1;
		
		// Variable que contendrá la longitud de la segunda frase.
		int long2;
		
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
		
		// Guardo en su respectiva variable la longitud de cada frase
		long1 = frase1.length();
		long2 = frase2.length();
		
		// Comparo las longitudes y segun el caso imprimo una respuesta u otra
		if (long1 == long2) {
			System.out.println("Las frases son de igual tamaño.");
		} else if (long1 > long2) {
			System.out.println("La primera frase es de mayor tamaño");
		} else {
			System.out.println("La segunda frase es de mayor tamaño");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
