package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Tabla para guardar los meses
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		//Tabla para guardar las temperaturas medias
		int media[] = new int[12];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < media.length; i++) {
			// Pregunto por un número
			System.out.println("Introduzca la temperatura media de " + meses[i]);

			// Leo del teclado
			media[i] = sc.nextInt();
		}

		// Bucle para mostrar la temepratura media de cada mes
		for (int i = 0; i < media.length; i++) {
			System.out.print(meses[i] + ": ");
			for (int j = 0; j<media[i];j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		// Cierro el Scanner
		sc.close();

	}

}