package cl.generation.herencia.modelos;

public class Instrumentos {

	private String tipoInstrumento;
	private Integer tamaño;
	private String material;

	public Instrumentos() {

	}

	public Instrumentos(String nombre, Integer tamaño, String material) {
		super();
		this.tipoInstrumento = nombre;
		this.tamaño = tamaño;
		this.material = material;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public Integer getTamaño() {
		return tamaño;
	}

	public void setTamaño(Integer tamaño) {
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Instrumentos [nombre=" + tipoInstrumento + ", tamaño=" + tamaño + ", material=" + material + "]";
	}

}
