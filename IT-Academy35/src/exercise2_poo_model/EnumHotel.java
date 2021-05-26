package exercise2_poo_model;

public enum EnumHotel {
	CREAR_HOTEL(1), CALCULAR_MANTENIMIENTO(2), DAR_DE_BAJA_UNHOTEL(3),
	MOSTRAR_HOTEL(4), MODIFICAR_HOTEL(5), EXIT(6);

	private int value = 1;

	private EnumHotel(int value) {
		this.value = value;
	}

	public static EnumHotel fromValue(int value) {
		for (EnumHotel my : EnumHotel.values()) {
			if (my.value == value) {
				return my;
			}
		}
		return null;
	}

	public int value() {
		return value;
	}

}
