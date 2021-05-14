import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaEdades {
	static Scanner scanner = new Scanner(System.in);
	static List<String> personas = new ArrayList<String>();

	public static void main(String[] args) {
		/*
		 * Este programa calcula la edad media de un n�mero de personas
		 * introducido por teclado.
		 * 
		 * Se debe crear una funci�n que se encargue de pedir las edades al
		 * usuario y de calcular la edad media.
		 * 
		 * La funci�n recibir� por par�metro el n� de personas a las que debe
		 * pedir la edad.
		 * 
		 * La edad de las personas s�lo ser� v�lida si est� comprendida entre 0
		 * y 120 a�os.
		 * 
		 * La media de las edades introducidas debe devolverse por la funci�n (
		 * return ).
		 */
		MediaEdades.edadesUsu(0);
	}

	public static Integer edadesUsu(Integer numPersonas) {
		String nombre = "";
		Integer edad = 0;
		Integer media;
		Integer acumulaEdad = 0;
		System.out.println("A cuantas personas desea pedir la edad ?");
		numPersonas = scanner.nextInt();
		System.out.println(
				"A continuacion introduzca los nombres y edades de las personas");
		scanner.nextLine();

		for (int indice = 1; indice <= numPersonas; indice++) {
			System.out.println("Introduzca su nombre");
			nombre = scanner.next();

			System.out.println("introduzca su edad");
			edad = scanner.nextInt();
			while (edad > 120 || edad < 0) {
				System.out.println("introduzca su edad");
				edad = scanner.nextInt();

			}

			acumulaEdad += edad;

			personas.add("Nombre: " + nombre + ", " + "Edad: " + edad);
		}
		media = acumulaEdad / numPersonas;
		System.out.println("Lista de personas  " + personas + "\n"
				+ "La media de edad es: " + media);
		return media;

	}

}
