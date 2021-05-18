package exercise2_m7_1;

import java.util.Scanner;

public class CalculaNotas2 {
	static Scanner scanner = new Scanner(System.in);
	static Integer numeroNotas = 0;
	static Integer nota1 = 0;
	static Integer count = 0;
	static Integer media = 0;
	static Integer acumulado = 0;

	public static void main(String[] args) {
		/*
		 * Un profesor quiere calcular las medias de las notas de toda la clase.
		 * Crea una aplicación donde el usuario introducirá un número por
		 * pantalla (el número corresponde al número de notas que quiere
		 * introducir) y el programa le pedirá que introduzca las notas de todos
		 * los alumnos.
		 * 
		 * Una vez las notas han sido introducidos , el programa devuelve lo
		 * siguiente:
		 * 
		 * Si la nota media es menor que 5:
		 * "La nota media de la clase está suspendida. Los alumnos deberían preguntar sus dudas y trabajar más"
		 * .
		 * 
		 * Si la nota es inferior a 7:
		 * "La nota media de la clase es buena, pero los alumnos deberían mejorar el trabajo personal"
		 * .
		 * 
		 * Para el resto de casos, el mensaje debe ser: "Enhorabuena! La nota
		 * media de la clase se corresponde con el
		 * 
		 * 
		 * Las notas deben estar comprendidas entre 0 y 10.
		 */
		calculaMediaNota();

	}

	public static void calculaMediaNota() {

		System.out.println(
				"Bienvenido vamos a proceder a calcular las notas | Presione ENTER |");
		scanner.nextLine();
		System.out.println(
				"Cuntas notas seran calculadas ? Introduzca un numero");
		numeroNotas = scanner.nextInt();
		count = numeroNotas;
		while (count != 0) {
			count--;

			System.out.println("Introduzca las notas a calcular");
			nota1 = scanner.nextInt();
			if (nota1 <= 10) {
				acumulado += nota1;
			} else {
				System.out.println(
						"Las notas deben estar comprendidas entre 0 y 10");
				calculaMediaNota();
			}
		}

		media = (acumulado) / numeroNotas;

		if (media < 5) {
			System.out.println(
					"La nota media de la clase está suspendida. Los alumnos deberían preguntar sus dudas y trabajar más"
							+ "\n" + "Su calificacion es:" + media);
		} else if (media >= 5 || media <= 7) {
			System.out.println(
					"La nota media de la clase es buena, pero los alumnos deberían mejorar el trabajo personal"
							+ "\n" + "Su calificacion:" + media);
		} else if (media > 7) {
			System.out.println(
					"Enhorabuena! La nota media de la clase se corresponde con el"
							+ "\n" + "Su calificacion:" + media);
		}

	}

}
