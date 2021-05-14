package SumFunctions;

import java.util.Scanner;

public class MetodosCal {
	static Scanner scanner = new Scanner(System.in);
	static String operador = "";
	private static int numero2;
	private static int numero1;

	public static void main(String[] args) {
		System.out.println(
				"Que operacion desea realizar ? [+|-|*|/|%] Escriba una");
		operador = scanner.nextLine();

		switch (operador) {
		case "+":
			suma(numero1, numero2);
			break;

		case "-":
			resta(numero1, numero2);
			break;

		case "*":
			multiplicacion(numero1, numero2);
			break;

		case "/":
			division(numero1, numero2);
			break;

		case "%":
			modular(numero1, numero2);
			break;

		default:
		}

	}

	public static Integer suma(int numero1, int numero2) {
		System.out.println("Introduzca dos numeros para sumar.");
		Integer resultado;
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		System.out.println(resultado = numero1 + numero2);
		return resultado;
	}

	public static Integer resta(int numero1, int numero2) {
		System.out.println("Introduzca dos numeros para restar.");
		Integer resultado;
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();

		System.out.println(resultado = numero1 - numero2);
		return resultado;
	}

	public static Integer multiplicacion(int numero1, int numero2) {
		System.out.println("Introduzca dos numeros para multiplicar.");
		Integer resultado;
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();

		System.out.println(resultado = numero1 * numero2);
		return resultado;
	}

	public static Integer division(int numero1, int numero2) {
		System.out.println("Introduzca dos numeros para dividir.");
		Integer resultado;
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();

		System.out.println(resultado = numero1 / numero2);
		return resultado;
	}

	public static Integer modular(int numero1, int numero2) {
		System.out.println("Introduzca dos numeros y obten el modular.");
		Integer resultado;
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();

		System.out.println(resultado = numero1 % numero2);
		return resultado;
	}
}
