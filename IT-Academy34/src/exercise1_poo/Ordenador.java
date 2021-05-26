package exercise1_poo;

public class Ordenador {

	private String marca;
	private String modelo;
	private String procesador;
	private String ram;
	private String discoDuro;

	public Ordenador() {

	}

	public Ordenador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getProcesador() {
		this.procesador = "i7";
		return procesador;
	}

	public String getRam() {
		this.ram = "16gb-Ram";
		return ram;
	}

	public String getDiscoDuro() {
		this.discoDuro = "500Gb";
		return discoDuro;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setDiscoDuro(String discoDuro) {
		this.discoDuro = discoDuro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((discoDuro == null) ? 0 : discoDuro.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result
				+ ((procesador == null) ? 0 : procesador.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
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
		Ordenador other = (Ordenador) obj;
		if (discoDuro == null) {
			if (other.discoDuro != null)
				return false;
		} else if (!discoDuro.equals(other.discoDuro))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (procesador == null) {
			if (other.procesador != null)
				return false;
		} else if (!procesador.equals(other.procesador))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(
				"En estos momentos se esta ejecutando el Ordenador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", procesador=");
		builder.append(procesador);
		builder.append(", ram=");
		builder.append(ram);
		builder.append(", discoDuro=");
		builder.append(discoDuro);
		builder.append("]");
		return builder.toString();
	}

}
