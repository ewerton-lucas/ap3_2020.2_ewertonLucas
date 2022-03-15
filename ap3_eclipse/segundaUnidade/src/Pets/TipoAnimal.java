package Pets;

public class TipoAnimal {
	
	final static public String gato = "GATO";
	final static public String cachorro = "CACHORRO";
	final static public double[] porte_gato = {2.0, 5.0};
	final static public double[] porte_cachorro = {10.0, 25.0};

	public static String identificarPorte(double peso, String tipo) {
		
		String porte;
		double min, max;
			
		// O BLOCO DE CONTROLE DE DECIS�O SWITCH IR� VERIFICAR SE O TIPO FORNECIDO PELO USU�RIO PERTENCE A ALGUM DOS QUE FORAM
		// APRESENTADOS NO IN�CIO DO C�DIGO E ATRIBUIR OS RESPECTIVOS LIMITES DE PESO �S VARI�VEIS MIN E MAX, PARA ENT�O SEGUIR
		// A SEGUNDA ETAPA DE C�LCULOS. ESSA FOI A MANEIRA MAIS GEN�RICA QUE CONSEGUI IMAGINAR PARA DESENVOLVER AT� O MOMENTO.
		
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
			
			porte = "N�O IDENTIFICADO!";
			
			return porte;
			
		}
		
		// AP�S A VERIFICA��O DE TIPO DO ANIMAL, � REALIZADO UM PROCESSO DE COMPARA��O ENTRE O PESO INFORMADO PELO USU�RIO
		// E OS LIMITES QUE FORAM ATRIBU�DOS NA ETAPA ANTERIOR. CONFORME O ALGORITMO FOR EXECUTADO, HAVER� UMA ATRIBUI��O
		// � VARI�VEL PORTE. POR FIM, � RETORNADO ESTE VALOR.
		
		if(peso > 0 && peso < min) {
			
			porte = "PEQUENO";
				
		} else if (peso >= min && peso < max) {
				
			porte = "M�DIO";
				
		 } else if (peso >= max) {
			
			 porte = "GRANDE";
				
		} else {
			
			porte = "N�O IDENTIFICADO!";
		}	
		
		return porte;
	
	}
		
}
