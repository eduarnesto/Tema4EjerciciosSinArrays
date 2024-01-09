package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Tabla para guardar 10 números
		double tabla[] = new double[10];

		// Variable para guardar el número que escriba el usuario
		double num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < tabla.length; i++) {
			// Pregunto por un número
			System.out.println("Introduzca un número decimal");

			// Leo del teclado
			num = sc.nextDouble();

			// Asigno el numero a un espacio de la tabla
			tabla[i] = num;
		}

		// Bucle para mostrar los números de la tabla de uno en uno en orden inverso
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		// Cierro el Scanner
		sc.close();

	}

}
