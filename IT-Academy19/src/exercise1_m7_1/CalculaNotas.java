package exercise1_m7_1;

import java.util.Scanner;

public class CalculaNotas {

	static Scanner scanner = new Scanner(System.in);

	static Integer nota1 = 0;
	static Integer nota2 = 0;
	static Integer nota3 = 0;
	static Integer media = 0;

	public static void main(String[] args) {
		// Crea un programa donde el usuario introduce tres notas y el programa
		// calcula la media. Si la media es inferior a 5 debe mostrar el
		// siguiente mensaje por pantalla: "No has superado el curso. Tienes que
		// recuperar ", si la media está entre 5 y 7 debe mostrar:" Enhorabuena!
		// Has aprobado pero deberías seguir practicando ", si la media es
		// superior a 7 debe mostrar:"
		CalculaNotas.calculaMediaNota();

	}

	public static void calculaMediaNota() {

		System.out.println(
				"Bienvenido vamos a proceder a calcular las notas | Presione ENTER |");
		scanner.nextLine();

		System.out.println("Introduzca las notas a calcular");
		nota1 = scanner.nextInt();
		nota2 = scanner.nextInt();
		nota3 = scanner.nextInt();

		media = (nota1 + nota2 + nota3) / 3;

		if (media < 5) {
			System.out.println("No has superado el curso. Tienes que recuperar"
					+ "\n" + "Su calificacion es:" + media);
		} else if (media >= 5 || media <= 7) {
			System.out.println(
					"Enhorabuena! Has aprobado pero deberías seguir practicando"
							+ "\n" + "Su calificacion:" + media);
		} else if (media > 7) {
			System.out.println(
					"Enhorabuena! Has superado el curso! Pasa ya al siguiente nivel!"
							+ "\n" + "Su calificacion:" + media);
		}

	}

}
