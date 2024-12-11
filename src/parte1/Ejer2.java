package parte1;

import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		// String que contedrá la contraseña
		String pass = "";
		
		// String que contedrá la contraseña que va introduciendo el que la quiere acertar
		String passToKnow = "";
		
		// Variable que contendrá la respuesta de la comparacion de cadenas
		int respuesta;
		
		// Doy la bienvenida al juego y muestro las instrucciones.
		System.out.println("Bienvenido a \"Adivina la Contraseña\"\nInstrucciones:");
		System.err.println(" -Primero uno de los jugadores pondrá la contraseña a adivinar");
		System.err.println(" -Segundo, el otro jugador deberá introducir palabras hasta adivinarla");
		System.err.println(" -Observación: Al introducir una palabra se indicará si está antes o despúes"
				+ " alfabeticamente la contraseña a adivinar.");
		System.out.println();
		
		// Leo la contraseña por parte del primer jugador
		System.out.println("Dime la contraseña:");
		pass = sc.next();
		sc.nextLine();
		
		do{
		
		// Leo la contraseña que introde el segundo jugador para intentar adivinar la original
		System.out.println("Qué contraseña crees que es?:");
		passToKnow = sc.next();
		sc.nextLine();
		
		// Guardo en respuesta lo que me de al comparar la passToKnow con pass.
		// Si me da un negativo significa que la passToKnow es menor que pass.
		// Si me da un positivo significa que la passToKnow es mayor que pass.
		// Si me da un 0 significa que ha acertado la pass secreta.
		respuesta  = passToKnow.compareToIgnoreCase(pass);
		
		// Compruebo con if si la respuesta es negativa, 0 o positiva-
		// para imprimir el resultado que corresponda.
		if (respuesta == 0) {
			System.out.println("Has adivinado la contraseña!!!");
		} else if (respuesta > 0) {
			System.out.println("La contraseña está antes alfabeticamente");
		} else {
			System.out.println("La contraseña está después alfabeticamente");
		}
		
		// Salgo del do-while cuando sea 0 (cuando sean iguales las contraseñas).
		} while (respuesta != 0);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
