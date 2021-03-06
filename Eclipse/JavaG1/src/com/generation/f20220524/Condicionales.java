package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		
		// Definici?n de variables.
		int mayoriaEdad = 18;
		int saldoMinimo = 50000;
		int apuestaMinima = 10000;
		int edad;
		
		String nombre, apellido, direccion;

		Scanner entrada = new Scanner(System.in);
		// Solicitud de edad
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(entrada.nextLine());
		// Verificaci?n de mayor?a de edad
		if (edad < mayoriaEdad) {
			System.out.println("No est? permitido su ingreso");

		} else { // Solicitar datos personales, s?lo si cumple con la mayor?a de edad
			System.out.println("Bienvenido");
			System.out.println("Por favor, ingrese su nombre");
			nombre = entrada.nextLine();

			System.out.println("Por favor, ingrese sus apellidos");
			apellido = entrada.nextLine();

			System.out.println("Por favor, ingrese su direcci?n ej: Calle 123");
			direccion = entrada.nextLine();

			System.out.println("Ingrese su numero de telefono");
			int numeroTelefono = Integer.parseInt(entrada.nextLine());
			// Solicitar saldo
			System.out.println("Ingrese su saldo");
			int saldoActual = Integer.parseInt(entrada.nextLine());

			if (saldoActual >= saldoMinimo) {
				System.out.println("Autorizado para apostar"); // Validar saldo, si puede o no realizar apuestas
				System.out.println("?Cuanto desea apostar?");
				for(int i=1; i != 0; i++) {
					System.out.println("Ingrese su apuesta (Debe ser mayor a 10000, use el valor 0 para salir)");
					int montoApuesta = Integer.parseInt(entrada.nextLine());
					if(montoApuesta >= 10000) {
						saldoActual = saldoActual - montoApuesta;
						System.out.println("Gracias por apostar, tu saldo actual es: "+saldoActual);

					}
					else if(montoApuesta == 0) {
						i=-1;
					}
					else {
						System.out.println("Monto no aceptado");
					}
				}
				
				
				System.out.println("Gracias por todo, tu saldo final es: " + saldoActual);
			} else {
				System.out.println("No cumple con el saldo minimo");

			}
		}
		entrada.close();
	}
}
