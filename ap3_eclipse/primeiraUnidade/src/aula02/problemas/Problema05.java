package aula02.problemas;

import java.util.Scanner;

public class Problema05 {

	public int fat (int n) {
		
		if (n == 0) {
			
			return 1;
			
		} else {
			
			return n * fat (n - 1);
			
		}
	}
	
	
	public void solucao05() {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe o número para calcular o fatorial: ");
		n = scan.nextInt();
		
		if(n < 0) {
			
			System.out.println("\nNão é possível calcular o fatorial de (" + n + ")." + " Por favor, informar valor maior ou igual a zero");
			
		} else {
		
			int fatorial = fat(n);
						
			System.out.println("\nO fatorial de (" + n + ") é " + fatorial);
		
		}
		
	}	
	
}
