package exercise6_m7_2;

import java.util.Scanner;

public class PrimosAgain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer number = 0;
		// El usuario debe introducir números hasta que introduzca un número
		// primo. En el momento que el usuario introduzca un número primo, el
		// programa debe sacar por pantalla el siguiente mensaje: Exacto, el
		// número "x" es primero!
		System.out.println("introduce un numero");
		number = scanner.nextInt();

		while (number % 2 == 0) {
			System.out
					.println("Exacto el numero: " + number + " " + "es primo");
			main(args);
			break;

		}
		if (number % 2 != 0)
			main(args);

		scanner.close();

	}

}
