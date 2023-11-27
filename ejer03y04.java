package EjerciciosString;

import java.util.Scanner;

/*Ejer03: Pedir al usuario una cadena y decir si empieza por el carácter ‘H’.*/
/*Ejer04: Como el anterior, pero sin importar si es mayúscula o minúscula.*/

public class ejer03y04 {

	public static void CadenaH(String cadena) {
		if (isCadenaH(cadena)) {
			System.out.println("La cadena contien 'H'");
		}else {
			System.out.println("La cadena no contiene 'H'");
		}
	}
	public static boolean isCadenaH(String cadena) {
		return cadena.toLowerCase().startsWith("h");
		
		// {.startsWith()} Este método verifica si la cadena comienza con la subcadena especificada
		// ejer 04: {toLowerCase()} Este metodo convierte todos los caracteres de la cadena a minusculas
	}
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Ingrese Cadena");
		String cadena = tec.nextLine();
		CadenaH(cadena);
	}
}
