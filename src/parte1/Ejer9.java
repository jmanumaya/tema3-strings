package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		
		// Creo el escáner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);
		
		// Variable que almacenará la frase introducida.
		String frase = "";
		
		// Variable que va a contener la frase traducida (o no)
		String mensaje = "";
		
		// Recojo la frase del usuario.
		System.out.print("Frase: ");
		frase = sc.nextLine();
		
		// Compruebo si la frase está en el idioma de Javalandia y la guardo en mensaje.
		mensaje = traducirJavalandia(frase);
		
		// Muestro el resultado.
		if (mensaje.isEmpty()) {
			System.out.println("La frase no está en el idioma de Javalandia.");
		} else {
			System.out.println("Mensaje traducido: " + mensaje);
		}
		
		// Cierro uso escáner.
		sc.close();
	}

	// Función que verifica si la frase está en el idioma de Javalandia y devuelve la frase traducida (o no).
	private static String traducirJavalandia(String frase) {
		String mensaje = "";
		
		// Verifico si la frase empieza con "Javalín, javalón".
		if (frase.startsWith("Javalín, javalón")) {
			// Compruebo que tras la muletilla inicial haya al menos un espacio o tabulador.
			if (frase.length() > 16 && (frase.charAt(16) == ' ' || frase.charAt(16) == '\t')) {
				// Elimino la muletilla inicial y los espacios o tabulaciones que le siguen.
				mensaje = frase.substring(16).trim();
			}
		// Verifico si la frase termina con "javalén, len, len".
		} else if (frase.endsWith("javalén, len, len")) {
			// Elimino la muletilla final y los espacios o tabulaciones que le siguen.
			mensaje = frase.substring(0, frase.length() - 17).trim();
		}
		
		// Devuelvo el mensaje traducido o vacío si no es del idioma de Javalandia.
		return mensaje;
	}
}
