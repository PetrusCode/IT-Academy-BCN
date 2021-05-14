package ejercicio4_m5;

import java.util.Scanner;

public class AleatorioNum {
	static Scanner scanner = new Scanner(System.in);
	static Integer numeroUsuario = 0;
	static Integer aleatorio = (int) Math.ceil(Math.random() * (10));

	public static void main(String[] args) {
		int intentos = 5;

		while (intentos != 0) {
			System.out.println("Introduce un numero entre 1/10");
			numeroUsuario = scanner.nextInt();
			if (numeroUsuario > 10) {
				System.out.println("El numero debe ser entre 1 y 10");
				System.out.println("Vuelve a intentarlo");
				return;
			}

			if (numeroUsuario == aleatorio) {
				System.out.println("Felicidades haz acertado!" + "\n"
						+ "Numero aleatorio: " + aleatorio);
				intentos--;
			} else if (numeroUsuario != aleatorio) {
				System.out.println("No haz acertado. MALA SUERTE!!" + " "
						+ "Numero aleatorio era: " + aleatorio);
				intentos--;
				System.out.println(
						"Te quedan" + " " + intentos + " " + "intentos");
				if (intentos == 0) {
					return;
				}

			}

		}

		scanner.close();

	}

}
