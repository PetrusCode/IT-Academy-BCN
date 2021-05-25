package exercise7_m7_2;

import java.util.Scanner;

public class BisiestosAny {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca un año");
		Integer anio = scanner.nextInt();
		// Crea un programa donde el usuario introduzca un año y el programa
		// diga si el año es bisiesto o no.

		/*
		 * Los años bisiestos son los divisibles entre 4 (como 2004, 2008, etc.)
		 * excepto si es divisible entre 100, entonces no es bisiesto (como
		 * 2100, 2200, etc.) excepto si es divisible entre 400, entonces sí
		 * (como 2000, 2400)
		 */
		while (true) {
			if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {

				System.out.println("El año: " + anio + " es bisiesto");
				main(args);

			} else {
				System.out.println("El año: " + anio + " no es bisiesto");
				main(args);
			}
			anio++;

			scanner.close();
		}

	}

}
