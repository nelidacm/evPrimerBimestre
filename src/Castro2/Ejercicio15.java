package Castro2;

import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {
	Scanner ingreso = new Scanner(System.in);
	
	char remera;
	
	System.out.println("Ingrese su talle: ");
	remera = ingreso.next().charAt(0);
	switch(remera) {
	case 'S':
		System.out.println("Quedan 5 remeras");
	break;
	
	case'M':
		System.out.println("Quedan 2 remeras");
		break;
		
	case 'L':
		System.out.println("No quedan remeras");
		break;
		
		default:
			System.err.println("No tenemos esos talles");
		break;
	
	}
}
}
