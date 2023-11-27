package EjerciciosString;

import java.util.Scanner;

/*Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o 
indicar que no está si procede. No se puede usar indexOf o similar.
a. Repite el ejercicio anterior, pero usando indexOf.*/
public class ejer07 {

	
	public static void PedirFrase(String frase , char c) {

		boolean noEstaPresente = true;
		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == c) {
				System.out.println("el carcater " + c + " esta en la posicion " + i);
				noEstaPresente = false;
			}
		}
		if(noEstaPresente)
			System.out.println("no se encontro");
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese Frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Ingrese Caracter: ");
		char c = teclado.next().charAt(0);
		
		PedirFrase(frase, c);
		
	}
}
