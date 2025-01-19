package parte1;

import java.util.Scanner;

public class Ejer19 {
		
	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Variable que va a almacenar la frase dada por el usuario
		String frase = "";
		
		// Variable que va a almacenar lo que me devuelva la funcion de convertir a camelCase.
		String camelCase = "";
		
		// Pido al usuario la frase.
		System.out.println("Dime la frase a convertir a camelCase: ");
		frase = sc.nextLine();
		
		// Llamo a la funcion convertirACamelCase y le asigno lo que me devuelve a la variable camelCase.
		camelCase = convertirACamelCase(frase);
		
		// Imprimo el resultado generado.
		System.out.println("Resultado: " + camelCase);
		
		// Cierro uso de escaner.
		sc.close();
	}

	// funcion que combierte una frase al nombre de una variable en camelCase.
	public static String convertirACamelCase(String frase) {
		
		// Divido la frase en palabras y las almaceno en el Array.
		String[] palabras = frase.split(" ");
		
		// Variable que va a contener la frase convertida en nombre de variable en formato camelcase y la que se delvuelve de la función.
		String resultado = "";

		for (int i = 0; i < palabras.length; i++) {
			
			// Tomo la palabra actual del array en la posición i.
			String palabra = palabras[i];
		    
		    if (i == 0) {
		        // Si es la primera palabra (posición 0), la convierto completamente en minúsculas,
		        // ya que en CamelCase la primera palabra no empieza con mayúscula.
		        resultado += palabra.toLowerCase();
		    } else {
		        // Si no es la primera palabra, aplico las reglas de CamelCase:
		        
		        // La primera letra de la palabra la convierto en mayúscula.
		        String primeraLetra = Character.toUpperCase(palabra.charAt(0)) + "";
		        
		        // El resto de la palabra (a partir del segundo carácter) lo convierto en minúsculas.
		        String resto = palabra.substring(1).toLowerCase();
		        
		        // Junto la primera letra mayúscula con el resto en minuscula y lo añado al resultado.
		        resultado += primeraLetra + resto;
		    }
		}

		// Devuelvo el resultado ya formado.
		return resultado;
	}

}
