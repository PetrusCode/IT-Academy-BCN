package exercise1_m7_2;

import java.util.Scanner;

public class MuestraPantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		String caracter = "*";
		/*
		 * Haz un programa que muestre el siguiente por pantalla:
		 *
		 * 
		 * 
		 * *
		 * 
		 * * *
		 * 
		 * * * *
		 * 
		 * * * * *
		 * 
		 * * * * * *
		 * 
		 * El n�mero de l�neas formadas por "*" vendr� dado por un n�mero que el
		 * usuario introducir� en una caja de texto.
		 * 
		 * Condici�n: En todo el c�digo del programa s�lo puede haber un *
		 */
		String resultado;
		System.out.println("Introduce un numero ");
		numero = scanner.nextInt();

		System.out.println(caracter);
		for (int indice = numero; indice >= 0; indice--) {
			resultado = caracter;
			for (int index = 0; index <= numero; index++) {

				resultado = caracter += "*";
				System.out.println(resultado);
			}

		}

		scanner.close();
	}

}
