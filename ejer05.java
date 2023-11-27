package EjerciciosString;

import java.util.Scanner;

/*Método que pida un carácter c y un número n y que devuelva una cadena con c repetido 
n veces.*/

public class ejer05 {
	
	public static String CaracterRep(char c, int n) {
		StringBuilder resultado = new StringBuilder(); /*: Se crea un objeto StringBuilder llamado resultado. */
		
		for(int i =0; i<n; i++) {  /* el bulce repite "n" veces el caracter "c"*/
			resultado.append(c);	// .append: se utiliza para concatenar, agregar o adjuntar datos al final del objeto StringBuilder.
		}
		return resultado.toString();
		
		/*Después de que el bucle ha agregado el carácter n veces, 
		se convierte el objeto StringBuilder a una cadena utilizando el método   toString()    y 
		se devuelve como resultado del método.*/
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Ingresar un caracter: ");
		char c = teclado.next().charAt(0); /*charAt(0) se utiliza para obtener el carácter en la posición 0 de la cadena*/
		
		System.out.print("Ingresar un numero: ");
		int n = teclado.nextInt();
		
		String resultado = CaracterRep(c, n);
		System.out.println("Resultado: " + resultado);
	}
}
/* los objetos de [StringBuilder] son mutables, lo que significa que se pueden modificar sin tener que crear un 
 nuevo objeto en cada operación de concatenación.*/

/*[append ] es un método en Java que pertenece a la clase StringBuilder
y se utiliza para agregar o concatenar datos al final del objeto StringBuilder.*/


