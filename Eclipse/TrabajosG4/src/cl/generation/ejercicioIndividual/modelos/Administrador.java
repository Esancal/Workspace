package cl.generation.ejercicioIndividual.modelos;

public class Administrador extends Empleado{
	
	private String norma; //Normas que acatar
	private Integer dineroEmpresa; // Dinero de la empresa
	private Integer deuda;
	
	public Administrador() {
		super();
	}
	public Administrador(String norma, Integer dineroEmpresa, Integer deuda) {
		super();
		this.norma = norma;
		this.dineroEmpresa = dineroEmpresa;
		this.deuda = deuda;
	}
	public String getNorma() {
		return norma;
	}
	public void setNorma(String norma) {
		this.norma = norma;
	}
	
	public Integer getDeuda() {
		return deuda;
	}
	public void setDeuda(Integer deuda) {
		this.deuda = deuda;
	}
	public Integer getDineroEmpresa() {
		return dineroEmpresa;
	}
	public void setDineroEmpresa(Integer dineroEmpresa) {
		this.dineroEmpresa = dineroEmpresa;
	}
	@Override
	public String toString() {
		return "Administrador [norma=" + norma + ", dineroEmpresa=" + dineroEmpresa + ", deuda=" + deuda +"]"+super.toString();
	}
	public String nuevaNorma (String norma) {
		
		String toDo = "Se ha añadido una nueva norma: "+norma; 
		return toDo; 
		
	}
	public int total(int dineroEmpresa, int dineroDeuda) {

		int total = dineroEmpresa - dineroDeuda;
		return total;

	}
	
	
	
	
	
}
