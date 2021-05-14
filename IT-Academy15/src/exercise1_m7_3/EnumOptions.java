package exercise1_m7_3;

public enum EnumOptions {
	SALIR_DEL_PROGRAMA(0), CUADRADO(1), TRIANGULO(2), RECTANGULO(3), CIRCULO(4);

	private int value = 1;

	private EnumOptions(int value) {
		this.value = value;
	}

	public static EnumOptions fromValue(int value) {
		for (EnumOptions myEnum : EnumOptions.values()) {
			if (myEnum.value == value) {
				return myEnum;
			}
		}
		return null;
	}

	public int value() {
		return value;
	}
}
