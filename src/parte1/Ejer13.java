package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer13 {
	
	// Apuntes que he pensado pero no implentado porque creo que aumentaria la longitud de codigo pero usando dos returns optimizaría yo creo...
	// Simplemente es que si al principio de la funcion miro si tienen distintas longitudes las palabras pues ya salgo con un return dando por
	// hecho que no son anagramas.
	
    public static void main(String[] args) {
    
    	// Scanner para leer las palabras
    	Scanner sc = new Scanner(System.in);
    	
    	// Palabra 1.
    	String palabra1 = "";

    	// Palabra 2.
    	String palabra2 = "";
    	
    	// Boolean para saber si las dos tablas son iguales.
    	boolean iguales;
    	
    	// Pido al usuario que me de dos palabras.
    	System.out.print("Palabra 1: ");
    	palabra1 = sc.next();
    	System.out.print("Palabra 2: ");
    	palabra2 = sc.next();
    	
    	// Llamo a la función que me va a decir si son anagramas las dos palabras que me ha dado el usuario.
    	iguales = anagrama(palabra1, palabra2);
    
    	// Dependiendo del resultado que me de la función imprimo una u otra respuesta.
    	System.out.println(iguales ? "Las palabras son anagramas" : "Las palabras no son anagramas");
    
    	// Cierro uso de scanner.
    	sc.close();
    }

    // Funcion que recibe dos palabras y dice si son anagramas.
	private static boolean anagrama(String palabra1, String palabra2) {
		
		// Boleano que nos va a decir si son anagramas o no.
		boolean iguales;
		
		// Array de char para palabra 1.
    	char[] letras1;
    	
    	// Array de char para palabra 2.
    	char[] letras2;
    	
    	// Paso las letras de las palabras a sus correspondientes tablas de letras.
    	letras1 = palabra1.toCharArray();
    	letras2 = palabra2.toCharArray();
    	
    	// Ordeno ambos arrays para luego comparar si son iguales.
    	Arrays.sort(letras1);
    	Arrays.sort(letras2);
		
    	// Comparo los arrays y así verifico si son iguales que si asi lo son sería palabras anagramas.
		iguales = Arrays.equals(letras1, letras2);
		
		// Devuelvo este booleano con esa respuesta que buscamos.
		return iguales;
	}
    
}
