package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		
		//Funciones
		//4 tipos de funciones
		//2 que retornan
		//2 no retornan
		
		//public: Cualquier otra clase podra llamar a esta funcion
		//void: No retornan nada, solo ejecuta codigo
		//nombre_funcion se escribe con minuscula la primera letra
		
		saludo(); //llamado al metodo/funcion saludo
		calculoSumaPares(4,"3");
		int edad = obtenerEdad();
		System.out.println("La edad es: "+edad);
		
		Boolean mayorOMenor = validarMayorEdad(edad);
		
		if(mayorOMenor) {
			
		}
	}
	
	
	
	//accesador tipoDeRetorno nombreFuncion (parametrosARecibir)	
	public static void calculoSumaPares(int numero1, String numero2) {
		int num2 = Integer.parseInt(numero2);
		System.out.println(numero1+num2);
	}
	//static nos permite acceder al metodo
	public static void saludo() {
		System.out.println("Bienvenido");
	}
	
	//funciones que retornan un tipo de datos
	public static Integer obtenerEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edad = Integer.parseInt(sc.nextLine());
		return edad;
	}
	
	public static Boolean validarMayorEdad(Integer edad) {
		if(edad>=18) {
			System.out.println("Es mayor de edad");
			return true;
		}
		else {
			System.out.println("Es menor de edad");
			return false;
		}
	}
	
	
}
