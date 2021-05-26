package exercise2_poo_presentation;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		/*
		 * Nos piden crear una aplicación para dar de alta, modificar, ver y
		 * eliminar hoteles.
		 * 
		 * La clase hotel deberá tener los siguientes atributos: nombre, número
		 * de habitaciones, número de plantas y superficie total del hotel. Como
		 * métodos sólo deberá tener los getters y setters propios de la clase y
		 * un método llamado calcularManteniment (). Este método debe tener en
		 * cuenta que cada persona del servicio puede atender 20 habitaciones y
		 * deberá mostrar cuántas personas son necesarias para atender el
		 * servicio de habitaciones del hotel y cuál es el coste total destinado
		 * al servicio sabiendo que estas personas cobran 1.500 € al mes.
		 * 
		 * El método crearHotel () deberá pedir al usuario que introduzca por
		 * pantalla los datos de nombre, número de habitaciones, número de
		 * plantas y superficie total del hotel. Una vez haya pedido todos estos
		 * datos, se debe instanciar el objeto de la clase y añadirlo a un array
		 * de hoteles.
		 * 
		 * El método donarDeBaixaHotel () debe pedir qué hotel se quiere dar de
		 * baja. El usuario introducirá el nombre del hotel y si el hotel está
		 * dentro del array, lo eliminaremos y mostraremos un mensaje por
		 * pantalla informando al usuario que hemos eliminado el hotel. Si no
		 * hemos encontrado el hotel dentro del array, avisaremos al usuario
		 * diciendo que el hotel no estaba dentro de nuestra aplicación.
		 * 
		 * El método veureHotel () debe pedir al usuario el nombre del hotel que
		 * quiere que mostramos por pantalla, si el hotel está en nuestra
		 * aplicación, le mostraremos el hotel, si no está, informaremos el
		 * usuario diciendo que el hotel que nos ha pedido no está dentro de
		 * nuestra aplicación.
		 * 
		 * Cuando mostramos el hotel, además, de mostrar el número de
		 * habitaciones, número de plantas y superficie total del hotel también
		 * se llamará al método calcularManteniment ().
		 * 
		 * El método modificarHotel () debe pedir al usuario qué hotel quiere
		 * modificar. El usuario introducirá el nombre del hotel. Si lo tenemos
		 * en la aplicación, se le pedirá si desea modificar el número de
		 * habitaciones, el número de plantas o la superficie total del hotel.
		 * Haremos la modificación pertinente y avisaremos al usuario que la
		 * modificación se ha realizado.
		 */
		Menu.hotelMenu();
	}

}
