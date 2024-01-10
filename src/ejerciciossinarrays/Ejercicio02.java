package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Tabla para guardar 5 números
		double tabla[] = new double[5];

		// Variable para guardar el número que escriba el usuario
		double num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < tabla.length; i++) {
			//Pregunto por un número
			System.out.println("Introduzca un número decimal");
			
			//Leo del teclado
			num = sc.nextDouble();
			
			//Asigno el numero a un espacio de la tabla
			tabla[i] = num;
		}

		// Bucle para mostrar los números de la tabla de uno en uno
		for (double pos : tabla) {
			System.out.println(pos);
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
