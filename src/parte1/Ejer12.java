package parte1;

import java.util.Scanner;

public class Ejer12 {

    public static void main(String[] args) {
        
        // Scanner para leer la frase
        Scanner sc = new Scanner(System.in);
        
        // Variable para albergar la frase
        String frase;
        
        // Array para albergar las palabras de la frase.
        String[] palabras;
        
        // Variables para la palabra más larga y su longitud.
        String palabraMasLarga = "";
        int longitudMaxima = 0;

        // Pido al usuario que me dé una frase.
        System.out.println("Dame una frase y te diré la palabra más larga y el número de caracteres de la misma.");
        System.out.println("Frase: ");
        frase = sc.nextLine();

        // Divido la frase en palabras y las guardo en el array.
        palabras = frase.split(" ");

        // Encuentro la palabra más larga con un for-each
        for (String palabra : palabras) {
            if (palabra.length() > longitudMaxima) {
                palabraMasLarga = palabra;
                longitudMaxima = palabra.length();
            }
        }

        // Muestro el resultado al usuario
        System.out.println("La palabra más larga de la frase es \"" + palabraMasLarga + "\" y tiene " + longitudMaxima + " caracteres.");

        // Cierro el scanner
        sc.close();
    }
}
