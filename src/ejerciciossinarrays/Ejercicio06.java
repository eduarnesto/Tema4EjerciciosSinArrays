package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Tabla para guardar 8 números
		int tabla[] = new int[8];

		// Variable para guardar el número que escriba el usuario
		int num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < tabla.length; i++) {
			// Pregunto por un número
			System.out.println("Introduzca un número decimal");

			// Leo del teclado
			num = sc.nextInt();

			// Asigno el numero a un espacio de la tabla
			tabla[i] = num;
		}

		// Bucle para mostrar los números de la tabla de uno en uno indicando si son pares
		for (int pos : tabla) {
			//Muestro el número
			System.out.print("El número " + pos + " es ");
			
			//Compruebo si es par
			if(pos%2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
		}

		// Cierro el Scanner
		sc.close();

	}

}
