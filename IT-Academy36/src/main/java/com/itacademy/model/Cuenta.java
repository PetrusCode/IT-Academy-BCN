package com.itacademy.model;

import java.math.BigDecimal;

import com.itacademy.exceptions.DineroInsuficienteException;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cuenta {

	private Integer numCuenta;
	private BigDecimal saldo;

	public BigDecimal ingresar(BigDecimal cantidad) {

		return this.saldo = cantidad.add(cantidad);
	}

	public void retirar(BigDecimal cantidad) {
		BigDecimal saldoNuevo = this.saldo.subtract(cantidad);
		if (saldoNuevo.compareTo(BigDecimal.ZERO) < 0) {
			throw new DineroInsuficienteException("Dinero insuficiente");
		}
		this.saldo = saldoNuevo;

	}
}
