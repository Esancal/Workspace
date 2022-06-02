package cl.generation.pan;

public class Main {

	public static void main(String[] args) {

		Pan pan = new Pan();
		
		pan.setNombrePan("Marraqueta");
		pan.setLevadura("Masa madre");
		pan.setPrecio(1000);
		pan.setPeso(3);
		
		
		System.out.println("Tipo de pan: "+pan.getNombrePan());
		System.out.println("Tipo de levadura: "+pan.getLevadura());
		System.out.println("Precio por kilogramo: "+pan.getPrecio());
		System.out.println("Peso: "+pan.getPeso()+" Kg");
		System.out.println("Precio total: $" + (pan.getPeso()*pan.getPrecio()));
	}

	
	
	
}
