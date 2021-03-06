package com.generation.f20220526;
import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		// Array 
		String[] colores = {"Negro", "Cyan", "Azul", "Verde", "blanco"};
		Integer[] numerosPares = {2,4,6,8,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,0};
		
		//Posicion inicial: (0)
		
		System.out.println(colores[2]);
		System.out.println(numerosPares[3]);
		System.out.println(primerosNumeros[0]);
		
		//nombreArray[posicion] -> Accediendo al elemento del arreglo en esa posicion
		System.out.println(colores[1]); //Cyan
		
		numerosPares[3] = 14; // Reemplazamos la posicion 3
		System.out.println(numerosPares[3]);
	
		
//		numerosPares[6] = 14;//Error fuera de indice, 
		//no podemos agregar por posicion si no existe un elemento 
		
		System.out.println("Tama?o Array colores: "+ colores.length);
		
		//Recorrer un arreglo
		
		System.out.println(colores.toString());
		System.out.println(Arrays.toString(colores));
		
		for (int i = 0; i < numerosPares.length; i++) {
			System.out.print(numerosPares[i]+" ");
		}
		
		System.out.println("\n\nNuevo recorrido foreach");
		for (int i : primerosNumeros) { //{1,2,3,4,5,6,7,8,9,0}
			//int elemento = 1; en la segunda vuelta le asigna el 2, luego el 3, etc
			//Hasta llegar al ultimo elemento
			System.out.println(i);
		}
		
		for (String i : colores) {
			System.out.println(i);//{"Negro", "Cyan", "Azul", "Verde", "blanco"}
		}

	}
	
	

}