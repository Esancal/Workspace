package com.generation.f20220531;

import java.util.List;

public class Cliente {
	
	private String rut;
	protected Integer id;
	private List<Integer> numerosVenta;
	private String nombre;
	public String correo;
	
	//Los privates solo pueden ser trabajados dentro del class en que se encuentran
	
	public void modificarAtributo() {
		rut="123456789-0";
		nombre="Donato";
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Integer> getNumerosVenta() {
		return numerosVenta;
	}

	public void setNumerosVenta(List<Integer> numerosVenta) {
		this.numerosVenta = numerosVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	public String datos() {
		return "\nEl cliente "+nombre+" (ID:"+id+") \nRUT: "+rut+"\nCorreo: "+correo;
	}
	
	
	
	
}
