package exercise7_m7_1;

import java.util.Scanner;

public class UnCaracter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String caracter = "";
		Integer numero = 0;
		/*
		 * Hacer un programa donde el usuario introduce por pantalla un carácter
		 * y un número. El programa imprime por pantalla un cuadrado con el
		 * tamaño y el carácter introducidos por el usuario.
		 * 
		 * ejemplo:
		 * 
		 * %%%%%
		 * 
		 * %%%%%
		 * 
		 * %%%%%
		 * 
		 * %%%%%
		 * 
		 * %%%%%
		 * 
		 */
		System.out.println("Introduce un caracter");
		caracter = scanner.next();
		System.out.println("Introduce un numero");
		numero = scanner.nextInt();
		for (int indice = 0; indice < numero; indice++) {
			System.out.println();
			for (int index = 0; index < numero; index++) {
				System.out.print(caracter);
			}
		}
		scanner.close();
	}

}
