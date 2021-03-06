package com.generation.f20220530;

public class Alumno {

	// atributos
	// atributo representa una caracteristica del objeto que creamos
	// Private porque solo podemos acceder dentro de la misma clase
	// Protected podemos acceder no solo de la misma clase, sino de todo el package
	// Public porque cualquiera puede acceder desde cualquier parte

	private String nombre; // protected o public
	private String apellido1;
	private Integer edad;
	private String curso;

	// Encapsulamiento (Sirve para proteger)

	// constructores

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido1, Integer edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDatos() {
		return ("Los datos son los siguientes: Nombre: " + this.nombre + " " + this.apellido1 + " " + " Edad: " + this.edad + " Curso: " + this.curso);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1 + ", edad=" + edad + ", curso=" + curso + "]";
	}

	
	
	
	// get y set
	
	
	// funciones

}