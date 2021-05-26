package exercise1_poo;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crea un nuevo proyecto Java con una clase llamada "Ordenador", además
		 * de la clase que contiene el main.
		 * 
		 * Esta clase tendrá como atributos la marca, el modelo, el procesador,
		 * la cantidad de memoria RAM y la capacidad del disco duro.
		 * 
		 * La aplicación debe poder generar ordenadores de diferentes maneras:
		 * 
		 * Sólo a partir de la marca y el modelo
		 * 
		 * Indicando todos los atributos.
		 * 
		 * La clase Ordenador debe disponer de los siguientes métodos :
		 * 
		 * métodos que permitan consultar cada uno de los atributos métodos que
		 * permitan modificar el procesador, la cantidad de memoria ram y la
		 * capacidad del disco duro un método que recibirá un string por
		 * parámetro y devolverá un string que diga:
		 * "En estos momentos se está ejecutando: 'X'" (X es el parámetro
		 * recibido por el método y que normalmente será el nombre de un
		 * programa) Ejemplo: " en estos momentos se está ejecutando: Eclipse "
		 * un método que devolverá una descripción completa del ordenador
		 * (toString ()). Al main del proyecto crea ordenadores de las 2 maneras
		 * posibles y comprueba que los métodos creados funcionan correctamente
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
