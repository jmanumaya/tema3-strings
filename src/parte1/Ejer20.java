package parte1;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		// Creoi el escaner.
		Scanner sc = new Scanner(System.in);

		// Variable para almacenar el numero de letras que quiere el usuario que se divida la palabra
		int numLetras;

		// Variable para almacenar la palabra
		String palabra;

		// Aquí guardaré los grupos de letras que generare con la funcion.
		String secuencias[];

		// Pido al usuario que me dé la palabra.
		System.out.print("Dime la palabra a secuenciar: ");
		palabra = sc.next();

		// Pido el número de letras por cada grupo.
		System.out.print("Ahora dime el número de letras en cada secuencia: ");
		numLetras = sc.nextInt();

		// Llamo a la función que se encarga de dividir la palabra en grupos.
		secuencias = generaSecuencias(palabra, numLetras);

		// Ahora muestro cada grupo en pantalla.
		System.out.println("Tabla generada:");
		for (String secuencia : secuencias) {
			System.out.println(secuencia);
		}

		// cierro uso de escaner.
		sc.close();
	}

	// Función que se encarga de dividir la palabra en grupos.
	private static String[] generaSecuencias(String palabra, int numLetras) {
		// Lo primero que hago es calcular cuántos grupos necesito.
		// Divido la longitud de la palabra entre el tamaño de cada grupo.
		// Si sobra algo al dividir, sumo 1 para que haya espacio para ese resto.
		int recorrido = palabra.length() / numLetras;
		
		if (palabra.length() % numLetras != 0) {
			recorrido += 1; // Si hay un resto, necesito un grupo más.
		}

		// Ahora creo un array para guardar los grupos de letras.
		String[] secuencias = new String[recorrido];

		// Inicio en la posición 0 de la palabra.
		int inicio = 0;
		
		// Variable que almacenara hasta donde cortar la palabra en cada iteracion
		int fin;

		// Recorro tantas veces como grupos necesite.
		for (int i = 0; i < recorrido; i++) {
			
			// Calculo hasta dónde debo cortar la palabra.
			fin = inicio + numLetras;

			// Si el valor de "fin" supera la longitud de la palabra, lo ajusto.
			if (fin > palabra.length()) {
				fin = palabra.length();
			}

			// Ahora corto el trozo de la palabra desde "inicio" hasta "fin".
			secuencias[i] = palabra.substring(inicio, fin);

			// Avanzo el índice inicial para el siguiente grupo de letras.
			inicio += numLetras;
		}

		// Devuelvo el array con todos los grupos de letras.
		return secuencias;
	}
}
