package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

public class ClienteManager {

	// recorrer el arreglo e imprimir

	public void recorrerArreglo(List<Cliente> listaClientes) {
		
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.datos());
		}
		
	}

}
