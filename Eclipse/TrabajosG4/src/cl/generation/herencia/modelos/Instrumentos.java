package cl.generation.herencia.modelos;

public class Instrumentos {

	private String tipoInstrumento;
	private Integer tama�o;
	private String material;

	public Instrumentos() {

	}

	public Instrumentos(String nombre, Integer tama�o, String material) {
		super();
		this.tipoInstrumento = nombre;
		this.tama�o = tama�o;
		this.material = material;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public Integer getTama�o() {
		return tama�o;
	}

	public void setTama�o(Integer tama�o) {
		this.tama�o = tama�o;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Instrumentos [nombre=" + tipoInstrumento + ", tama�o=" + tama�o + ", material=" + material + "]";
	}

}
