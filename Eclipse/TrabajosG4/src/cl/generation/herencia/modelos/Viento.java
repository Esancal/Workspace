package cl.generation.herencia.modelos;

public class Viento extends Instrumentos{

	private String tipoDeBoquilla;
	private Integer cantidadOrificios;

	public Viento() {
		super();
	}

	public Viento(String tipoDeBoquilla, Integer cantidadOrificios) {
		super();
		this.tipoDeBoquilla = tipoDeBoquilla;
		this.cantidadOrificios = cantidadOrificios;
	}

	public String getTipoDeBoquilla() {
		return tipoDeBoquilla;
	}

	public void setTipoDeBoquilla(String tipoDeBoquilla) {
		this.tipoDeBoquilla = tipoDeBoquilla;
	}

	public Integer getCantidadOrificios() {
		return cantidadOrificios;
	}

	public void setCantidadOrificios(Integer cantidadOrificios) {
		this.cantidadOrificios = cantidadOrificios;
	}

	@Override
	public String toString() {
		return "Viento [tipoDeBoquilla=" + tipoDeBoquilla + ", cantidadOrificios=" + cantidadOrificios + "]"+ super.toString();
	}

}
