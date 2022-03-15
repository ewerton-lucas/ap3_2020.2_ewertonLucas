package aula02.problemas;

import java.util.Scanner;

public class Problema04 {

	public void solucao04() {
		
		Scanner scan = new Scanner(System.in);
		
		float n1, n2, n3, media;
		
		int i;
		
		System.out.println("Informe a nota da primeira unidade: ");
		n1 = scan.nextFloat();
		
		System.out.println("\nInforme a nota da segunda unidade: ");
		n2 = scan.nextFloat();
		
		System.out.println("\nInforme a nota da terceira unidade: ");
		n3 = scan.nextFloat();
			
		media = ((n1 + n2 + n3)/3);
		
		System.out.println("\n============================================================\n");
		System.out.print("Digite 1 se o aluno conseguiu atingir a pontuação extra.\nCaso não tenha conquistado, digite 2. \n\n=> ");
		i = scan.nextInt();
		
		if(i == 1) {
			
		System.out.println("\nMédia final do aluno = "+ (media + 1));	
		
		} else {
			
		System.out.println("\nMédia final do aluno = "+ media);
			
		}
		
	}	
	
}
