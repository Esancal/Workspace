package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		//Colecciones map
		//Pares clave (Key) <-> valor (Value)
		//HashMap no trabaja con posicion, sino con la clave
		
		
		HashMap<Object, Object> objHashMap = new HashMap <>();
		//K=Key / V= value / 
		//HashMap mapa = new HashMap(); // Otra manera de escribirlo
		
		//HashMap objHashMap = new HashMap();
		
		objHashMap.put("Nombre", "Esteban");
		objHashMap.put("ApellidoP", "Casta?eda");
		objHashMap.put("ApellidoM", "Alfaro");
		objHashMap.put("Edad", "22");

		System.out.println(objHashMap);

		//Para obtener un valor se menciona su llave (key)
		System.out.println(objHashMap.get("ApellidoP"));
		
		//Eliminar par
		objHashMap.remove("Edad");
		System.out.println(objHashMap);

		//Ver las llaves disponibles
		System.out.println("\nMostrar Todas las llaves disponibles");
		System.out.println(objHashMap.keySet());
		
		//Ver los valores disponibles
		System.out.println("\nSolamente los valores");
		System.out.println(objHashMap.values());
		
		
		//Prueba para colocar un ArrayList dentro de HashMap
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Cyan");
		
		objHashMap.put("Colores", colores);
		System.out.println(objHashMap);
		
		System.out.println(objHashMap.get("nombre2")); //Si no lo encuentra, arrojara null
		
		//Como recorrer un Hashmap
		
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 

		}
		
		
	}

}
