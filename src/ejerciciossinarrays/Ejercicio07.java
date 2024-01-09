package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Tabla para guardar los meses
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Agosto", "Octubre", "Noviembre", "Diciembre"};

		//Tabla para guardar las temperaturas medias
		int media[] = new int[12];
		
		// Variable para guardar el número que escriba el usuario
		int num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < media.length; i++) {
			// Pregunto por un número
			System.out.println("Introduzca la temperatura media de " + meses[i]);

			// Leo del teclado
			num = sc.nextInt();
		}

		// Bucle para mostrar 
		for (int i = 0; i < tabla.length; i++) {
			//Muestro el número
			System.out.print("El número " + tabla[i] + " es ");
			
			//Compruebo si es par
			if(tabla[i]%2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
		}

		// Cierro el Scanner
		sc.close();

	}

}