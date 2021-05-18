package exercise3_m7_1;

import java.util.Scanner;

public class NumeroParImpar {

	static Integer numero = 0;
	static String respuesta;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// El usuario debe introducir un número y el programa debe mostrar por
		// pantalla si el número es par o impar.

		System.out.println("Introduzca un numero y le dire si es par o impar");
		numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		}
		if (numero % 2 != 0) {
			System.out.println("El numero es impar");
		}

		System.out.println("Desea continuar SI/NO?");
		respuesta = scanner.next();

		if (respuesta.equalsIgnoreCase("si")) {
			main(args);
		} else {
			System.out.println("ADIOS");
			return;
		}
		scanner.close();
	}

}
