package com.itacademy.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements List<Cliente> {
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

	/*
	 * public Cliente(ArrayList<Cuenta> cuenta) { this.cuenta = cuenta; }
	 */
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<Cliente> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Cliente e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends Cliente> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends Cliente> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public Cliente get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente set(int index, Cliente element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, Cliente element) {
		// TODO Auto-generated method stub

	}

	public Cliente remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<Cliente> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<Cliente> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
