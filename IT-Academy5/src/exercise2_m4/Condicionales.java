package exercise2_m4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {

		Student.addStudents();
	}

	static class Student {
		static String nombre = "";
		static String apellidos = "";
		static Integer edad = 0;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			Student.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			Student.apellidos = apellidos;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			Student.edad = edad;
		}

		public Student(String nombre, String apellidos, Integer edad) {
			super();
			Student.nombre = nombre;
			Student.apellidos = apellidos;
			Student.edad = edad;
		}

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

			try {
				Student.edad = Integer.parseInt(
						JOptionPane.showInputDialog("Introduzca su edad"));

			} catch (Exception e) {
				System.out.println(
						"Tiene que introducir un numero" + e.getMessage());
			}

			System.out.println("Introduzca nombre de usuario");
			nombre = datos.nextLine();

			System.out.println("Introduzca los apellidos");
			apellidos = datos.nextLine();

			if (Student.edad <= 5) {
				System.out.println("Hola:" + " " + Student.nombre + "\n"
						+ "Estas en: Preescolar");
			} else if (Student.edad > 5 && Student.edad <= 11) {
				System.out.println("Hola:" + " " + Student.nombre + "\n"
						+ "Estas en: Primaria");
			} else if (Student.edad > 11 && Student.edad <= 15) {
				System.out.println("Hola:" + " " + Student.nombre + "\n"
						+ "Estas en la: ESO");
			} else if (Student.edad > 15 && Student.edad <= 18) {
				System.out.println("Hola:" + " " + Student.nombre + "\n"
						+ "Estas en el: Bachillerato");
			} else {
				System.out.println("Hola:" + " " + Student.nombre + "\n"
						+ "Estas en la: Universidad");
			}
			System.out.println("Hasta luego!");
			System.out.println(
					nombre + "\n " + apellidos + "\n " + edad + "Años");
			datos.close();

		}

	}

}
