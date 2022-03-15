package aula02.problemas;

import java.util.Scanner;

public class Problema06 {

	public void solucao06() {
		
		Scanner scan = new Scanner(System.in);
		
		int linhas, colunas;
		
		int maior = 0, menor = 0, soma = 0;
		
		System.out.println("Informe o n�mero de linhas da matriz: ");
		
		linhas = scan.nextInt();
		
		System.out.println("Informe o n�mero de colunas da matriz: ");
		
		colunas = scan.nextInt();
			
		//DECLARAR A MATRIZ E SUAS DIMENSOES
		
		int [][] matriz = new int [linhas][colunas];

		//CALCULAR A SOMA E IDENTIFICAR O MAIOR VALOR
		
		for (int i = 0; i < linhas; i ++) {
			
			for (int j = 0; j < colunas; j ++) {
				
				System.out.println("Digite um valor inteiro para armazenar na posi��o (" + i + ", " + j + ") da matriz: ");
				
				matriz[i][j] = scan.nextInt();
				
				soma += matriz[i][j];
				
				if(maior < matriz[i][j]) {
					
					maior = matriz[i][j];
					
				}
			}	
		}
		
		/*DEPOIS DE DESCOBRIR O MAIOR VALOR, ATRIBUIR O RESULTADO � VARIAVEL MENOR, 
		  EM SEGUIDA BUSCAR PELO NOVO VALOR MENOR DA MATRIZ*/
		
				menor = maior;
				
		for (int i = 0; i < linhas; i ++) {
				
				for (int j = 0; j < colunas; j ++) {
					
					if(menor > matriz[i][j]) {
						
						menor = matriz[i][j];	
					
				}
			}		
		}
		
			//IMPRIMIR MATRIZ
		
			System.out.println("\n\n=======================================================");
			System.out.println("MATRIZ DE ORDEM " + linhas +" X " + colunas + " GERADA");
					
				for (int i = 0; i < linhas; i ++) {
				
					System.out.println();
					
					for (int j = 0; j < colunas; j ++) {
						
						System.out.print(" " + matriz[i][j]);
						
					}
						
			}	
				
			//CALCULAR O VALOR M�DIO DA MATRIZ 	
			
			float media = (float)soma/(linhas*colunas);
			
			//IMPRIMIR RESULTADOS
				
			System.out.println("\n\n=======================================================");
			System.out.println("\n\nO maior valor contido nesta matriz �: " + maior );
			System.out.println("\nO menor valor contido nesta matriz �: " + menor);
			System.out.println("\nO valor m�dio da matriz �: "+ media);

	}	
	
}
