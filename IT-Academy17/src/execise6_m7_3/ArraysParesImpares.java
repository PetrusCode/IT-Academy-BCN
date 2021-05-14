package execise6_m7_3;

public class ArraysParesImpares {

	public static void main(String[] args) {
		// Dado un array de números, el programa debe mostrar la suma de todos
		// los números pares y la suma de todos los números impares.
		int sumaPares = 0;
		int sumaImpar = 0;
		int[] matrix = new int[100];

		for (int index = 1; index < matrix.length; index++) {

			if (index % 2 == 0) {
				sumaPares += index;

				System.out.println(sumaPares + " " + "Suma numero par");
				System.out.println(
						"_______________________________________________");
			} else if (index % 2 != 0) {
				sumaImpar += index;
				System.out.println(sumaImpar + " " + "Suma numero impar");
			}
		}
	}

}
