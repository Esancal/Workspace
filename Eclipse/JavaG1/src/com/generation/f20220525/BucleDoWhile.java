package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
  		int opcion;
		
		do {
			
			System.out.println("Ingrese opcion: ");
			System.out.println("(0) Salir \n(1) Sumar \n(2) Restar \n(3) Multiplicar \n(4) Dividir");
	  		opcion = Integer.parseInt(sc.nextLine()); //capturando el ingreso de datos
			
		}while(opcion<0 || opcion >4);
		System.out.println("Termino");
		
	}

}
