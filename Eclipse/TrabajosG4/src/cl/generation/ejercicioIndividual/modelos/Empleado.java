package cl.generation.ejercicioIndividual.modelos;

public class Empleado {

	private String nombre;
	private String apellido;
	private Integer edad;
	private String cargo;
	private Integer id;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, Integer edad, String cargo, Integer id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cargo = cargo;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Datos [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cargo=" + cargo + ", id="
				+ id + "]";
	}

}
