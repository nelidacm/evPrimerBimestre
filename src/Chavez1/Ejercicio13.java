package Chavez1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);

		int hora = 0, minuto = 0, segundo = 0;

		System.out.println("\tIngrese el horario");
		
		System.out.println("Ingrese la hora: ");
		hora = ingreso.nextInt();
		System.out.println("Ingrese el minuto: ");
		minuto = ingreso.nextInt();
		System.out.println("Ingrese el segundo: ");
		segundo = ingreso.nextInt();
		if (hora >=0 && hora <=24) {
			System.out.println("valor valido");
		} else {
			System.out.println("valor incorrecto");
		}

	}
}
