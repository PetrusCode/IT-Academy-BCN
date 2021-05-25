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
		 * El número de líneas formadas por "*" vendrá dado por un número que el
		 * usuario introducirá en una caja de texto.
		 * 
		 * Condición: En todo el código del programa sólo puede haber un *
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
