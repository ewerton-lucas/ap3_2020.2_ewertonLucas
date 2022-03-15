package aula02.problemas;

import java.util.Scanner;

public class Problema02 {

	public void solucao02() {
		
		Scanner scan = new Scanner(System.in);
		
		int op;
		
		float c, f, k ;
		
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*-*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("\n=*=*=*=*=*=*=*=* ESCOLHA UM TESTE *=*=*=*=*=*=*=*=\n");
		System.out.println("Digite 1 para converter de Celsius para Fahrenheit");
		System.out.println("Digite 2 para converter de Fahrenheit para Celsius");
		System.out.println("Digite 3 para converter de Celsius para Kelvin");
		System.out.println("Digite 4 para converter de Kelvin para Celsius");
		System.out.println("Digite 5 para converter de Fahrenheit para Kelvin");
		System.out.println("Digite 6 para converter de Kelvin para Fahrenheit");
		System.out.print("\n=> ");

		op = scan.nextInt();
		
		switch(op) {
		
		case 1:
			
			System.out.println("\nInforme a temperatura em Celsius para converter de C para F:");
			c = scan.nextFloat();
			System.out.println("A temperatura em Fahrenheit é de: " + ((1.8*c)+32) + "  °F");	
			break;
			
		case 2:
			
			System.out.println("\nInforme a temperatura em Fahrenheit para converter de F para C:");
			f = scan.nextFloat();
			System.out.println("A temperatura em Celsius é de: " + ((f - 32)/1.8) + " °C");
			break;
			
		case 3:
			
			System.out.println("\nInforme a temperatura em Celsius para converter de C para K:");
			c = scan.nextFloat();
			System.out.println("A temperatura em Kelvin é de: " + (c + 273) + " K");
			break;
			
		case 4:
			
			System.out.println("\nInforme a temperatura em Kelvin para converter de K para C:");
			k = scan.nextFloat();
			System.out.println("A temperatura em Celsius é de: " + (k - 273) + " °C");
			break;
			
		case 5:
			
			System.out.println("\nInforme a temperatura em Fahrenheit para converter de F para K:");
			f = scan.nextFloat();
			System.out.println("A temperatura em Kelvin é de: " + (((f - 32)/1.8)+273) + " K");
			break;
			
		case 6:
			
			System.out.println("\nInforme a temperatura em Kelvin para converter de K para F:");
			k = scan.nextFloat();
			System.out.println("A temperatura em Fahrenheit é de: " + (((k - 273)* 1.8)+32) + " °F");
			break;	
		
		default: System.out.println("Opção inválida!!!");
		
		}
		
	}
	
}
