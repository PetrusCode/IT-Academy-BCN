package exercise2_poo_model;

public class Hotel {

	private String nombre;
	private Integer numeroHabitaciones;
	private Integer numeroDePlantas;
	private String superficieTotalHotel;

	public Hotel() {

	}

	public Hotel(String nombre, Integer numeroHabitaciones,
			Integer numeroDePlantas, String superficieTotalHotel) {
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

	public String getSuperficieTotalHotel() {
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

	public void setSuperficieTotalHotel(String string) {
		this.superficieTotalHotel = string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((numeroDePlantas == null) ? 0 : numeroDePlantas.hashCode());
		result = prime * result + ((numeroHabitaciones == null) ? 0
				: numeroHabitaciones.hashCode());
		result = prime * result + ((superficieTotalHotel == null) ? 0
				: superficieTotalHotel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroDePlantas == null) {
			if (other.numeroDePlantas != null)
				return false;
		} else if (!numeroDePlantas.equals(other.numeroDePlantas))
			return false;
		if (numeroHabitaciones == null) {
			if (other.numeroHabitaciones != null)
				return false;
		} else if (!numeroHabitaciones.equals(other.numeroHabitaciones))
			return false;
		if (superficieTotalHotel == null) {
			if (other.superficieTotalHotel != null)
				return false;
		} else if (!superficieTotalHotel.equals(other.superficieTotalHotel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [nombre=");
		builder.append(nombre);
		builder.append(", numeroHabitaciones=");
		builder.append(numeroHabitaciones);
		builder.append(", numeroDePlantas=");
		builder.append(numeroDePlantas);
		builder.append(", superficieTotalHotel=");
		builder.append(superficieTotalHotel);
		builder.append("]");
		return builder.toString();
	}

}
