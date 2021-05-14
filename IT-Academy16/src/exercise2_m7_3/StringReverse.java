package exercise2_m7_3;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = "";

		// En este programa el usuario debe introducir un string y el programa
		// debe mostrar el string al revés
		System.out.println("Escriba algo");
		texto = scanner.nextLine();

		StringBuffer reverso = new StringBuffer(texto);

		System.out.println(reverso.reverse());
		scanner.close();
	}

}
