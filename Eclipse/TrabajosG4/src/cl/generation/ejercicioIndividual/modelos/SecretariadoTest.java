package cl.generation.ejercicioIndividual.modelos;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecretariadoTest {

	@Test
	public void testLlamada() {
		boolean entrada = true;
		String contesto = "Hola, empresa Teorema a la escucha, ¿que necesita?";
		String noContesto = "Aun no me llega la llamada del socio :l";
		
		if (entrada) {
			System.out.println(contesto);
		} else {
			System.out.println(noContesto);
		}
		assertTrue(entrada);
		assertNotSame(contesto, noContesto);
	}

}
