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
		 * El n�mero de l�neas formadas por "*" vendr� dado por un n�mero que el
		 * usuario introducir� para consola.
		 * 
		 * Condici�n: En todo el c�digo del programa s�lo puede haber un *
		 * 
		 * Tambi�n, a poder ser, no utilices ning�n m�todo como repeat () o
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
