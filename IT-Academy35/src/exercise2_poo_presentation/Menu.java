package exercise2_poo_presentation;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import exercise2_poo_model.EnumHotel;
import exercise2_poo_model.Hotel;
import exercise2_poo_model_business.HotelBlImpl;
import exercise2_poo_model_business_contracts.HotelBl;
import exercise2_poo_model_dao.HotelDaoImpl;

public class Menu {

	public static void hotelMenu() throws IOException {
		HotelDaoImpl hotelDao = new HotelDaoImpl();
		HotelBl hotelBl = new HotelBlImpl();
		Scanner scanner = new Scanner(System.in);
		EnumHotel enumHotel = null;

		int opcion = 0;

		do {
			try {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("Elija una opcion porfavor ?"
								+ "\n 1.Crear Hotel \n 2.CalcularMantenimiento \n 3.Dar de baja un hotel \n 4.Mostrar Hotel \n 5.Modificar Hotel \n 6.Salir"));

			} catch (Exception e) {
				System.out.println("Introduzca un numero " + e.getMessage());
			}
			enumHotel = EnumHotel.fromValue(opcion);

			switch (enumHotel) {
			case CREAR_HOTEL:
				Hotel hotel = new Hotel();
				crearHotel(hotel, scanner);
				hotelBl.crear(hotel);
				break;

			case CALCULAR_MANTENIMIENTO:

				hotelBl.calcularManteniment();
				break;
			case DAR_DE_BAJA_UNHOTEL:
				hotelDao.donarDeBaixaHotel();
				break;
			case MOSTRAR_HOTEL:
				hotelDao.veureHotelDao();
				break;
			case MODIFICAR_HOTEL:
				hotelDao.modificarHotel();

				break;

			default:
				break;
			}
		} while (opcion != EnumHotel.EXIT.value());
		System.out.println("Salir");
		scanner.close();

	}

	public static void crearHotel(Hotel hotel, Scanner scanner) {
		char caracter = '\u00B2';
		System.out
				.println("Creando nuevo hotel. Presione ENTER para continuar");
		scanner.nextLine();

		System.out.println("Introduzca el nombre");

		hotel.setNombre(scanner.nextLine());

		System.out.println("Numero de habitaciones");
		hotel.setNumeroHabitaciones(Integer.parseInt(scanner.nextLine()));

		System.out.println("Numero de plantas");
		hotel.setNumeroDePlantas(Integer.parseInt(scanner.nextLine()));

		System.out.println("Superficie total del hotel");
		hotel.setSuperficieTotalHotel(scanner.next().concat("m" + caracter));

		/*
		 * El método crearHotel () deberá pedir al usuario que introduzca por
		 * pantalla los datos de nombre, número de habitaciones, número de
		 * plantas y superficie total del hotel. Una vez haya pedido todos estos
		 * datos, se debe instanciar el objeto de la clase y añadirlo a un array
		 * de hoteles.
		 */
	}

}
