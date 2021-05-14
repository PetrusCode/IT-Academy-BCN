package SumaNumerosRange;

import java.util.Scanner;

public class Numeros {
	static Scanner scanner = new Scanner(System.in);
	static Integer numero1 = 0;
	static Integer numero2 = 0;

	public static void main(String[] args) {
		numBetween();
	}

	public static void numBetween() {
		Integer resultado = 0;
		int iteracion = 0;
		System.out.println("Introduzca dos numeros");

		numero1 = Integer.parseInt(scanner.nextLine());
		numero2 = Integer.parseInt(scanner.nextLine());
		for (int indice = numero1; indice <= numero2; indice++) {

			iteracion++;

			resultado += indice;
			System.out.println("Resultado de iteracion:" + " " + resultado + " "
					+ "Numero de la iteracion: " + " " + iteracion);
		}
	}
}
