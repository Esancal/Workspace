package com.generation.f20220523;

public class CalculoPromedio {

	public static void main(String[] args) {

		//int cantidadNotas = 12; //ya no es necesaria por el notas.length
		//Arreglo de notas
		int MargenInferiorNota = 50;
		int MargenSuperiorNota = 100;
		
		Integer[] notas = {20,23,65,100,43,76,2,99,70,0,53,86};
		int sumaNotas=0;
		
		//promedio -> suma de todas las notas / cantidad de notas
		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}
		System.out.println("La suma de notas es: "+sumaNotas);
		
		double promedio = sumaNotas / notas.length;
		
		if(promedio >= MargenInferiorNota && promedio<= MargenSuperiorNota) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Reprobado");
		}
	
		System.out.println(promedio);
	
	}
}
