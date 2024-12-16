package englishexercise;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable for the original message.
		String originalMesagge = "";

		// Variable for the new message.
		String newMesagge = "";

		// Tell to user that put a message.
		System.out.println("Tell me: ");
		originalMesagge = sc.nextLine().toUpperCase();

		// Tell the function to translate the original message.
		newMesagge = translate(originalMesagge);

		// Print the new message.
		System.err.println("Translate: " + newMesagge);

		// Close Scanner.
		sc.close();
	}

	private static String translate(String originalMesagge) {

		// Variable for the new message
		String newMesagge = "";

		// Variable to store the charAt.
		char pos;

		// For to run all the charAt
		for (int i = 0; i < originalMesagge.length(); i++) {

			// Get the charAt moment.
			pos = originalMesagge.charAt(i);

			// Conditional for make a new message with words if the charAr is a word.
			if (pos >= 'A' && pos < 'Z') {
				newMesagge += (char) (pos + 1);
			} else if (pos == 90) {
				newMesagge += 'A';
			}
			
			// Conditional for make a new message with numbers if the charAr is a number.
			if (pos >= '0' && pos < '9') {
				newMesagge += (char) (pos + 1);
			} else if (pos == '9') {
				newMesagge += 0;
			}

		}
		
		// return newMessge.
		return newMesagge;
	}

}

