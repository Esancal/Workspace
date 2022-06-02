package cl.generation.ejercicioIndividual.modelos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministradorTest {

	@Test
	public void testNuevaNorma() {
		String norma = "No ver el celular en horario de trabajo";
		String toDo = "Se ha añadido una nueva norma: "+norma; 
		System.out.println(toDo); 
		
		assertNotEquals(norma, toDo);
		assertEquals("Se ha añadido una nueva norma: No ver el celular en horario de trabajo",toDo);
	}

	@Test
	public void testTotal() {
		int dineroEmpresa = 5000000;
		int dineroDeuda = 1000000;
		System.out.println("Dinero inicial: "+ dineroEmpresa);

		
		int total = dineroEmpresa - dineroDeuda;
		System.out.println("El dinero actual es: "+total);
		
		assertNotNull(dineroDeuda);
		assertNotNull(dineroEmpresa);
		assertEquals(4000000, total);
	}

}
