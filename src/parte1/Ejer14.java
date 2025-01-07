package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		
		// Scanner para leer la frase
		Scanner sc = new Scanner(System.in);
		
		// Variable que va a contener la frase
		String frase = "";
		
		// Variable que va a almacenar el caracter que toque en cada caso.
		char c;
		
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
		
		// Pedimos la frase.
		System.out.println("Frase: ");
		frase = sc.nextLine().toLowerCase();
		
		// Quito los espacios de la frase
		frase = frase.replace(" ", "");
		
		// Paso la frase a un array osea cada letra a una posicion de un array.
		letras = frase.toCharArray();
		
		// Ordeno el array
		Arrays.sort(letras);
		
		// Bucle para recorrer todo el array en busca de cada letra y su correspondiente numero de repeticiones.
		while (i < letras.length) {
			
			// doy valor a c con la letra que este en la posicion i del array
			c = letras[i];
			
			// Busco en la frase dicha letra de dicha posicion del array y le doy el valor de donde esté a pos1.
			pos1 = frase.indexOf(c);
			
			// Bucle para que mientras lo encuentre vaya buscandolo de nuevo y vaya contabilizando las veces que encuentra dicha letra en la frase.
			while (pos1 >= 0) {
				
				++cont;
				
				pos2 = pos1 + cont;
				
				pos1 = frase.indexOf(c, pos2);
				
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
		
		// Cierro uso de escaner.
		sc.close();
		
		
		// Bien hasta aquí estaría mi código pero haciendolo en casa pues le pedí a gpt que me lo corrigiese y me dijiera lo que se podia optimizar y demas:
		
		// Este es el codigo que me ha dado el compa, lo pongo aqui por si hay lugar y me acuerdo de preguntarte en clase porque lo veo muchisimo mas reducido
		// (evidentemente) pero no lo llego a pillar del todo y si lo ves y no hay nada que este prohibido de aplicar pues hombre se ve bien.
		
		
		// Scanner para leer la frase
        Scanner scanner = new Scanner(System.in);

        // Variables
        String frase2 = ""; // Variable que contendrá la frase
        char[] letras2; // Array para almacenar las letras
        char letraActual; // Variable para la letra actual
        int contador; // Contador de repeticiones

        // Pido la frase al usuario
        System.out.println("Frase: ");
        frase2 = scanner.nextLine().toLowerCase();

        // Quito los espacios y convierto la frase en un array de caracteres
        frase2 = frase2.replace(" ", "");
        letras2 = frase2.toCharArray();

        // Ordeno el array
        Arrays.sort(letras2);

        // Recorro el array y cuento las repeticiones
        for (int x = 0; x < letras.length; x++) {
            letraActual = letras2[x];
            contador = 1;

            // Cuento cuántas veces se repite la letra actual
            while (x + 1 < letras2.length && letras2[x] == letras2[x + 1]) {
                contador++;
                x++;
            }

            // Imprimo el resultado para la letra actual
            System.out.println(letraActual + ": " + contador + (contador > 1 ? " veces" : " vez"));
        }

        // Cierro el scanner
        scanner.close();
		
	}

}
