package cl.generation.herencia.modelos;

public class Flauta extends Viento{

	private String nroModelo;
	private String tipoFlauta;

	public Flauta() {
		super();
	}

	public Flauta(String nroModelo, String tipoFlauta) {
		super();
		this.nroModelo = nroModelo;
		this.tipoFlauta = tipoFlauta;
	}

	public String getNroModelo() {
		return nroModelo;
	}

	public void setNroModelo(String nroModelo) {
		this.nroModelo = nroModelo;
	}

	public String getTipoFlauta() {
		return tipoFlauta;
	}

	public void setTipoFlauta(String tipoFlauta) {
		this.tipoFlauta = tipoFlauta;
	}

	@Override
	public String toString() {
		return "Flauta [nroModelo=" + nroModelo + ", tipoFlauta=" + tipoFlauta + "]"+ super.toString();
	}

}
