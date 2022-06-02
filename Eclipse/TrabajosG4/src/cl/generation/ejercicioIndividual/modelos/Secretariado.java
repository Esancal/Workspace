package cl.generation.ejercicioIndividual.modelos;

public class Secretariado extends Empleado {

	private boolean recibirLlamada; // ¿recibe una llamada? si/no
	private String nota; // escribir una nota

	public Secretariado() {
		super();
	}

	public Secretariado(boolean recibirLlamada, String nota) {
		super();
		this.recibirLlamada = recibirLlamada;
		this.nota = nota;
	}

	public boolean isRecibirLlamada() {
		return recibirLlamada;
	}

	public void setRecibirLlamada(boolean recibirLlamada) {
		this.recibirLlamada = recibirLlamada;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		if (recibirLlamada==true) {
			return "Secretariado [Se recibio la llamada"+ ", nota=" + nota + "]"+ super.toString();
		}
		else {
		return "Secretariado [Aun no se recibe llamada" + ", nota=" + nota + "]"+ super.toString();
		}
	}

	public String llamada(Boolean entrada) {
		if (entrada) {
			return "Hola, empresa Teorema a la escucha, ¿que necesita?";
		} else {
			return "Aun no me llega la llamada del socio :l";
		}

	}

}
