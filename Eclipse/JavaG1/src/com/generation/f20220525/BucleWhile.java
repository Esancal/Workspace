package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
  		
		System.out.println("Ingrese opcion: ");
		System.out.println("1 Sumar \n2 Restar \n3 Multiplicar \n4 Dividir");
  		int opcion = Integer.parseInt(sc.nextLine()); //capturando el ingreso de datos
  		
  		//Validar el ingreso erroneo de la opcion
  		
  		//While valida que la condicion sea verdadera
		while(opcion < 1 || opcion > 4) {
			System.out.println("Opcion incorrecta, ingrese nuevamente");

			System.out.println("1 Sumar \n2 Restar \n3 Multiplicar \n4 Dividir");
			opcion = Integer.parseInt(sc.nextLine()); //capturando el ingreso de datos
		}
		
	
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
	sc.close();
	}
}
