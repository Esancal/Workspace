package com.generation.f20220601.pruebasunitarias;

public class Calculadora {

	public int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public String division(int numero1, int numero2) {
		if (numero2 != 0) {
			String resultado = Integer.toString(numero1 / numero2);
			return resultado;
		}
		return "No se puede dividir por cero";
	}

}
