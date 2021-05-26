package exercise2_poo_model;

public class Hotel {
	private String nombre;
	private Integer numeroHabitaciones;
	private Integer numeroDePlantas;
	private Integer superficieTotalHotel;

	public Hotel() {

	}

	public Hotel(String nombre, Integer numeroHabitaciones,
			Integer numeroDePlantas, Integer superficieTotalHotel) {
		super();
		this.nombre = nombre;
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroDePlantas = numeroDePlantas;
		this.superficieTotalHotel = superficieTotalHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public Integer getNumeroDePlantas() {
		return numeroDePlantas;
	}

	public Integer getSuperficieTotalHotel() {
		return superficieTotalHotel;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroHabitaciones(Integer numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public void setNumeroDePlantas(Integer numeroDePlantas) {
		this.numeroDePlantas = numeroDePlantas;
	}

	public void setSuperficieTotalHotel(Integer superficieTotalHotel) {
		this.superficieTotalHotel = superficieTotalHotel;
	}

	public void calcularManteniment() {

	}

	void donarDeBaixaHotel() {

	}

	void veureHotel() {

	}

	void modificarHotel() {

	}
}
