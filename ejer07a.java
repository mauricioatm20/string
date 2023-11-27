package EjerciciosString;

import java.util.Scanner;

/*a. Repite el ejercicio anterior, pero usando indexOf.*/
public class ejer07a {
	public static void FraseCar(String frase, char c) {
		
		int indice = frase.indexOf(c);
		
		if(indice != -1) {
			System.out.println("el caracter " + c + " de la frase, esta en la posision " + indice);
		
			while((indice = frase.indexOf(c, indice + 1 )) !=-1) {
				System.out.println("el caracter " + c + " de la frase, esta en la posision " + indice);
			}
		}else {
			System.out.println("el caracter " + c + " no esta en la frase");
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrse una frase: ");
		String frase = teclado.nextLine();
		
		System.out.println("Ingrese caracter: ");
		char c = teclado.next().charAt(0);
		
		FraseCar(frase, c);
	}
}
