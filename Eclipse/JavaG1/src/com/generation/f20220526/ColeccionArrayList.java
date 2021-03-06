package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {

		// ArrayList DINAMICOS
		// Instancia de clase, definicion de arreglo
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// Agregar un elemento a la lista
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Cyan");

		// Agrega el valor a la posicion (1)
		// Si existe un elemento en esa posicion, desplaza a las demas a la derecha
		colores.add(1, "verde");

		// Solamente es posible hasta la cantidad existente y el siguiente a el
//		colores.add(5,"verde");

		// Imprimir el contenido
		System.out.println(colores);

		// Acceder a un elemento (si no existe, arroja error)
		System.out.println(colores.get(1));

		// Tama?o del arreglo size()
		System.out.println(colores.size());

		// Modificar elemento
		colores.set(0, "negro");
		System.out.println(colores);

		// Quitar un elemento arreglo.remove(posicion)
		colores.remove(1);
		System.out.println(colores);

		// recorrer el arreglo
		System.out.println("Recorriendo el arreglo: ");
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		System.out.println("Recorriendo el arreglo (2)");
		for (String color : colores) {
			System.out.print(color+" ");
		}
		
		System.out.println("\nArreglo ordenado:");
		
		//Ordenar el arreglo de forma ascendente
		//Afecta permanentemente al arreglo
		Collections.sort(colores);		
		System.out.println(colores);
		
		
		// quitar todos los elementos
		colores.clear();
		System.out.println("\n"+colores);
		
		
		
		numerosPares.add(14);
		numerosPares.add(2);
		numerosPares.add(8);
		numerosPares.add(6);
		numerosPares.add(10);
		numerosPares.add(20);

		System.out.println("Numeros desordenados:"+ numerosPares);		
		
		Collections.sort(numerosPares);		
		System.out.println("Numeros ordenados: "+numerosPares);
		
		//No ordena de forma descendente solamente invierte el orden
		Collections.reverse(numerosPares);
		System.out.println("Numeros invertidos "+ numerosPares); 
		
		
		
		
		
		
		

	}

}
