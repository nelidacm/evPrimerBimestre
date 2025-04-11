package Chavez1;

import java.util.Scanner;

public class Ejercicio19 {
public static void main(String[] args) throws InterruptedException{
	Scanner datos = new Scanner(System.in);

	int contrasena;
	int intentos = 0;

	do {

		System.out.println("Ingresa tu contrasena: ");
		contrasena = datos.nextInt();

		if (contrasena != 2009) {
			Thread.sleep(1000); // Demorar un segundo (1000 mili segundos)

			intentos++; // intentos = intentos + 1, le suma 1

			if (intentos < 3) {
				System.out.println("Volve a intentarlo. ");
			}

		}

	} while (contrasena != 2009 && intentos < 3);

	if (contrasena == 2009) {
		System.out.println("Contrasena correcta.");
	}
	if (contrasena != 2009) {
		System.err.println("Bloqueaste el usuario ");
	}
	
	
	
	
	
	
	
}
}
