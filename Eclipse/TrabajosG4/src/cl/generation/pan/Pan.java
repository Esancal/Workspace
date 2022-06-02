package cl.generation.pan;

public class Pan {
	
	private String nombrePan;	
	private String levadura;
	private Integer peso;
	private Integer precio; //En pesos

	
	public Pan() {
		super();
	}
	
	public Pan(Integer peso, String nombrePan, Integer precio, String levadura) {
		super();
		this.peso = peso;
		this.nombrePan = nombrePan;
		this.precio = precio;
		this.levadura = levadura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getNombrePan() {
		return nombrePan;
	}

	public void setNombrePan(String nombrePan) {
		this.nombrePan = nombrePan;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getLevadura() {
		return levadura;
	}

	public void setLevadura(String levadura) {
		this.levadura = levadura;
	}
	
	

	
	
}
