package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// Menu

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese opcion: ");
		System.out.println("1 Sumar \n2 Restar \n3 Multiplicar \n4 Dividir");

		int opcion = Integer.parseInt(entrada.nextLine());

		switch (opcion) {
		case 1:
			System.out.println("Suma");
			break;

		case 2:
			System.out.println("Resta");
			break;

		case 3:
			System.out.println("Multiplicacion");
			break;

		case 4:
			System.out.println("Dividir");
			break;

		default:
			System.out.println("Opcion inexistente");
			break;
		}
		entrada.close();
		

	}

}
