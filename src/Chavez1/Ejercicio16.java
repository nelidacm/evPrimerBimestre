package Chavez1;

import java.util.Scanner;

public class Ejercicio16 {
public static void main(String[] args) {
	Scanner ingreso = new Scanner(System.in);
	
	int cafe;
	
	System.out.println("¿Que cafe va a pedir?");
	cafe = ingreso.nextInt();
	
	switch(cafe) {
	
	case 1: 
		System.out.println("Cafe cortado");
		break;
		
	case 2:
		System.out.println("Cafe latte");
		break;
		
	case 3:
		System.out.println("Cafe solo");
		break;
	
	case 4:
		System.out.println("Cafe lagrima");
		break;
	
	case 5:
		System.out.println("Saliste del programa");
	    break;
	
	default:
		System.out.println("Valor incorrecto");
        break;	
	}
}
}
