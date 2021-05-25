package exrcise8_m7_1;

import java.util.Scanner;

public class GradosToFahrenheit {
	static Scanner scanner = new Scanner(System.in);
	static Double grados;
	static Double fahrenheit;

	public static void main(String[] args) {
		// Crea un programa donde el usuario introduzca una temperatura en ºC y
		// se muestre por pantalla la conversión en ºFahrenheit

		System.out.println(convertirTemperatura() + " " + "Grados °F");
	}

	public static double convertirTemperatura() {
		System.out.println(
				"Introduzca temperatura en Grados Celsius y te la devuelvo en Fahrenheit");
		grados = scanner.nextDouble();

		return fahrenheit = (grados * 9 / 5) + 32;

	}

}
