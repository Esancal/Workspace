package cl.generation.ejercicioIndividual;

import cl.generation.ejercicioIndividual.modelos.Administrador;
import cl.generation.ejercicioIndividual.modelos.Secretariado;

public class Main {

	public static void main(String[] args) {

		Administrador admin = new Administrador();
		Secretariado secretario = new Secretariado();

		admin.setNombre("Esteban");
		admin.setApellido("Castañeda");
		admin.setCargo("Administrador");
		admin.setEdad(22);
		admin.setId(1);

		admin.setDineroEmpresa(5000000);
		admin.setNorma("No ver el celular en horario de trabajo");


		secretario.setNombre("Andres");
		secretario.setApellido("Alfaro");
		secretario.setCargo("Secretario");
		secretario.setEdad(21);
		secretario.setId(2);

		secretario.setNota("Necesitamos comprar una nueva aplicacion, su coste es de 1000000, lo informare");
		secretario.setRecibirLlamada(true); //Cambia el mensaje dependiendo de si recibio llamada o no
		
		
		
		System.out.println("Dinero actual de la empresa: " + admin.getDineroEmpresa());
		
		System.out.println(secretario.llamada(secretario.isRecibirLlamada())); 
		
		System.out.println(secretario.getNota());
		System.out.println("Nuestro dinero actual es: "+admin.total(admin.getDineroEmpresa(), 1000000));
		
		System.out.println("*********************");
		
		System.out.println("\nReemplazo de admin sobre Empleado");
		System.out.println(admin.toString());
		
		System.out.println("\nReemplazo de Secretario sobre Empleado");
		System.out.println(secretario.toString());
	}

	


}
