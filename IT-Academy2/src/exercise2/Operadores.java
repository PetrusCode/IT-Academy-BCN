package exercise2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero1 = 0;
		Integer numero2 = 0;
		Integer suma = 0;
		Integer resta = 0;
		Integer division = 0;
		Integer multiplicacion = 0;
		String resultado = "";
		Scanner numeros = new Scanner(System.in);

		System.out.println("Introduzca dos numeros");
		numero1 = numeros.nextInt();
		numero2 = numeros.nextInt();

		suma = ((numero1 + numero2));
		resta = ((numero1 - numero2));
		division = ((numero1 / numero2));
		multiplicacion = ((numero1 * numero2));
		resultado = (suma.toString() + "-Suma" + "\n" + resta.toString()
				+ "-Resta" + "\n" + division.toString() + "-Division" + "\n"
				+ multiplicacion.toString() + "-Multiplicacion");
		System.out.println(resultado);

		System.out.println("Hasta luego!");
		numeros.close();

	}

}
