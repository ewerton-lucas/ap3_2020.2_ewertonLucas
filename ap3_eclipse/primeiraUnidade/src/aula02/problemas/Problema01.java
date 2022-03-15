package aula02.problemas;

import java.util.Scanner;

public class Problema01 {
	
	Scanner scan = new Scanner (System.in);
	
	String pagar;
	
	public void solucao01() {
		
		System.out.println("INFORME QUANTOS ITENS FORAM COMPRADOS:");
		int numItens = scan.nextInt();
		
		String[][] produtos = new String[numItens][3];
		
		for (int i=0; i<numItens; i++) {
			
			for (int j=0; j<3; j++) {
				
				System.out.println("\nINFORME O NOME DO ITEM "+(i+1)+". ATENÇÃO!! SE FOR UM NOME"
						+ " COMPOSTO, UTILIZE UNDERLINE PARA SEPARAR OS NOMES. "
						+ "\nEXEMPLO: SUCO_DE_LARANJA");
				produtos[i][j] = scan.next();
				System.out.println("\nQUANTAS UNIDADES DO ITEM ("+produtos[i][j]+") FORAM COMPRADAS?");
				j++;
				produtos[i][j] = scan.next();
				System.out.println("\nINFORME O VALOR UNITÁRIO DESTE ITEM. ATENÇÃO!!"
				+ " SE O VALOR NÃO FOR INTEIRO, DIGITE UM PONTO ANTES DAS CASAS DECIMAIS."
				+ "\nEXEMPLO: '7.50'");
				j++;
				produtos[i][j] = scan.next();
				
			}
		}
		
		// IMPRIMIR A MATRIZ
		
				System.out.print("\n NOME => QUANTIDADE => VALOR ");
					
				for (int i=0; i<numItens; i++) {
					
					System.out.println();
					
					for (int j=0; j<3; j++) {
						
					if(j>0 && j<3) {
						
						System.out.print(" => ");
					}
						System.out.print(" "+produtos[i][j]+" ");
					}
				}
	
				/* CONVERTER AS STRINGS PARA TIPO FLOAT, CALCULAR O VALOR TOTAL POR ITENS, 
				DEPOIS SOMAR TUDO E GERAR O VALOR FINAL DA COMPRA.. */
				
				float qtd_Item, valorItem, total_Item = 0, soma_Total_Itens = 0;
			
				for (int i=0; i<numItens; i++) {
					
					for (int j=0; j<3; j++) {
						
						j++;
						qtd_Item = Float.parseFloat(produtos[i][j]);
						j++;
						valorItem = Float.parseFloat(produtos[i][j]);
						total_Item = qtd_Item * valorItem;
						
					}
					
						soma_Total_Itens += total_Item;
					
				}
			
				// MOSTRAR RESULTADOS
				
				System.out.println("\n\nO VALOR TOTAL DA COMPRA FOI DE R$ "+soma_Total_Itens);
				
				System.out.println("\nINFORME UM VALOR PARA PROCESSAR O PAGAMENTO:");
			
				pagar = scan.next();
				
				float valorPago = Float.parseFloat(pagar);
				
				if(valorPago >= soma_Total_Itens) {
						
					System.out.println("\nPAGAMENTO REALIZADO COM SUCESSO!!");
					System.out.println("\nSEU TROCO É DE R$ " + (valorPago - soma_Total_Itens));
	
				}	else {
						
					System.out.println("\nERRO!!! O VALOR INFORMADO É INSUFICIENTE. :(\nFALTAM R$ " 
					+ (soma_Total_Itens - valorPago));
					
				}
	
		}	
	
}