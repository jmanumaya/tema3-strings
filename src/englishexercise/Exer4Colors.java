package englishexercise;

import java.util.*;

public class Exer4Colors {

    // Códigos ANSI para colores
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_GREEN = "\u001B[32m";  // Color verde para letras correctas
    static final String ANSI_YELLOW = "\u001B[33m"; // Color amarillo para letras correctas en otra posición
    static final String ANSI_WHITE = "\u001B[37m";  // Color blanco para letras incorrectas

    static String checkAttempt(String word, String attempt) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (attempt.charAt(i) == word.charAt(i)) {
                result += ANSI_GREEN + attempt.charAt(i) + ANSI_RESET; // Letra correcta en la posición correcta
            } else if (word.indexOf(attempt.charAt(i)) == -1) {
                result += ANSI_WHITE + attempt.charAt(i) + ANSI_RESET; // Letra no está en la palabra
            } else {
                result += ANSI_YELLOW + attempt.charAt(i) + ANSI_RESET; // Letra está en la palabra pero en otra posición
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        // Lista de palabras posibles
        String words[] = {"APPLE", "HOUSE", "WATER", "TABLE", "GRASS", "MUSIC", "HEART", "LIGHT", "WORLD", "SOUND", "STONE", "PEACE", "BREAD", "CLOUD", "STORM", "POWER", "PLANT", "FRUIT", "SUGAR", "BRAVE"};

        // Selección aleatoria de una palabra
        String selectedWord = words[random.nextInt(words.length)];

        int attemptsLeft = 6;
        boolean wordGuessed = false;

        while (attemptsLeft > 0 && !wordGuessed) {
            System.out.print("Guess the word: ");
            String attempt = reader.next().toUpperCase();

            // Verificar si la palabra fue adivinada correctamente
            if (attempt.equals(selectedWord)) {
                wordGuessed = true;
                break;
            }

            // Mostrar el intento con colores
            System.out.println(checkAttempt(selectedWord, attempt));
            attemptsLeft--;
            System.out.println("Attempts left: " + attemptsLeft);
        }

        // Mensaje final dependiendo de si se adivinó la palabra
        if (wordGuessed) {
            System.out.println("You've won! The word was: " + selectedWord);
        } else {
            System.out.println("Game over. The word was: " + selectedWord);
        }

        reader.close();
    }
}