package EjerciciosString;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*Programa que diga si una cadena dada por el usuario está o no vacía.*/
public class ejer02 {
	
	public static void CadenaVacia(String cadena) {
		
		if (isCadenaVacia(cadena)) {
			System.out.println("La cadena esta vacia");
		}else {
			System.out.println("La cadena no esta vacia");
		}
		
	}

	public static boolean isCadenaVacia(String cadena) {
		
		return cadena.isEmpty() ;
		
		/*En java la calse STRING tiene un metodo [.isEmpty()] que devuelve true si la cadena no tienen ningun caracter 
		y false si contien almenos un carcater */ 
	}
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introducir texto");
		String cadena= tec.nextLine();
		CadenaVacia(cadena);
		
		
	}
}
