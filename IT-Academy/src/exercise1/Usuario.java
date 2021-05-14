package exercise1;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Student.addStudents();
	}

	static class Student {
		static String nombre = "";
		static String apellidos = "";
		static Integer edad = 0;

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			Student.nombre = nombre;
		}

		/**
		 * @return the apellidos
		 */
		public String getApellidos() {
			return apellidos;
		}

		/**
		 * @param apellidos the apellidos to set
		 */
		public void setApellidos(String apellidos) {
			Student.apellidos = apellidos;
		}

		/**
		 * @return the edad
		 */
		public Integer getEdad() {
			return edad;
		}

		/**
		 * @param edad the edad to set
		 */
		public void setEdad(Integer edad) {
			Student.edad = edad;
		}

		public Student(String nombre, String apellidos, Integer edad) {
			super();
			Student.nombre = nombre;
			Student.apellidos = apellidos;
			Student.edad = edad;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Student [nombre=");
			builder.append(nombre);
			builder.append(", apellidos=");
			builder.append(apellidos);
			builder.append(", edad=");
			builder.append(edad);
			builder.append(", getNombre()=");
			builder.append(getNombre());
			builder.append(", getApellidos()=");
			builder.append(getApellidos());
			builder.append(", getEdad()=");
			builder.append(getEdad());
			builder.append("]");
			return builder.toString();
		}

		public static void addStudents() {
			Scanner datos = new Scanner(System.in);

			System.out.println("Introduzca nombre de usuario");
			nombre = datos.nextLine();

			System.out.println("Introduzca los apellidos");
			apellidos = datos.nextLine();

			System.out.println("Introduzca la edad");
			edad = datos.nextInt();

			System.out.println("Hasta luego!");
			System.out.println(nombre + "\n " + apellidos + "\n " + edad);
			datos.close();

		}
	}

}
