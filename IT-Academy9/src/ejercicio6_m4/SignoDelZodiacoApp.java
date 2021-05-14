package ejercicio6_m4;

import java.util.Scanner;

public class SignoDelZodiacoApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Integer dia = 0;
		String mes = "";
		System.out.println("Dime tu mes de nacimiento");
		mes = scanner.nextLine();
		System.out.println("Dime tu dia de nacimiento");
		dia = scanner.nextInt();
		if ((mes.equals("enero") || mes.equals("diciembre"))) {
			if (mes.equals("enero")) {
				if (dia <= 20) {
					System.out.println("Eres Capricornio");
				}
			} else if (mes.equals("diciembre")) {
				if (dia >= 22) {
					System.out.println("Eres Capricornio");
				} else if (dia <= 21) {
					System.out.println("Eres Sagitario ");
				}
			}
		} else if (mes.equals("noviembre")) {
			if (dia >= 23) {
				System.out.println("Eres Sagitario ");
			} else if (dia <= 22) {
				System.out.println("Eres Escorpion");
			}
		} else if (mes.equals("octubre")) {
			if (dia >= 24) {
				System.out.println("Eres Escorpion");
			} else if (dia <= 23) {
				System.out.println("Eres Libra");
			}
		} else if (mes.equals("septiembre")) {
			if (dia >= 24) {
				System.out.println("Eres Libra");
			} else if (dia <= 23) {
				System.out.println("Eres Virgo");
			}
		} else if (mes.equals("agosto")) {
			if (dia >= 24) {
				System.out.println("Eres Virgo");
			} else if (dia <= 23) {
				System.out.println("Eres Leo");
			}
		} else if (mes.equals("julio")) {
			if (dia >= 23) {
				System.out.println("Eres Leo");
			} else if (dia <= 22) {
				System.out.println("Eres Cancer");
			}

		} else if (mes.equals("junio")) {
			if (dia >= 22) {
				System.out.println("Eres Cancer");
			} else if (dia <= 21) {
				System.out.println("Eres Geminis ");
			}
		} else if (mes.equals("enero")) {
			if (dia >= 21) {
				System.out.println("Eres Acuario ");
			}
		} else if (mes.equals("febrero")) {
			if (dia <= 18) {
				System.out.println("Eres Acuario ");
			} else if (dia >= 19) {
				System.out.println("Eres Piscis");
			}
		} else if (mes.equals("marzo")) {
			if (dia <= 20) {
				System.out.println("Eres Piscis");
			} else if (dia >= 21) {
				System.out.println("Eres Aries ");
			}
		} else if (mes.equals("mayo")) {
			if (dia >= 22) {
				System.out.println("Eres Geminis");
			} else if (dia <= 21) {
				System.out.println("Eres Tauro");
			}
		} else if (mes.equals("abril")) {
			if (dia >= 21) {
				System.out.println("Eres Tauro ");
			} else if (dia <= 20) {
				System.out.println("Eres Aries ");
			}
		}

		System.out.println("Hasta luego");
		scanner.close();
	}

}
