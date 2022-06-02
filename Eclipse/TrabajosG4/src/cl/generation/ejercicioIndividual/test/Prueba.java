package cl.generation.ejercicioIndividual.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cl.generation.ejercicioIndividual.modelos.Administrador;
import cl.generation.ejercicioIndividual.modelos.Secretariado;

public class Prueba {

	Administrador admin = new Administrador();
	Secretariado sec = new Secretariado();

	@Test
	public void testTotal() {
		admin.setDineroEmpresa(500000);
		admin.setDeuda(400000);

		System.out.println("Dinero inicial: " + admin.getDineroEmpresa());
		System.out.println("Deuda actual: " + admin.getDeuda());

		int total = admin.total(admin.getDineroEmpresa(), admin.getDeuda());
		System.out.println("El dinero actual es: " + total);

		assertNotNull(admin.getDeuda());
		assertNotNull(admin.getDineroEmpresa());
		assertEquals(100000, total);

	}

	@Test
	public void testNuevaNorma() {

		admin.setNorma("No ver el celular en horario de trabajo");

		String comentario = admin.nuevaNorma(admin.getNorma());
		System.out.println(comentario);

		assertNotEquals(admin.getNorma(), comentario);
		assertEquals("Se ha añadido una nueva norma: No ver el celular en horario de trabajo", comentario);
	}

	@Test
	public void testLlamada() {

		sec.setRecibirLlamada(true);

		String accion = sec.llamada(sec.isRecibirLlamada());

		assertTrue(sec.isRecibirLlamada());
		assertNotSame("Aun no me llega la llamada del socio :l", accion);
	}

}
