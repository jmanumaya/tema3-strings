package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		// creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Tabla que va a contener las palabras de la frase
		String[] palabras;
		
		// String que guardará la frase dada por el user
		String frase = "";
		
		// Pido una frase y la guardo en "frase" pasada a minuscula
		System.out.println("Dime una frase: ");
		frase = sc.nextLine().toLowerCase();
		
		// Voy guardando en la tabla palabra la frase spliteada por los espacios
		palabras = frase.split(" ");
		
		// Ordeno el array
		Arrays.sort(palabras);
		
		// Muestro cada palabra del array ya ordenada separadas por un espacio
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
