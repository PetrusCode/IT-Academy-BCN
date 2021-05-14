package MuestraStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToString {
	public static Integer numero = 0;
	public static String resultado = "";

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String texto = "";
		System.out.println("Cuantas palabras quiere introducir ?");
		numero = scanner.nextInt();

		System.out.println("Introduce la palabra");
		texto = scanner.next();

		for (int indice = 0; indice <= numero; indice++) {
			System.out.println("Su palabra: " + texto + "-"
					+ "numero de palabra: " + indice);

			array.add(texto);
			System.out.println("Listado #" + indice + " " + array);

		}

		scanner.close();
	}

}
