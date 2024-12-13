package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		// String donde va a ir la frase.
		String frase = "";
		
		// String donde va a ir la palabra a buscar
		String palabra = "";
		
		// Variable donde almacenaré el contador que me devuelva la función de contar.
		int cont;
		
		// Pido la frase
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();
		
		// Pido la palabra a buscar
		System.out.println("Ahora dime una palabra y te diré cuantas veces sale en la frase: ");
		palabra = sc.next();
		sc.nextLine();
		
		// Llamo a la funcion para almacenar el contador que me de en mi variable contador.
		cont = contar(frase, palabra);
		
		// Muestro el resultado por pantalla
		System.out.println("la palabra " + palabra + " aparece " + cont + " veces");
		
		// Cierro escaner.
		sc.close();
	}

	private static int contar(String frase, String palabra) {
		
		// Contador para contar cuantas veces aparece.
		int cont = 0;
		
		// Variable para almacenar la posicion encontrada
		int pos;
		
		// Busco la palabra desde la poscion 0 (primeramente)
		pos = frase.indexOf(palabra, 0);
		
		// Bucle while para seguir buscando si de primeras ha encontrado.
		while(pos != -1) {
			// Incremento contador al encontrar.
			++cont;
			// Vuelvo a buscar la palabra desde pos + 1 (la siguiente posición de la ultima encontrada.)
			pos = frase.indexOf(palabra, ++pos);
		}
		
		// Devuelvo el contador
		return cont;
	}

}
