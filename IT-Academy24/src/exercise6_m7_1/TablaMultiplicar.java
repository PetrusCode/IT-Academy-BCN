package exercise6_m7_1;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long numero1 = 0L;
		String resultado = "";
		/*
		 * Tabla de multiplicar. El usuario introducirá un número por pantalla y
		 * el programa le mostrará la tabla de multiplicar de aquel número (del
		 * 1 al 10). ejemplo: 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 2 x 10 = 20
		 */
		System.out.println("Introduzca un numero");
		numero1 = scanner.nextLong();

		for (int index = 1; index <= numero1; index++) {
			resultado = "\n" + " | Tabla de multiplicar del numero | " + "["
					+ index + "]";

			for (int iterator = 1; iterator <= numero1; iterator++) {
				resultado += "\n" + " | " + index + "x" + iterator + "="
						+ index * iterator + " | ";
			}
			System.out.println(resultado);
			scanner.close();
		}

	}

}
