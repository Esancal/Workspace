package com.generation.f20220526;

public class LibreriaMath {

	public static void main(String[] args) {

		//Math
		
		//elevar o potencia
		double numeroElevado = Math.pow(2.1, 3); // pow=elevar // (base, exponente)
		System.out.println(numeroElevado);
		
		//Redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//Redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//redondeo
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1= 12;
		double num2= 5;
		double div = num1/num2;
		System.out.println(div);
		
		//numeros aleatorios
		//random >= 0.0 && random < 1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//Arroja numeros aleatorios entre 0 y 10
		double num010 = Math.random()*10;
		System.out.println(num010);
		
		//numeros aleatorios entre 2 y 8 (8-2 =6)
		double num28 = (Math.random()*(8-2))+2;
		System.out.println(num28);
		
		//numeros aleatorios entre -4 y 4
		double num44 = (Math.random()*(4 - -4))+ -4;
		System.out.println(num44);
		
		
	}

}
