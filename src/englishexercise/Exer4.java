package englishexercise;

import java.util.*;

public class Exer4 {
	
	static String checkAttempt(String word, String attempt, String secretWord) {
		for (int i = 0; i < word.length(); i++) {
			if (attempt.charAt(i) == word.charAt(i)) {
				secretWord += attempt.charAt(i);
			} else if (word.indexOf(attempt.charAt(i)) == -1) {
				secretWord += "_";
			} else {
				secretWord += "*";
			}
		}
		
		return secretWord;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		
		String words[] = {"APPLE", "HOUSE", "WATER", "TABLE", "GRASS", "MUSIC", "HEART", "LIGHT", "WORLD", "SOUND", "STONE", "PEACE", "BREAD", "CLOUD", "STORM", "POWER", "PLANT", "FRUIT", "SUGAR", "BRAVE"};

		String selectedWord = words[random.nextInt(0, words.length)];
		
		String secretWord = "";
		
		String attempt = "";
		
		int attemptsLeft = 6;
		
		do {
			System.out.print("Guess the word: ");
			attempt = reader.next().toUpperCase();
			
			System.out.println(checkAttempt(selectedWord, attempt, secretWord));
			
			attemptsLeft--;
		} while (attemptsLeft > 0 && !attempt.equals(selectedWord));
		
		System.out.print(attempt.equals(selectedWord) ? "You've won!" : "Game over." + " The word was " + selectedWord);
		
		reader.close();
	}
}
