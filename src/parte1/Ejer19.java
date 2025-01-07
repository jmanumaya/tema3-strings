package parte1;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable que contendra la frase.
		String frase;
		
		// Variable que va a almacenar el caracter que toque en cada caso.
		String c;
		
		// tabla de char para la frase.
		char[] letras;
		
		// Variable que va a ser las veces de i en un for pero ahora en el while.
		int i = 0;
		
		// posicion1
		int pos1;
		
		// posicion2
		int pos2;
		
		// contador.
		int cont = 0;

		// Leo la frase.
		System.out.println("Frase: ");
		frase = sc.nextLine().toLowerCase();
		
		// Bucle para recorrer todo el array en busca de cada letra y su correspondiente numero de repeticiones.
		while (i < frase.length()) {
			
			// Busco en la frase dicha letra de dicha posicion del array y le doy el valor de donde esté a pos1.
			pos1 = frase.indexOf(" ");
			
			// Bucle para que mientras lo encuentre vaya buscandolo de nuevo y vaya contabilizando las veces que encuentra dicha letra en la frase.
			while (pos1 != -1) {
				
				pos1 = pos1 + 1;
				
				c = frase.charAt(pos1);
				
				
				
			}
			
			// Voy imprimiendo el resultado según vaya procediendo con cada letra que se ha ido buscando su repeticiones.
			System.out.println(cont > 1 ? c + ": " + cont + " veces" : c + ": " + cont + " vez");
			
			// Reseteo valores y doy a i la siguiente posición en la que buscar obviando a las letras ya buscadas porque en el array estaran por ejemplo 4 a juntas
			// entonces sumo las veces que se cuenta dicha letra para empezar ya con la siguiente. si tengo 4 a: aaaa pues empiezo ya con la b por ejemplo: aaaab.
			pos1 = 0;
			pos2 = 0;
			i = i + cont;
			cont = 0;
		}
		
	}

}
