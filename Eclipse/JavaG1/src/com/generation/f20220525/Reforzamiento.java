package com.generation.f20220525;

import java.util.Scanner;

public class Reforzamiento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el margen Superior: ");
  		int margenSuperior = Integer.parseInt(sc.nextLine()); //Entrada de datos
  		int margenInferior;
  		int numero;
  		int total=0;
  		int contador=0;
  		int contador2=0;
  		boolean key = true;
  		
  		
  		do{
        System.out.println("Ingrese el margen inferior (debe ser menor al margen superior): ");
        margenInferior = Integer.parseInt(sc.nextLine()); 
  		if(margenInferior>=margenSuperior) {
  			System.out.println("Incorrecto, vuelva a ingresar");
  		}
  			
  		}while(margenInferior>=margenSuperior);
  		
  		System.out.println("Ingreso de margenes correctos");
  		
  		
  		
  		
  		
  		while(key) {
  			System.out.println("Ingrese un numero // (0) Salir");
  			numero = Integer.parseInt(sc.nextLine());
  			
  			if(numero==0) {
  				key=false;
  			}
  			else if(numero<margenSuperior && numero>margenInferior) {
  			total += numero;
  			}
  			else if(numero==margenSuperior || numero==margenInferior ) {
  				contador2++;
  			}
  			else{
  				contador++;
  			}
  			
  				
  		}
  		
  		System.out.println("La suma de los numeros que estan dentro del margen es: "+total);
  		System.out.println("La cantidad de numeros fuera de rango es: "+contador);
  		System.out.println("La cantidad de numeros iguales a uno de los margenes es: "+contador2);
		
	}

}
