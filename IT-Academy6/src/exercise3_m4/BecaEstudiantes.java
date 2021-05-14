package exercise3_m4;

import java.util.Scanner;

public class BecaEstudiantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer edad = 18;
		Integer miedad;
		Boolean titulo;
		Boolean paro;

		System.out.println(
				"Bienvenidos esta es la mejor escuela de idiomas del mundo MUNDIAL!! ");
		scanner.nextLine();
		System.out.println(
				"Si quiere una SUPER BECA con nosotros rellene los siguientes campos:");

		System.out.println("Tiene usted titulo Universitario ? Si/No");
		String respuesta = "";
		respuesta = scanner.nextLine();

		if (respuesta.equalsIgnoreCase("si")) {
			titulo = true;
		} else {
			titulo = false;
		}

		System.out.println("Esta usted en el paro ? Si/No");
		String respuesta2 = "";
		respuesta2 = scanner.nextLine();

		if (respuesta2.equalsIgnoreCase("si")) {
			paro = true;
		} else {
			paro = false;
		}

		System.out.println("Que edad tiene ?");
		miedad = scanner.nextInt();

		if (miedad >= edad) {

			if (titulo || paro) {
				System.out
						.println("Felicidades!! Tienes una beca garantizada.");
			} else {
				System.out.println(
						"Lo sentimos pero no cumple los requisitos...");
			}

		} else {
			System.out.println(
					"Tienes que ser mayor de edad para optar a esta beca.");
		}
		scanner.close();
	}

}
