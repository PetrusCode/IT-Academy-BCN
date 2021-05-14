package exercise4_m4;

import java.util.Scanner;

public class MesesDelAño {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Integer meses = 0;
		String mes = "";

		System.out.println("Introduzca el mes del año:");
		mes = scanner.nextLine();
		if (!mes.isEmpty()) {

			if (mes.equalsIgnoreCase("enero")) {
				meses = 1;
			} else if (mes.equalsIgnoreCase("febrero")) {
				meses = 2;
			} else if (mes.equalsIgnoreCase("marzo")) {
				meses = 3;
			} else if (mes.equalsIgnoreCase("abril")) {
				meses = 4;
			} else if (mes.equalsIgnoreCase("mayo")) {
				meses = 5;
			} else if (mes.equalsIgnoreCase("junio")) {
				meses = 6;
			} else if (mes.equalsIgnoreCase("julio")) {
				meses = 7;
			} else if (mes.equalsIgnoreCase("agosto")) {
				meses = 8;
			} else if (mes.equalsIgnoreCase("septiembre")) {
				meses = 9;
			} else if (mes.equalsIgnoreCase("octubre")) {
				meses = 10;
			} else if (mes.equalsIgnoreCase("noviembre")) {
				meses = 11;
			} else if (mes.equalsIgnoreCase("diciembre")) {
				meses = 12;
			}

		}
		switch (meses) {
		case 1:
			System.out.println("El mes de enero tiene 31 dias");
			break;
		case 2:
			System.out.println("El mes de febrero tiene 28 dias");
			break;
		case 3:
			System.out.println("El mes de marzo tiene 31 dias");
			break;
		case 4:
			System.out.println("El mes de abril tiene 30 dias");
			break;
		case 5:
			System.out.println("El mes de mayo tiene 31 dias");
			break;
		case 6:
			System.out.println("El mes de junio tiene 30 dias");
			break;
		case 7:
			System.out.println("El mes de julio tiene 31 dias");
			break;
		case 8:
			System.out.println("El mes de agosto tiene 31 dias");
			break;
		case 9:
			System.out.println("El mes de septiembre tiene 30 dias");
			break;
		case 10:
			System.out.println("El mes de octubre tiene 31 dias");
			break;
		case 11:
			System.out.println("El mes de noviembre tiene 30 dias");
			break;
		case 12:
			System.out.println("El mes de diciembre tiene 31 dias");
			break;

		default:
			System.out.println("Escriba un mes por consola");

		}
		scanner.close();
	}

}
