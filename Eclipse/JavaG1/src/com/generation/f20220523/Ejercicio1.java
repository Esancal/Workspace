package com.generation.f20220523;

public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 // calculo area y calculo del perimetro
		
		variables estaticas
		formula area triangulo
		impresion
		
		formula perimetro circulo
		impresion*/
		
		
		float areaTrianguloAB, alturaTriangulo, baseTriangulo;
		
		alturaTriangulo = 3;
		baseTriangulo = 1;
		
		areaTrianguloAB = (alturaTriangulo * baseTriangulo)/2;
		
		//2pi*r
		
		float radioCirculo = 15f;
		float diametroCirculo = 30f;
		float diametroARadio = diametroCirculo/2;
		float PI = 3.1416f;
		
		float perimetroCirculoConR = (2*PI)*radioCirculo;
		float perimetroCirculoConD = (2*PI)*diametroARadio;
		
		
		System.out.println("*********************************************");
		System.out.println("**********C?lculo de area tri?ngulo**********");
		System.out.println("*********************************************");
		System.out.println("");
		System.out.println("El ?rea de un tri?ngulo de base: " + baseTriangulo + ", y de altura: " + alturaTriangulo + ", es: " + areaTrianguloAB);
		System.out.println("");
		System.out.println("*********************************************");
		System.out.println("*");
		System.out.println("El per?metro de un c?rculo de radio: " + radioCirculo + ", es: " + perimetroCirculoConR);
		System.out.println("El per?metro de un c?rculo de diametro: " + diametroCirculo + ", es: " + perimetroCirculoConD);
		System.out.println("*********************************************");
		System.out.println("*********************************************");
}
}
