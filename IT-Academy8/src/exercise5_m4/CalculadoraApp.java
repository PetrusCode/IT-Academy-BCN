package exercise5_m4;

import java.util.Scanner;

public class CalculadoraApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer resultado = 0;
		Integer numero1;
		Integer numero2;

		System.out.println("Introduzca dos numeros:");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		System.out.println("Operacion a realizar: '*' | '+' | '-' | '/'");
		String operadores = scanner.nextLine();
		switch (operadores) {
		case "*":
			resultado = (numero1 * numero2);
			System.out.println(resultado);
			break;
		case "+":
			resultado = (numero1 + numero2);
			System.out.println(resultado);
			break;
		case "-":
			resultado = (numero1 - numero2);
			System.out.println(resultado);
			break;
		case "/":
			resultado = (numero1 / numero2);
			System.out.println(resultado);
			break;
		default:
			System.out.println("Tiene que seleccionar una operacion");
		}

		scanner.close();
	}

}
