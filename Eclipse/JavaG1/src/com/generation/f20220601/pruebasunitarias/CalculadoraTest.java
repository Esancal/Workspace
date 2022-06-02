package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest extends Calculadora{

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42); //54
		
		//assertEquals(valor esperado, respuesta)
		assertEquals(54, resultado);
		assertNotNull(resultado); // El dato "resultado" no es nulo / Si es nulo la prueba falla

		//Los "assert" son para validar.
	}

}
