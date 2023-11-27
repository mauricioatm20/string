package EjerciciosString;

import java.util.Scanner;

/*Método que reciba una cadena y retorne el número de vocales que contiene.*/
public class ejer08 {

	public static boolean esVocal(char c){
		return "aeiou".indexOf(c) != -1;
	}
	
	public static int Frase(String cadena) {
		int contador =0;
		
		cadena = cadena.toLowerCase();
		
		for(int i=0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if(esVocal(c)) {
				contador++;
			}		
		}
		return contador;
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("ingrese una cadena: ");
		String cadena = teclado.nextLine();
		
		 int cantidadVocales = Frase(cadena);
		 System.out.println("Número de vocales: " + cantidadVocales);
	}
}
