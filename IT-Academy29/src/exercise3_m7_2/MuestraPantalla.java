package exercise3_m7_2;

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
		 * La línea con más "*" vendrá dada por un número que el usuario
		 * introducirá para consola.
		 * 
		 * Condición: En todo el código del programa sólo puede haber dos *
		 * 
		 * También, a poder ser, no utilices ningún método como repeat () o
		 * substring () de la clase String
		 */

		String resultado;
		System.out.println("Introduce un numero ");
		numero = scanner.nextInt();

		for (int index = numero; index <= numero; index++) {
			resultado = caracter;

			System.out.println(resultado);
			for (int indice = 1; indice <= 6; indice++) {

				resultado = caracter += "*";

				System.out.println(resultado);

			}
			for (int iterator = 1; iterator <= caracter.length()
					- 1; iterator++) {
				resultado = caracter.substring(iterator);

				System.out.println(resultado);
			}
			scanner.close();
		}

	}

}
