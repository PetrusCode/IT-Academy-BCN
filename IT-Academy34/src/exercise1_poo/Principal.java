package exercise1_poo;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crea un nuevo proyecto Java con una clase llamada "Ordenador", adem�s
		 * de la clase que contiene el main.
		 * 
		 * Esta clase tendr� como atributos la marca, el modelo, el procesador,
		 * la cantidad de memoria RAM y la capacidad del disco duro.
		 * 
		 * La aplicaci�n debe poder generar ordenadores de diferentes maneras:
		 * 
		 * S�lo a partir de la marca y el modelo
		 * 
		 * Indicando todos los atributos.
		 * 
		 * La clase Ordenador debe disponer de los siguientes m�todos :
		 * 
		 * m�todos que permitan consultar cada uno de los atributos m�todos que
		 * permitan modificar el procesador, la cantidad de memoria ram y la
		 * capacidad del disco duro un m�todo que recibir� un string por
		 * par�metro y devolver� un string que diga:
		 * "En estos momentos se est� ejecutando: 'X'" (X es el par�metro
		 * recibido por el m�todo y que normalmente ser� el nombre de un
		 * programa) Ejemplo: " en estos momentos se est� ejecutando: Eclipse "
		 * un m�todo que devolver� una descripci�n completa del ordenador
		 * (toString ()). Al main del proyecto crea ordenadores de las 2 maneras
		 * posibles y comprueba que los m�todos creados funcionan correctamente
		 * .
		 */

		Ordenador ordenador = new Ordenador();
		ordenador.setMarca("MSI");
		ordenador.setModelo("Apache GE72");
		ordenador.getProcesador();
		ordenador.getRam();
		ordenador.getDiscoDuro();
		System.out.println(ordenador);
	}

}
