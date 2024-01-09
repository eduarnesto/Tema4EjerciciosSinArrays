package ejerciciossinarrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Tabla para guardar 10 números
		int tabla[] = new int [10];
		
		//Random para poder generar números aleatorios
		Random r = new Random();

		//Bucle para asignar a cada espacio de la tabla un número
		for (int i=0; i<tabla.length; i++) {
			tabla[i] = r.nextInt(1,101);
		}
		
		//Muestro la tabla
		System.out.println(Arrays.toString(tabla));
	}

}
