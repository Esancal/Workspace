package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {

		//int cantidadNotas = 12; //ya no es necesaria por el notas.length
		//Arreglo de notas
		int PuntajeAprobado = 50;
		int PuntajeMax = 100;
		int PuntajeMin = 0;
		
		int NotasFueraDeRango = 0;
		
		Integer[] notas = {20,24,43,10,43,77,42,59,99,30,53,86};
		float sumaNotas=0; //Variable acumuladora
		
		//promedio -> suma de todas las notas / cantidad de notas
		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]<PuntajeMin || notas[i]>PuntajeMax) {
				System.out.println("la nota: " +notas[i] + " en la posicion "+ (i+1) + " esta fuera de rango"  );
				NotasFueraDeRango= NotasFueraDeRango+1;
			}
			sumaNotas = sumaNotas + notas[i]; //Accedemos a cada uno de los valores en cada posicion
		}
		//System.out.println("La suma de notas es: "+sumaNotas); //Informativo
		float promedio = sumaNotas / notas.length;
		
		if(NotasFueraDeRango>0) {
			System.out.println("Tener en cuenta que la cantidad de notas fuera de rango es de: "+NotasFueraDeRango+"\nSe necesita corrección");
		}
		else {
			if(promedio >= PuntajeAprobado && promedio<= PuntajeMax) {
				System.out.println("Aprobado");
			}
			else if (promedio >= PuntajeMin && promedio< PuntajeAprobado){
				System.out.println("Reprobado");
			}
			System.out.println("El promedio es de: "+promedio);
		}
	}
}
