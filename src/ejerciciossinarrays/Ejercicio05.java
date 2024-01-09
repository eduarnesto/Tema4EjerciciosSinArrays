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
		double minimo;

		// Variable para guardar el maximo
		double maximo;

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

		// Asigno el primer numero al maximo para luego compararlos con los demás para
		// saber si es el mayor
		maximo = tabla[0];

		// Asigno el primer numero al minimo para luego compararlos con los demás para
		// saber si es el menor
		minimo = tabla[0];

		// Bucle para mostrar los números de la tabla de uno en uno en orden inverso
		for (int i = 0; i < tabla.length; i++) {
			// Sumo los numeros que forman la tabla
			suma += tabla[i];

			// Compruebo cual es el mayor número, si el numero es mayor que el valor que
			// tiene el maximo es sustituido por el maximo
			if (tabla[i] > maximo) {
				maximo = tabla[i];
			}

			// Compruebo cual es el menor número, si el numero es menor que el valor que
			// tiene el minimo es sustituido por el minimo
			if (tabla[i] < minimo) {
				minimo = tabla[i];
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
