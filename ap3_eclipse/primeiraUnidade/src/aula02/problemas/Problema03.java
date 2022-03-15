package aula02.problemas;

import java.util.Scanner;

public class Problema03 {
	
	public void solucao03() {
		
		Scanner scan = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.print("Informe a medida em metros do lado (A):  ");
		
		a = scan.nextFloat();
		
		System.out.print("Informe a medida em metros do lado (B):  ");
		
		b = scan.nextFloat();
		
		System.out.print("Informe a medida em metros do lado (C):  ");
		
		c = scan.nextFloat();
			
		if (a == b && b == c) {
			
			System.out.println("\nAs medidas informadas correspondem a um triângulo Equilatero");
			
		}else if(a == b || a == c || b == c) {
			
			System.out.println("\nAs medidas informadas correspondem a um triângulo Isoceles");
			
		}else {
			
			System.out.println("\nAs medidas informadas correspondem a um triângulo Escaleno");
			
		}	
	
	}

}
