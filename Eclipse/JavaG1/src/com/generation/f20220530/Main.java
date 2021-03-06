package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {

		List<Alumno> grupo = new ArrayList<Alumno>(); // List = Interfaz
		// Las interfaces solo definen los metodos (Estructura)
		// El Arraylist es una clase (tiene atributos, funciones, metodos, va mas alla
		// que la implementacion)

		// instancia de una clase
		// Alumno es objeto, alumno es variable (se puede cambiar de nombre)
		Alumno alumno1 = new Alumno("Esteban", "Casta?eda", 22, "G1");
		// con Alumno() Se llama al constructor vacio
		// Y eso es para asignar valores a nuestros atributos
		Alumno alumno2 = new Alumno("Katherina", "Orellana", 24, "G1");
		Alumno alumno3 = new Alumno("Catalina", "Martinez", 25, "G1");
		Alumno alumno4 = new Alumno("Danko", "Abarca", 25, "G1");
		Alumno alumno5 = new Alumno("Wladimir", "Rojas", 27, "G1");

		grupo.add(alumno1);
		grupo.add(alumno2);
		grupo.add(alumno3);
		grupo.add(alumno4);
		grupo.add(alumno5);

		System.out.println("Datos como lista");

		for (Alumno alumno : grupo) {
			System.out.println(alumno);
		}

		System.out.println("\nNombres: ");

		for (int i = 0; i < grupo.size(); i++) {
			System.out.println(grupo.get(i).getNombre());

		}

		System.out.println("\nTodos los datos con una funcion");

		System.out.println(alumno1.getDatos());
		System.out.println(alumno2.getDatos());
		System.out.println(alumno3.getDatos());
		System.out.println(alumno4.getDatos());
		System.out.println(alumno5.getDatos());

		System.out.println("\nDatos con funcion toString");

		System.out.println(alumno1.toString());

	}

}
