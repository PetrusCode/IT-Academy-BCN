package com.itacademy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cuenta {

	private Integer numCuenta;
	private Integer saldo;

	int ingresar(Integer cantidad) {

		return cantidad;

	}

	int retirar(Integer cantidad) {

		return cantidad;

	}
}
