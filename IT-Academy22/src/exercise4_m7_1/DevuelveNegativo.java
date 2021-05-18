package exercise4_m7_1;

import java.util.Scanner;

public class DevuelveNegativo {

	public static void main(String[] args) {
		Integer numero1 = 0;
		Integer numero2 = 0;
		Scanner scanner = new Scanner(System.in);
		// El usuario debe introducir dos números, el programa retornará "Uno de
		// los dos números es negativo", sólo si uno de los dos números es
		// negativo.

		System.out.println("Introduzca dos numeros");

		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();

		if (Math.abs(numero1) < 0 || Math.abs(numero2) < 0) {
			System.out.println("Uno de los dos números es negativo");
		} else {
			System.out.println("Adios");
		}

		scanner.close();

	}

}
