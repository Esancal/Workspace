package com.generation.f20220527;

public class Auto {

	//Clase es un modelo o prototipo
	//Objeto, nace a partir de la clase, caracteristica o atributo,
	//Tiene metodos o funciones.
	//Algo concreto lo convertimos en abstracto (No tangible)
	
	//QUE ES UN ATRIBUTO DE COLABORACION: TOMAR UN OBJETO Y USARLO COMO ATRIBUTO
	
	//Atributo
	//accesador tipo nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	//Constructores
	//Click derecho > Source > Constructor using field
	
	public Auto() {
	
	}
	
	//Constructor con parametros
	public Auto(String color, String marca, String modelo, Double velocidad) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	
	//accesadores y mutadores (get y set)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos o funciones personalizadas
	
	public void aumentarVelocidad() {
		this.velocidad = 10d;
		
	}
	
	
}
