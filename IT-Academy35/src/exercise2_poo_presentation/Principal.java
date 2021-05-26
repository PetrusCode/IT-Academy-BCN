package exercise2_poo_presentation;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		/*
		 * Nos piden crear una aplicaci�n para dar de alta, modificar, ver y
		 * eliminar hoteles.
		 * 
		 * La clase hotel deber� tener los siguientes atributos: nombre, n�mero
		 * de habitaciones, n�mero de plantas y superficie total del hotel. Como
		 * m�todos s�lo deber� tener los getters y setters propios de la clase y
		 * un m�todo llamado calcularManteniment (). Este m�todo debe tener en
		 * cuenta que cada persona del servicio puede atender 20 habitaciones y
		 * deber� mostrar cu�ntas personas son necesarias para atender el
		 * servicio de habitaciones del hotel y cu�l es el coste total destinado
		 * al servicio sabiendo que estas personas cobran 1.500 � al mes.
		 * 
		 * El m�todo crearHotel () deber� pedir al usuario que introduzca por
		 * pantalla los datos de nombre, n�mero de habitaciones, n�mero de
		 * plantas y superficie total del hotel. Una vez haya pedido todos estos
		 * datos, se debe instanciar el objeto de la clase y a�adirlo a un array
		 * de hoteles.
		 * 
		 * El m�todo donarDeBaixaHotel () debe pedir qu� hotel se quiere dar de
		 * baja. El usuario introducir� el nombre del hotel y si el hotel est�
		 * dentro del array, lo eliminaremos y mostraremos un mensaje por
		 * pantalla informando al usuario que hemos eliminado el hotel. Si no
		 * hemos encontrado el hotel dentro del array, avisaremos al usuario
		 * diciendo que el hotel no estaba dentro de nuestra aplicaci�n.
		 * 
		 * El m�todo veureHotel () debe pedir al usuario el nombre del hotel que
		 * quiere que mostramos por pantalla, si el hotel est� en nuestra
		 * aplicaci�n, le mostraremos el hotel, si no est�, informaremos el
		 * usuario diciendo que el hotel que nos ha pedido no est� dentro de
		 * nuestra aplicaci�n.
		 * 
		 * Cuando mostramos el hotel, adem�s, de mostrar el n�mero de
		 * habitaciones, n�mero de plantas y superficie total del hotel tambi�n
		 * se llamar� al m�todo calcularManteniment ().
		 * 
		 * El m�todo modificarHotel () debe pedir al usuario qu� hotel quiere
		 * modificar. El usuario introducir� el nombre del hotel. Si lo tenemos
		 * en la aplicaci�n, se le pedir� si desea modificar el n�mero de
		 * habitaciones, el n�mero de plantas o la superficie total del hotel.
		 * Haremos la modificaci�n pertinente y avisaremos al usuario que la
		 * modificaci�n se ha realizado.
		 */
		Menu.hotelMenu();
	}

}
