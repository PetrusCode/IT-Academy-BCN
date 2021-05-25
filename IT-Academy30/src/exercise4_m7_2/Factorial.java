package exercise4_m7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Realizar un programa donde el usuario introduce un número y el
		// programa le devuelve el factorial del número introducido
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		String lista = "1";
		Integer operacion = 1;
		String fin = "";
		List<Integer> resultado = new ArrayList<Integer>();

		System.out.println("Introduzca un numero y le devuelvo el factorial");
		numero = scanner.nextInt();

		for (int indice = 2; indice <= numero; indice++) {
			String operador = "*";
			operacion *= indice;
			resultado.add(operacion);
			lista += "*" + indice;
			System.out.println(
					"Resultados del factorial: " + lista + "=" + resultado);
		}

		System.out.println(
				"El factorial de: " + numero + " " + lista + "= " + operacion);

		System.out.println("Quiere continuar calculando factoriales ? SI/NO");
		fin = scanner.next();
		if (fin.equalsIgnoreCase("si")) {
			main(args);

		} else {
			System.out.println("ADIOS");
			return;
		}

	}

}
