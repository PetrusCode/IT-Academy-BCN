package exercise5_m7_1;

public class OtravezPares {

	public static void main(String[] args) {
		// Muestra por pantalla los números pares comprendidos entre el 100 y el
		// 0 en orden descendente.
		int resultado = 0;
		int[] matrix = new int[100];

		for (int indice = 0; indice <= matrix.length; indice++) {

			if (indice % 2 == 0) {
				resultado = indice;
				System.out.println(resultado);
			}
		}

	}

}
