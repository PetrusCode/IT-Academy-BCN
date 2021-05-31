package exercise2_poo_model_dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exercise2_poo_model.Hotel;
import exercise2_poo_model_dao_contracts.HotelDao;

public class HotelDaoImpl implements HotelDao {

	private static ArrayList<Hotel> arrayHotel = null;

	static {
		arrayHotel = new ArrayList<Hotel>();
	}

	@Override
	public boolean crear(Hotel hotel) {

		try {
			agregarHotelArchivo(hotel);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return arrayHotel.add(hotel);

	}

	public boolean agregarHotelArchivo(Hotel hotel) throws IOException {
		@SuppressWarnings("unused")
		HotelDao hotelDao = new HotelDaoImpl();

		try (FileWriter writer = new FileWriter(
				GestorDeArchivoDao.getNameFile("txt"), true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
			bufferedWriter.write(hotel.toString());
			bufferedWriter.write(System.lineSeparator());

		} catch (IOException e) {
			e.printStackTrace();

			throw e;
		}
		return true;

	}

	public ArrayList<Hotel> donarDeBaixaHotel() {
		String nombreBaja;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Que Hotel desea eliminar ?");
		nombreBaja = scanner.nextLine();
		if (arrayHotel.isEmpty()) {
			System.out.println("No se ha creado ningun hotel");
		} else {
			String first = arrayHotel.get(0).getNombre();

			// Hotel last = arrayHotel.get(arrayHotel.size() - 1);
			for (int indice = 0; indice <= arrayHotel.size() - 1; indice++) {

				if (nombreBaja.equals(first)) {
					arrayHotel.removeAll(arrayHotel);
				}
			}

		}

		scanner.close();
		return arrayHotel;
		/*
		 * El método donarDeBaixaHotel () debe pedir qué hotel se quiere dar de
		 * baja. El usuario introducirá el nombre del hotel y si el hotel está
		 * dentro del array, lo eliminaremos y mostraremos un mensaje por
		 * pantalla informando al usuario que hemos eliminado el hotel. Si no
		 * hemos encontrado el hotel dentro del array, avisaremos al usuario
		 * diciendo que el hotel no estaba dentro de nuestra aplicación.
		 */
	}

	public ArrayList<Hotel> veureHotelDao() {
		String nombreMuestra;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Que Hotel desea mostrar ?");

		nombreMuestra = scanner.nextLine();
		if (arrayHotel.isEmpty()) {
			System.out.println("No se ha creado ningun hotel");
		} else {
			String first = arrayHotel.get(0).getNombre();

			if (nombreMuestra.equals(first)) {
				for (int indice = 0; indice <= arrayHotel.size()
						- 1; indice++) {
					System.out.println(arrayHotel.toString());
				}
			} else {
				System.out.println(
						"Este Hotel no se encuentra en la aplicacion.");

			}
		}

		// Hotel last = arrayHotel.get(arrayHotel.size() - 1);

		scanner.close();
		return arrayHotel;
		/*
		 * El método veureHotel () debe pedir al usuario el nombre del hotel que
		 * quiere que mostramos por pantalla, si el hotel está en nuestra
		 * aplicación, le mostraremos el hotel, si no está, informaremos el
		 * usuario diciendo que el hotel que nos ha pedido no está dentro de
		 * nuestra aplicación.
		 */

	}

	public ArrayList<Hotel> modificarHotel() {
		int opcion = 0;
		String nombreModificar;
		Integer habitacionesMod = 0;
		Integer plantasMod = 0;
		String superficieNueva = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Que Hotel desea modificar ?");

		nombreModificar = scanner.nextLine();
		if (arrayHotel.isEmpty()) {
			System.out.println("No se ha creado ningun hotel");

		} else {
			String first = arrayHotel.get(0).getNombre();

			if (nombreModificar.equals(first)) {
				System.out.println("Que desea modificar "
						+ "\n 1.Numero de habitaciones \n 2.Numero de plantas \n 3.SuperficieTotal");
				opcion = scanner.nextInt();
				if (opcion == 1) {
					System.out.println("Introduzca las nuevas habitaciones");
					habitacionesMod = scanner.nextInt();
					arrayHotel.get(0).setNumeroHabitaciones(habitacionesMod);

				} else if (opcion == 2) {
					System.out.println("Introduzca el nuevo numero de plantas");
					plantasMod = scanner.nextInt();
					arrayHotel.get(0).setNumeroDePlantas(plantasMod);
				} else if (opcion == 3) {
					System.out.println("Introduzca la nueva superficie");
					superficieNueva = scanner.nextLine();
					arrayHotel.get(0).setSuperficieTotalHotel(superficieNueva);
				}
			}
		}

		/*
		 * El método modificarHotel () debe pedir al usuario qué hotel quiere
		 * modificar. El usuario introducirá el nombre del hotel. Si lo tenemos
		 * en la aplicación, se le pedirá si desea modificar el número de
		 * habitaciones, el número de plantas o la superficie total del hotel.
		 * Haremos la modificación pertinente y avisaremos al usuario que la
		 * modificación se ha realizado.
		 */
		scanner.close();
		return arrayHotel;
	}

}
