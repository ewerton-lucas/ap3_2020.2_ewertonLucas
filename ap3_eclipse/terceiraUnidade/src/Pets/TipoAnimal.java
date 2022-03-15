package Pets;

public class TipoAnimal {
	
	final static public String gato = "GATO";
	final static public String cachorro = "CACHORRO";
	final static public double[] porte_gato = {2.0, 5.0};
	final static public double[] porte_cachorro = {10.0, 25.0};

	public static String identificarPorte(double peso, String tipo) {
		
		String porte;
		double min, max;
		
		switch (tipo) {
		
		case gato:
			
			min = porte_gato[0];
			max = porte_gato[1];
			
			break;
			
		case cachorro:
			
			min = porte_cachorro[0];
			max = porte_cachorro[1];
			
			break;

		default:
			
			porte = "NÃO IDENTIFICADO!";
			
			return porte;
			
		}
	
		if(peso > 0 && peso < min) {
			
			porte = "PEQUENO";
				
		} else if (peso >= min && peso < max) {
				
			porte = "MÉDIO";
				
		 } else if (peso >= max) {
			
			 porte = "GRANDE";
				
		} else {
			
			porte = "NÃO IDENTIFICADO!";
		}	
		
		return porte;
	
	}
		
}
