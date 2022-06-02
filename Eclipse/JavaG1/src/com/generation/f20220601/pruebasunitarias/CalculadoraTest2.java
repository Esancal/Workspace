package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	Calculadora calc = new Calculadora();

	@Test
	public void testSuma() {
		int resultado = calc.suma(12, 38); // 50
		// assertEquals(valor esperado, respuesta)
		assertEquals(50, resultado);
	}

	@Test
	public void testResta() {
		int resultado = calc.resta(10, 4); // 6
		assertEquals(6, resultado);
	}

	@Test
	public void testMultiplicacion() {
		int resultado = calc.multiplicacion(10, 4); // 40
		assertEquals(40, resultado);
	}

	@Test
	public void testDivision() {
		String resultado = calc.division(8, 0); // "No se puede dividir por cero"
		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado); // El dato "resultado" no es nulo / Si es nulo la prueba falla
		
	}
	
	


}
