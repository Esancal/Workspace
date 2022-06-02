package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException; //Errores dados por el escanner
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		int opcion;
		Scanner entrada = new Scanner(System.in);

		// arreglo de clientes
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		// Instancia de cliente
		Cliente cliente = new Cliente();
		// Si no agregamos constructores, por default hay un constructor vacio
		// Si creamos constructores con parametros, es recomendado crear el constructor
		// vacio

		cliente.setId(1234);
		cliente.setNombre("Donato");
		cliente.setRut("123456789-0");

		do {

			// Excepciones
			Cliente clienteDatosDinamicos = new Cliente();

			System.out.println("Ingrese el id del Cliente");
			// Integer id2 = Integer.parseInt(entrada.nextLine());

			String idString = entrada.nextLine();

			try {
				Integer id = Integer.parseInt(idString); // null para probar el error
				clienteDatosDinamicos.setId(id); // id + 1

				System.out.println("Ingrese el nombre del Cliente");
				String nombre = entrada.nextLine();
				clienteDatosDinamicos.setNombre(nombre);

				System.out.println("Ingrese el rut del Cliente");
				String rut = entrada.nextLine();
				clienteDatosDinamicos.setRut(rut);

				System.out.println("Ingrese el correo del Cliente");
				String correo = entrada.nextLine();
				clienteDatosDinamicos.setCorreo(correo);

				// Integer division = 100/0;
				// System.out.println(division); // / by zero (no se puede dividir por cero)

			} catch (NullPointerException e) {
				System.out.println("No se puede realizar la operacion matematica. un dato es nulo");
			} catch (InputMismatchException ime) {
				System.out.println("Error en el ingreso de un dato");
			} catch (ArithmeticException ae) {
				System.out.println("Error al dividir por cero");
			} catch (NumberFormatException nfe) { // Error de conversion
				System.out.println("No puede ingresar una letra como identificador\n Vuelva a introducir " + nfe);
			} catch (Exception e) { // e = generica
				System.out.println("Ha ocurrido un error, contacte al administrador " + e);
			}
			
			listaClientes.add(clienteDatosDinamicos);
			
			do {
				System.out.println("¿Desea ingresar un nuevo cliente? \n(1) si / (0) no");
				opcion = entrada.nextInt();
				entrada.nextLine();
			} while (opcion != 0 && opcion != 1);

		} while (opcion == 1);
		
		// Acceder a un metodo de otra clase
		
		ClienteManager cm = new ClienteManager(); //cm como siglas UnU
		cm.recorrerArreglo(listaClientes);
		
	}

}
