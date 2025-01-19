package parte1;

import java.util.Random;
import java.util.Scanner;

public class Ejer16 {
	
	/**
	 * Básicamente este programa lo que va a hacer es modificar una cadena original, alterando sus caracteres en función a posiciones
	 * aleatorias entre 0 y longitud que esta longitud comenzará siendo la longitud original pero a medida que el jugador 2 va fallando,
	 * esta se va decrementando provocando que se vaya revelando poco a poco la frase ya que los ultimos caracteres no se van a ir modificando
	 * a medida que pasan los intentos...
	 * 
	 * @author Jose Manuel Maya Hidalgo
	 * */

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner (System.in);
		
		// Creo la variable que va a contener la palabra a adivinar (Escribe Jugador 1).
		String original = "";
		
		// Creo la variable que va a contener la palabra del intento a adivinar (Escribe Jugador 2).
		String intento = "";
		
		// Variable modificada, que va a ser la palabra modificada o pista.
		String modificada = "";
		
		// Boleano para salir de los do.
		boolean salir = false;
		
		// Variable donde recojo la longitud de la cadena original para ir bajando la dificultad cada vez que falla.
		int longitud = 0;
		
		// Variable que va a almacenar las coincidencias del usuario con el texto original.
		int coincidencias = 0;
		
		// Pido al Jugador 1 una palabra a adivinar
		System.out.println("Jugador 1, introduce la palabra o frase que quiera que adivine el jugador 2");
		
		// Do-While para repetir que el usuario indique una cadena a adivinar si la introduce vacía.
		do {
			
			System.out.println("Indica la Frase o Palabra a adivinar: ");
			original = sc.nextLine();
			
			// Compruebo si la cadena que me ha introducido esta vacia.
			if (original.isEmpty()){
				System.out.println("No puedes dejar este campo vacío.");
			} else {
				salir = true;
			}
			
		} while(!salir);
		
		// Reinicio el valor de salir para el proximo do.
		salir = false;
		
		// Doy valor a longitud para poder usarlo.
		longitud = original.length();
		
		// Indico los intentos que tiene el jugador 2 en total para poder adivinar la cadena.
		System.out.println("Juagor 2, tienes un total de " + longitud + " intentos...");
		
		
		// Do para repetir siempre y cuando el jugador 2 falle a la hora de intentar adivinar la cadena.
		do {
		
		// Modifico el orden de los caracteres de la palabra o frase para mostrarsela al jugador 2.
		modificada = modifica(original, longitud);
		
		// Muesto la palabra o frase al jugador 2 ya alterada.
		System.out.println("¿Qué crees que pone aquí? " + modificada);
		
		// Respuesta del Jugador 2.
		System.out.print("Respuesta: ");
		intento = sc.nextLine();
		
		// Compruebo si la respuesta es igual a la cadena original para salir del do-while o comprobar otra cosa...
		if (intento.equals(original)) {
			salir = true;
			System.out.println("Enhorabuena, la has adivinado!!!");
			
		// Si no ha adivinado la cadena resto a longitud y compruebo si le quedan intentos, si asi es, se lo indico y se le vuelve a preguntar.
		// si no le quedan intentos, se lo indico y salimos del bucle do-while.
		} else {
			--longitud;
			// Calculo las coincidencias dadas
			coincidencias = contarCoincidencias(original, intento);
			if (longitud > 0) {
				System.err.println("Vaya, te has equivocado... Vuelve a intentarlo! Ahora será algo mas fácil!");
				System.out.println("Letras correctas en la posición correcta: " + coincidencias);
				System.out.println("Te quedan: " + longitud + " intentos...");
			} else {
				System.err.println("Ohhh, te quedastes sin intentos...");
				salir = true;
			}
		}
		
		} while(!salir);
		
		// Indico al usuario que ha acabado el juego.
		System.err.println("Gracias por Jugar");
		
		// Cierro uso de escaner.
		sc.close();
	}
	
	/**
     * Desordena los caracteres de la cadena original dentro del rango de longitud especificado.
     * 
     * @param original La cadena original
     * @param longitud La longitud hasta la que se permite desordenar
     * @return Una nueva cadena desordenada
     */
	private static String modifica(String original, int longitud) {
		
		// Cadena que se va a devolver.
		String modificada = "";
		
		// Array con los caracteres de la cadena original.
		char[] caracteres = original.toCharArray();
		
		// Creo el random.
		Random rd = new Random();
		
		// Posición random uno.
		int posicionRandom1;
		
		// Posición random dos.
		int posicionRandom2;
		
		// Letra que será de la posición random 1.
		char letra1;
		
		// Letra que será de la posición random 2.
		char letra2;

		// For para recorrer toda la cadena y alterarla (alteraremos la los caracteres de la tabla).
		for(int i = 0; i < original.length(); i++) {
			
			// Doy a posiciónRandom1 una posición random entre 0 y longitud.
			posicionRandom1 = rd.nextInt(0, longitud);
			
			// Doy a posiciónRandom2 una posición random entre 0 y longitud.
			posicionRandom2 = rd.nextInt(0, longitud);
			
			// Doy a letra1 el valor de la posiciónRandom2
			letra1 = caracteres[posicionRandom2];
			
			// Doy a letra2 el valor de la posiciónRandom1
			letra2 = caracteres[posicionRandom1];
			
			// Doy a posiciónRandom2 de la tabla caracteres el valor de la letra2
			caracteres[posicionRandom2] = letra2;
			
			// Doy a posiciónRandom1 de la tabla caracteres el valor de la letra1
			caracteres[posicionRandom1] = letra1;	
		}
		
		// Paso la tabla caracteres a String guardandola en modificada.
		modificada = String.valueOf(caracteres);
		
		// Devuelvo modificada.
		return modificada;
	}
	
	/**
     * Cuenta cuántas letras coinciden en la misma posición entre la cadena original y el intento.
     * 
     * @param original La cadena original
     * @param intento La cadena del intento
     * @return Numero de aciertos
     */
    private static int contarCoincidencias(String original, String intento) {
        int coincidencias = 0;

        // Comparamos las dos cadenas carácter por carácter
        for (int i = 0; i < original.length() && i < intento.length(); i++) {
            if (original.charAt(i) == intento.charAt(i)) {
                coincidencias++;
            }
        }

        // Devuelvo el numero de coincidencias luego de comparar.
        return coincidencias;
    }
}
