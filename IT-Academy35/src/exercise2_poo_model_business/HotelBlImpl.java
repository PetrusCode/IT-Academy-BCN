package exercise2_poo_model_business;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import exercise2_poo_model.Hotel;
import exercise2_poo_model_business_contracts.HotelBl;
import exercise2_poo_model_dao.GestorDeArchivoDao;
import exercise2_poo_model_dao.HotelDaoImpl;
import exercise2_poo_model_dao_contracts.HotelDao;
import exercise2_poo_model_util.Configuracion;

public class HotelBlImpl implements HotelBl {

	@SuppressWarnings("unused")
	private HotelDao hotelDao;

	public HotelBlImpl(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}

	public HotelBlImpl() {

	}

	@Override
	public void calcularManteniment() {
		int habitacionesXpersona = 20;
		int salarioXpersona = 1500;
		int personasNecesarias;
		int costeTotalSrvicio;
		int habitaciones = 0;

		Scanner scanner = new Scanner(System.in);
		Hotel hotelMantenimiento = new Hotel();
		System.out.println("Ingrese el numero de habitaciones del hotel");

		hotelMantenimiento.setNumeroHabitaciones(scanner.nextInt());
		habitaciones = hotelMantenimiento.getNumeroHabitaciones();
		personasNecesarias = habitaciones / habitacionesXpersona;

		costeTotalSrvicio = salarioXpersona * personasNecesarias;
		System.out.println("Se necesitan" + " " + personasNecesarias + " "
				+ "personas para atender el servicio del Hotel, con un coste total de "
				+ costeTotalSrvicio + "€");

		scanner.close();
		/*
		 * calcularManteniment (). Este método debe tener en cuenta que cada
		 * persona del servicio puede atender 20 habitaciones y deberá mostrar
		 * cuántas personas son necesarias para atender el servicio de
		 * habitaciones del hotel y cuál es el coste total destinado al servicio
		 * sabiendo que estas personas cobran 1.500 € al mes.
		 */
	}

	static Properties prop = null;
	static InputStream input = null;
	static {
		prop = new Properties();

		try {
			input = HotelBlImpl.class.getResourceAsStream("/config.properties");
			prop.load(input);
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	@Override
	public boolean crear(Hotel hotel) throws IOException {
		HotelDao hotelDao = new HotelDaoImpl();
		GestorDeArchivoDao gestor = new GestorDeArchivoDao(
				Configuracion.getTxtFileName());

		try {
			gestor.start();
			gestor.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return hotelDao.crear(hotel);
	}

}
