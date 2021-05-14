package exercise3;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Integer primeraCalificacion = 0;
		Integer segundaCalificacion = 0;
		Integer terceraCalificacion = 0;
		Integer media = 3;
		Double resultado;

		System.out.println("Introduzca la primera calificacion");
		primeraCalificacion = scanner.nextInt();

		System.out.println("Introduzca la primera calificacion");
		segundaCalificacion = scanner.nextInt();

		System.out.println("Introduzca la primera calificacion");
		terceraCalificacion = scanner.nextInt();

		resultado = Math.floor((double) (primeraCalificacion
				+ segundaCalificacion + terceraCalificacion) / media);
		System.out.println("Su nota final es: " + resultado);
		scanner.close();

		System.out.println("Hasta luego!");

	}

}
