package com.generation.f20220523;

public class Main {
	
	public static void main(String[] args) {
		//Variables
		//Se define el tipo de dato al cual pertenecera la variable
		//Tipo de dato nombre_variable = asignacion;
		String nombre = "Esteban";
		System.out.println(nombre);
		
		//16 bits (un solo caracter, entre comillas simples ' ')
		char letraA = 'a';
		
	
		
		//Variables numericas
		//32 bits
		int numeroInt = 24;
		System.out.println(numeroInt + 10);
		
		//8 bits
		byte numeroByte = 100;
		System.out.println(numeroByte);
		
		//16 bits
		short numeroShort = 234;
		System.out.println(numeroShort);
		
		//64 bits
		long numeroLong = 1234567890;
		System.out.println(numeroLong);
		
		//float y double (aceptan decimales)
		
		//variable booleana (true or false)
		boolean acepta = true; //false
		
		
		char genero = 'M';
		String cabello = "Casta?o";
		boolean compro = true;

		System.out.println("Su genero es: "+genero+"\nSu cabello es de color: "+cabello);
		if(compro) {
			System.out.println("Su compromiso es real");
		}
		

		String poblacion = "Bello horizonte";
		byte edad = 22;
		String ocupacion = "Estudiante";
		
		System.out.println("\nSu poblacion es: "+poblacion+"\nSu edad es: "+edad+"\nSu nombre es: "+nombre+"\nSu ocupacion es: "+ ocupacion+ "\nSu genero es: "+genero);
		
		//Variables de tipo objeto
		System.out.println(nombre.charAt(1)); // Entrega la segunda letra del "nombre" (E->s<-teban) 
		
		
		//Los strings se comparan con equals
		String curso = "G1";
		
		if(curso.equals("g1")) {
			System.out.println("Iguales");
		}
		else{
			System.out.println("Distintos");
		}
		
		if(curso.equalsIgnoreCase("g1")) {
			System.out.println("Iguales");
		}
		else{
			System.out.println("Distintos");
		}
		
		if(curso.toLowerCase().equals("g1")) {
			System.out.println("Iguales");
		}
		if(curso.equals("g1".toUpperCase())) {
			System.out.println("Iguales");
		}
		
		String curso2 = ""; 	//Variable vacia
		String curso3 = null; 		//null, solo creada
		
		//para comparar null se recomienda usar el null primero
		if(null == curso3) {
			
		}
		
		//float y double
		//float es primitivo, mientras que Float es de tipo objeto
		
		float altura = (float) 1.79; //1.79f 
		//Un cast es convertir un dato a otro tipo de dato (lo de arriba que no esta en comentario)
		
		Float peso = 63.5f;
		
		Float gravedad = Float.parseFloat("9.8"); //transforma de string a dato numerico
		
		//PARSE: Convertir un String a un tipo de numero
		Integer.parseInt("23");
		Long.parseLong("1513624735");
		Double.parseDouble("123245.56");
		Float.parseFloat("85.5");
		
		
		//ejercicio
		int nume1= 12;
		
		//Conversion de datos
		//Automatica es hacia arriba
		//byte>short>int>long>float>double
		
		
		//Esto lo realice yo
	    String nume2= Integer.toString(nume1);
		Integer.parseInt(nume2);
		Long.parseLong(nume2);
		Double.parseDouble(nume2);
		Float.parseFloat(nume2);
		
		//Lo realizo el profe
		int num4 = 18;
		float num4f = num4;
		System.out.println(num4+" "+num4f);
		
		//manual (profe tambien)
		//double>float>long>int>...
		Double peso2 = 75.9;
		Float peso2F = peso2.floatValue();
		
		float numPrimitivo = 123.4f;
		Float numObjeto = 123.4f;

		//de float a int, SE PIERDEN LOS DECIMALES
		
		if(5== (3+2)) {
		//El if dice que es inutil ya que claramente son iguales
		}
		
	}

}
