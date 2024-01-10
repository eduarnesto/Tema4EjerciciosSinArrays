package ejerciciossinarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Tabla para guardar 100 números
		int tabla[] = new int [100];
		
		//Variable para guardar el número que introduce el usuario
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);

		//Bucle para asignar a cada espacio de la tabla un número
		for (int i=0; i<tabla.length; i++) {
			tabla[i] = (int) (1 + Math.random()*10);
		}
		
		//Pregunto por un número
		System.out.println("Introduzca un número entre 1 y 10:");
		
		//Leo del teclado
		num = sc.nextInt();
		
		//Busco la posion del numero en la tabla
		for (int i=0; i < tabla.length; i++) {
			if(num==tabla[i]) {
				System.out.println("El número aparece en la posición: " + (i+1));
			}
		}
		
		//Muestro la tabla
		System.out.println(Arrays.toString(tabla));
		
		//Cierro el Scanner
		sc.close();
	}

}