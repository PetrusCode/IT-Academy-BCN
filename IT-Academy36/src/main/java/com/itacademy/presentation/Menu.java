package com.itacademy.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itacademy.model.Cliente;
import com.itacademy.model.Cuenta;

public class Menu {
	Scanner scanner = new Scanner(System.in);

	static Cliente cliente = new Cliente();
	static ArrayList<Cuenta> cuentas;
	public static List<Cliente> lista = null;
	static {

		lista = new ArrayList<Cliente>();
	}

	static void bancoMenu() {
		Scanner scanner = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println(
					"Seleccione una opcion: \n 1.Crear Cliente \n 2.Crear Cuenta de un Cliente"
							+ "\n 3.mostrarCliente \n 4.eliminarCliente \n 5.mostrarCuentaCliente \n 6.mostrarLasCuentasCliente"
							+ "\n 7.eliminarUnaCuentadeUnCliente \n 8.IngresarEurosCuentaCliente \n 9.retirarEurosCuentaCliente");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				crearCliente(cliente, cuentas);
				break;

			case 2:

				ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

				crearCuentaCliente(cuentas, lista.add(cliente));
				crearCliente(cliente, cuentas);

				break;
			case 3:
				mostrarCliente();
				break;
			case 4:
				eliminarCliente();

				break;
			case 5:
				mostrarCuentaCliente();

				break;
			case 6:
				mostrarLasCuentasCliente();

				break;
			case 7:
				eliminarUnaCuentadeUnCliente();

				break;

			case 8:
				IngresarEurosCuentaCliente();

				break;
			case 9:
				retirarEurosCuentaCliente();

				break;

			default:
				scanner.close();
			}
		} while (opcion != 0);
		scanner.close();
	}

	static boolean crearCliente(Cliente cliente, ArrayList<Cuenta> cuentas) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String nombre;
		String apellido;
		String nombreregistrado = null;

		try {
			nombreregistrado = lista.get(0).getNombre();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (nombreregistrado != null) {
			System.out.println("Nombre de cliente");
			nombre = scanner.nextLine();

			if (nombreregistrado.equals(nombre)) {
				cliente.setCuenta(cuentas);

				Cliente clienteCreado = new Cliente(nombre,
						cliente.getApellido(), cuentas);
				System.out.println("\n Su cuenta se ha creado correctamente");
				return lista.add(clienteCreado);
			}
		}
		System.out.println("Nombre de cliente");
		nombre = scanner.nextLine();
		cliente.setNombre(nombre);
		System.out.println("Apellido de cliente");
		apellido = scanner.nextLine();
		cliente.setApellido(apellido);

		if (cuentas == null) {
			System.out.println("Gracias por registrarse con nosotros");
		} else {
			cliente.setCuenta(cuentas);
		}

		Cliente clienteCreado = new Cliente(nombre, apellido, cuentas);

		return lista.add(clienteCreado);
	}

	static ArrayList<Cuenta> crearCuentaCliente(ArrayList<Cuenta> cuentas,
			boolean c) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Cuenta cuenta = new Cuenta();
		System.out.println("A continuacion ingrese numero de cuenta");

		cuenta.setNumCuenta(scanner.nextInt());

		System.out.println("Ingrese el dinero que desea depositar");
		cuenta.setSaldo(scanner.nextBigDecimal());

		cuentas.add(cuenta);

		return cuentas;

	}

	static void mostrarCliente() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String clientemostrado;

		System.out.println("Introduzca nombre cliente");
		clientemostrado = scanner.nextLine();
		if (clientemostrado.equals(lista.get(0).getNombre())) {
			System.out.println(cliente.toString()
					+ "\n Mostrando la cuenta del usuario: " + clientemostrado);
		} else {
			System.out.println("El cliente no existe");
		}

	}

	static void eliminarCliente() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String clienteEliminado = "";
		String clienteEncontrado;
		clienteEncontrado = lista.get(0).getNombre();
		System.out.println("Que cliente quiere eliminar");

		clienteEliminado = scanner.nextLine();
		for (int indice = 0; indice <= lista.size() - 1; indice++) {

			if (clienteEliminado.equals(clienteEncontrado)) {
				lista.clear();
				System.out.println("El cliente a sido eliminado");
			}
		}

	}

	static void mostrarCuentaCliente() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String nombreDueñoCuenta;
		String clienteBuscado = "";
		boolean encontrado = false;
		clienteBuscado = lista.get(0).getNombre();
		System.out.println("Introduzca su nombre");
		nombreDueñoCuenta = scanner.nextLine();

		for (int indice = 0; indice <= lista.size() - 1; indice++) {

			if (nombreDueñoCuenta.equals(clienteBuscado)
					&& (!encontrado == true)) {
				System.out.println("Su cuenta es:");
				System.out.println(lista.get(0).getCuenta());
				encontrado = true;
				if (lista.get(0).getCuenta() == null) {
					System.out.println("No tiene ninguna cuenta con nosotros");
				}

			} else if (!nombreDueñoCuenta.equals(clienteBuscado)) {
				System.out
						.println("No esta registrado en nuestra base de datos");
				break;
			}
		}

	}

	static void mostrarLasCuentasCliente() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String nombrePersona;
		String clienteBuscadoCuentas;
		boolean encontrado = false;
		clienteBuscadoCuentas = lista.get(0).getNombre();

		System.out.println("Introduzca el nombre");
		nombrePersona = scanner.nextLine();
		for (int indice = 0; indice <= lista.get(0).getCuenta().size()
				- 1; indice++) {

			if (nombrePersona.equals(clienteBuscadoCuentas)
					&& (!encontrado == true)) {
				System.out.println("Sus cuentas son:");
				for (int index = 0; index <= lista.size() - 1; index++) {
					System.out.println(lista.get(index).getCuenta());
				}

				encontrado = true;
			}

		}

	}

	static void eliminarUnaCuentadeUnCliente() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer cuentaClienteEliminada;
		Integer cuentaBuscada;
		boolean encontrado = false;

		cuentaBuscada = lista.get(0).getCuenta().get(0).getNumCuenta();
		System.out.println("Introduzca numero de cuenta a eliminar");
		cuentaClienteEliminada = scanner.nextInt();

		for (int indice = 0; indice <= lista.get(0).getCuenta().size()
				- 1; indice++) {
			if (cuentaClienteEliminada.equals(cuentaBuscada)
					&& (!encontrado == true)) {
				lista.get(indice).getCuenta()
						.remove(lista.get(indice).getCuenta().size() - 1);
				System.out.println("La cuenta con numero" + cuentaBuscada
						+ " a sido eliminada ");
				encontrado = true;
			} else {
				System.out.println(
						"El numero de cuenta no coincide con ninguna cuenta existente");
			}
		}

	}

	static void IngresarEurosCuentaCliente() {
		BigDecimal dineroIngresado;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer numCuentaCuenta;
		Integer numCuentaIngresado;
		boolean encontrado = false;
		System.out.println("Introduzca el numero de cuenta");
		numCuentaIngresado = scanner.nextInt();

		System.out.println("Cuanto dinero desea ingresar en su cuenta?");
		dineroIngresado = scanner.nextBigDecimal();
		for (int indice = 0; indice <= lista.size() - 1; indice++) {

			numCuentaCuenta = lista.get(0).getCuenta().get(0).getNumCuenta();

			if (numCuentaIngresado.equals(numCuentaCuenta)
					&& (!encontrado == true)) {
				lista.get(0).getCuenta().get(0).ingresar(dineroIngresado);
				System.out.println("Se ha depositado la cantidad de: "
						+ dineroIngresado + "satisfactoriamente");
				encontrado = true;
			}
		}

	}

	static void retirarEurosCuentaCliente() {
		BigDecimal dineroRetirado;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer numCuentaCuenta;
		Integer numCuentaIngresado;
		boolean encontrado = false;
		System.out.println("Introduzca el numero de cuenta");
		numCuentaIngresado = scanner.nextInt();

		System.out.println("Cuanto dinero desea retirar de su cuenta?");
		dineroRetirado = scanner.nextBigDecimal();
		for (int indice = 0; indice <= lista.get(0).getCuenta().size()
				- 1; indice++) {

			numCuentaCuenta = lista.get(0).getCuenta().get(0).getNumCuenta();

			if (numCuentaIngresado == numCuentaCuenta
					&& (!encontrado == true)) {
				lista.get(0).getCuenta().get(0).retirar(dineroRetirado);
				System.out.println("Se ha retirado la cantidad de: "
						+ dineroRetirado + "satisfactoriamente");
				encontrado = true;
			}
		}
	}
}
