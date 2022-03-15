package Pets;

public class TipoAnimal {
	
	final static public String gato = "GATO";
	final static public String cachorro = "CACHORRO";
	final static public double[] porte_gato = {2.0, 5.0};
	final static public double[] porte_cachorro = {10.0, 25.0};

	public static String identificarPorte(double peso, String tipo) {
		
		String porte;
		double min, max;
			
		// O BLOCO DE CONTROLE DE DECISÃO SWITCH IRÁ VERIFICAR SE O TIPO FORNECIDO PELO USUÁRIO PERTENCE A ALGUM DOS QUE FORAM
		// APRESENTADOS NO INÍCIO DO CÓDIGO E ATRIBUIR OS RESPECTIVOS LIMITES DE PESO ÀS VARIÁVEIS MIN E MAX, PARA ENTÃO SEGUIR
		// A SEGUNDA ETAPA DE CÁLCULOS. ESSA FOI A MANEIRA MAIS GENÉRICA QUE CONSEGUI IMAGINAR PARA DESENVOLVER ATÉ O MOMENTO.
		
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
		
		// APÓS A VERIFICAÇÃO DE TIPO DO ANIMAL, É REALIZADO UM PROCESSO DE COMPARAÇÃO ENTRE O PESO INFORMADO PELO USUÁRIO
		// E OS LIMITES QUE FORAM ATRIBUÍDOS NA ETAPA ANTERIOR. CONFORME O ALGORITMO FOR EXECUTADO, HAVERÁ UMA ATRIBUIÇÃO
		// À VARIÁVEL PORTE. POR FIM, É RETORNADO ESTE VALOR.
		
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
