package EjerciciosString;
/*Elabora un método que escriba todos los caracteres de una cadena cada uno en una línea.*/
public class ejer06 {
	
	public static void Caracter(String cadena) {
		
		for(char c: cadena.toCharArray()) { // (for-each )Este bucle se utiliza principalmente para iterar sobre colecciones o arrays. 
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		
		Caracter("buenos dias ");
	}
}

/*El método toCharArray() de la clase String convierte la cadena en un array de caracteres (char[]),
 *  donde cada elemento del array es un carácter de la cadena.
 */