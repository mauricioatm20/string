package EjerciciosString;

import java.util.Scanner;

import com.CursoJava.Util.Consola.Consola;

/*Pedir al usuario su nombre y saludarlo.*/
public class ejer01 {
	
	static Scanner tec = new Scanner(System.in);
	
	public static String NombreString(String mensaje) {
		
		System.out.print(mensaje);
		return tec.nextLine();
		
	}
	
	public static void main(String[] args) {
		ejer01 teclado = new ejer01 ();
		
		String nombre1 = teclado.NombreString("Introduce tu nombre: ");
		System.out.println("¡Hola " + nombre1 + "!");
	}
}
