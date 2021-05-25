package exercise2_m7_2;

import java.util.Scanner;

public class MustraPantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		String caracter = "******";
		/*
		 * Haz un programa que muestre el siguiente por pantalla:
		 * 
		 * * * * * *
		 * 
		 * * * * *
		 * 
		 * * * *
		 * 
		 * * *
		 * 
		 * *
		 *
		 * 
		 * 
		 * El número de líneas formadas por "*" vendrá dado por un número que el
		 * usuario introducirá para consola.
		 * 
		 * Condición: En todo el código del programa sólo puede haber un *
		 * 
		 * También, a poder ser, no utilices ningún método como repeat () o
		 * substring () de la clase String
		 */
		String resultado;
		System.out.println("Introduce un numero ");
		numero = scanner.nextInt();

		for (int index = numero; index <= numero; index++) {
			resultado = caracter += "*";
			System.out.println(resultado);
			for (int indice = 1; indice <= numero + 1; indice++) {

				resultado = caracter.substring(indice);

				System.out.println(resultado);
			}
		}

		scanner.close();
	}

}
