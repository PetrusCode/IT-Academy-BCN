package ejercicio5_m5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BecasAlumnos {

	public static void main(String[] args) {
		int becas = 5;
		/*
		 * Tienes que modificar el programa de las becas (ahora el programa sólo
		 * debe poder dar 5 becas). El programa irá pidiendo los datos de los
		 * alumnos hasta que se den estas 5 becas. Una vez el programa haya
		 * asignado las 5 becas se debe mostrar por pantalla los nombres de los
		 * 5 alumnos que tienen beca.
		 */

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		List<String> personas = new ArrayList<String>();

		Integer edad = 18;
		Integer miedad;
		Boolean titulo;
		Boolean paro;

		System.out.println(
				"Bienvenidos esta es la mejor escuela de idiomas del mundo MUNDIAL!! ");
		scanner.nextLine();

		while (becas != 0) {
			System.out.println(
					"Si quiere una SUPER BECA con nosotros rellene los siguientes campos:");
			if (becas != 5) {
				System.out.println("Bienvenido de nuevo :)");
			}

			System.out.println(
					"_____________________________________________________");

			System.out.println("Cual es su nombre ?");
			String nombre = "";
			nombre = scanner.nextLine();

			for (int indice = 0; indice <= personas.size();) {

				for (int index = 0; index != 1; index++) {
					personas.add(indice, nombre);
				}

				break;
			}

			if (!nombre.isEmpty()) {
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
				miedad = Integer.parseInt(scanner.nextLine());

				if (miedad >= edad) {

					if (titulo || paro) {
						System.out.println(
								"Felicidades!! Tienes una beca garantizada.");
						becas--;
					} else {
						System.out.println(
								"Lo sentimos pero no cumple los requisitos...");
					}

				} else {
					System.out.println(
							"Tienes que ser mayor de edad para optar a esta beca.");
				}
			} else {
				System.out.println("Tiene que introducir su nombre");
				return;
			}

			if (becas == 0) {
				System.out.println("Se han agotado las becas");
				for (int indice = 0; indice <= personas.size() - 1; indice++) {
					System.out.println(personas.get(indice) + " "
							+ "Enhorabuena, esperamos que aproveches tu beca.");

				}
				return;
			}

		}

		scanner.close();
	}

}
