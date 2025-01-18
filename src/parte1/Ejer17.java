package parte1;

public class Ejer17 {

	public static void main(String[] args) {
		
		// Inicializo codigo simulando una entrada por consola de parte del usuario.
		String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		
		// Inicializo resultado llamando a la funcion que va a eliminar los comentarios pasandole ese "codigo"
		String resultado = eliminarComentarios(codigo);
		
		// Imprimo por consola el resultado.
		System.out.println("Resultado: " + resultado);
	}

	// Funcion que va a eliminar los comentarios del codigo que se le pase
	public static String eliminarComentarios(String codigo) {
		
		// Cadena para almacenar el resultado y devolverlo luego
		String resultado = ""; 
		
		// Variable i que va a ser la que va a ir pasando de caracter en caracter
		int i = 0;
		
		// guardo la longitud del codigo para iterar en el.
		int longitud = codigo.length();

		// while para buscar esos comentarios e ir formando la nueva cadena a devolver sin los comentarios.
		while (i < longitud) {
			
			// if que va a detectar si tenemos inicio de comentario en el caracter en el que estamos.
			if (i + 1 < longitud && codigo.charAt(i) == '/' && codigo.charAt(i + 1) == '*') {
				
				// Si asi es saltamos ese "/*" para luego en el while de abajo buscar el final de dicho comentario. 
				i += 2;
				// while para buscar el final del comentario
				while (i + 1 < longitud && !(codigo.charAt(i) == '*' && codigo.charAt(i + 1) == '/')) {
					i++;
				}
				i += 2;
			// Si no se detecta inicio de comentario en el caracter en el que se está pues se la va concatenando a resultado dichos caracteres.
			} else {
				resultado += codigo.charAt(i);
				i++;
			}
		}
		
		// Devuelvo el resultado ya formado.
		return resultado;
	}

}
