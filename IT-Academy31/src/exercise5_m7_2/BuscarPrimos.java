package exercise5_m7_2;

import java.util.Scanner;

public class BuscarPrimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		boolean fin = true;
		// El usuario introduce un número por teclado y el programa imprime por
		// pantalla si el número es primo o no

		System.out.println(
				"Introduzca un numero y miro si es un numero primo o no");

		numero = scanner.nextInt();
		if (fin) {

			if (numero % 2 == 0) {

				System.out.println("El numero es primo");
			} else {
				System.out.println("El numero no es primo");
			}

			main(args);

		}

	}
}
