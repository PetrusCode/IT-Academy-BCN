package exercise1_m7_3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	private static final Double PI = Math.PI;

	private static Integer radio;
	private static Integer base;
	private static Integer altura;
	private static Integer lado;
	private static long resultado;

	public static void opcionesMenu() {
		Scanner scanner = new Scanner(System.in);
		EnumOptions enumOptions = null;
		Integer opcion = 0;

		try {
			opcion = Integer.parseInt(JOptionPane
					.showInputDialog("Eliga una de las cuatro opciones:" + "\n"
							+ "1-Cuadrado." + "\n" + "2-Triangulo." + "\n"
							+ "3-Rectangulo" + "\n" + "0-Salir del programa"));
		} catch (Exception e) {
			System.out.println("Introduzca un numero " + e.getMessage());
		}

		enumOptions = EnumOptions.fromValue(opcion);
		switch (enumOptions) {

		case CUADRADO:
			System.out
					.println("Usted a decidido calcular el area de un CUADRADO"
							+ "\n" + "Introduzca el valor de uno de sus lados");
			lado = scanner.nextInt();
			resultado = Math.round(Math.pow(lado, 2));
			break;
		case TRIANGULO:

			System.out
					.println("Usted a decidido calcular el area de un TRIANGULO"
							+ "\n" + "Introduzca la base y la altura");
			base = scanner.nextInt();
			altura = scanner.nextInt();
			resultado = Math.round((base * altura) / 2);
			break;

		case RECTANGULO:
			System.out.println(
					"Usted a decidido calcular el area de un RECTANGULO" + "\n"
							+ "Introduzca la base y la altura");
			base = scanner.nextInt();
			altura = scanner.nextInt();
			resultado = Math.round((base * altura));
			break;

		case CIRCULO:
			System.out.println("Usted a decidido calcular el area de un CIRCULO"
					+ "\n" + "Introduzca el radio");
			radio = scanner.nextInt();
			resultado = Math.round(PI * (Math.pow(radio, 2)));
			break;

		case SALIR_DEL_PROGRAMA:
			System.out.println("Usted a decidido finalizar el programa ADIOS!");
			scanner.close();
			break;

		default:
			System.out.println(
					"Ha sucedido un error inesperado intentelo de nuevo");
			scanner.close();
		}

		System.out.println("El Area del poligono es: " + " " + resultado);
	}
}
