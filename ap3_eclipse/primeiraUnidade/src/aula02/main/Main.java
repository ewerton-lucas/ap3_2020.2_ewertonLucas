package aula02.main;

import java.util.Scanner;
import aula02.problemas.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int op = 0;
		
		String mensagem = "\nFim da solução\n\nArraste pra cima caso não tenha visto a solução por completo!";
		
		do {
			
			//SELECIONE UMA OPÇÃO DO MENU PARA REALIZAR OS TESTES
			
			MenuPrincipal menuPrincipal = new MenuPrincipal();
			menuPrincipal.mostrarMenu();
	
			op = scan.nextInt();
			
			switch(op) {
			
				case 1:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 01\n");
					
					Problema01 problema01 = new Problema01();
					problema01.solucao01();
					
					System.out.println(mensagem);
		
					break;
					
				case 2:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 02\n");
					
					Problema02 problema02 = new Problema02();
					problema02.solucao02();
					
					System.out.println(mensagem);
					
					break;
					
				case 3:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 03\n");
					
					Problema03 problema03 = new Problema03();
					problema03.solucao03();
					
					System.out.println(mensagem);
					
					break;
					
				case 4:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 04\n");
					
					Problema04 problema04 = new Problema04();
					problema04.solucao04();
					
					System.out.println(mensagem);
					
					break;
					
				case 5:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 05\n");
					
					Problema05 problema05 = new Problema05();
					problema05.solucao05();
					
					System.out.println(mensagem);
					
					break;
				
				case 6:
					
					System.out.println("\nSOLUÇÃO DO PROBLEMA 06\n");
					
					Problema06 problema06 = new Problema06();
					problema06.solucao06();
					
					System.out.println(mensagem);
					
					break;	
					
				default: System.out.println("\nPrograma encerrado... \\(^_^)/");
			
			}
			
		} while (op < 7);
		
	}		

}
