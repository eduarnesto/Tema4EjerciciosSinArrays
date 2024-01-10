package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Tabla para guardar 10 números
		double tabla[] = new double[10];

		// Variable para guardar el número que escriba el usuario
		double num;

		// Variable para guardar la suma de todos los números
		double suma = 0;

		// Variable para guardar el mínimo
		double minimo=Double.MAX_VALUE;

		// Variable para guardar el maximo
		double maximo=Double.MIN_VALUE;

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
		for (double pos : tabla) {
			// Sumo los numeros que forman la tabla
			suma += pos;

			// Compruebo cual es el mayor número, si el numero es mayor que el valor que
			// tiene el maximo es sustituido por el maximo
			if (pos > maximo) {
				maximo = pos;
			}

			// Compruebo cual es el menor número, si el numero es menor que el valor que
			// tiene el minimo es sustituido por el minimo
			if (pos < minimo) {
				minimo = pos;
			}

		}

		// Muestro cual es la suma de todos los números de la tabla
		System.out.println("La suma de todos los números da: " + suma);

		// Muestro cual es el maximo
		System.out.println("El maximo es: " + maximo);

		// Muestro cual es el minimo
		System.out.println("El minimo es: " + minimo);

		// Cierro el Scanner
		sc.close();

	}

}