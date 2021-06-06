package com.itacademy.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	/*
	 * Programa una aplicación que tenga programadas todas las opciones del
	 * siguiente menú:
	 * 
	 * 0.- Salir de la aplicación 1.- Crear cliente 2.- Mostrar cliente 3.-
	 * Eliminar cliente 4.- Crear cuenta de un cliente 5.- Mostrar una cuenta de
	 * un cliente 6.- Mostrar las cuentas de un cliente 7.- Eliminar una cuenta
	 * de un cliente 8.- Ingresar euros en una cuenta de un cliente 9.- Retirar
	 * euros en una cuenta de un cliente
	 */

	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuenta;

}
