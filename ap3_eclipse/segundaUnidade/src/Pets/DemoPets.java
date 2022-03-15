package Pets;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoPets {

	public static void main(String[] args) {
		
		Pet pet = criarPet();
		
		System.out.println("\n======= EXIBINDO DADOS DO PET CADASTRADO =======");
		
		System.out.println(pet.identificacao());
		
		System.out.println("\n======= ATUALIZANDO PESO DO PET =======\n");
		
		editarPet(pet);
		
		System.out.println("\n======= EXIBINDO DADOS ATUALIZADOS =======");
		
		System.out.println(pet.identificacao());
		
	}
	
	public static Pet criarPet() {
		
		Scanner scan = new Scanner(System.in);
		
		int op, id_pet, id_cliente;
		
		double peso;
		
		String tipo, nome, data_nascimento, sexo, raca;
		
		System.out.println("===== CADASTRO DE PET =====\n\nPOR FAVOR, INSIRA OS SEGUINTES DADOS:\n");
		
		System.out.println("ID DO PET: ");
		
		id_pet = scan.nextInt();
		
		System.out.println("ID DO CLIENTE RESPONSÁVEL: ");
		
		id_cliente = scan.nextInt();
		
		System.out.println("NOME DO PET: ");
		
		nome = scan.next();
		
		System.out.println("INSIRA A DATA DE NASCIMENTO DO PET COM O SEGUINTE FORMATO: DIA/MÊS/ANO \nEXEMPLO: 29/08/2009");
		
		data_nascimento = scan.next();
		
		String data_nascimento_separada[] = data_nascimento.split("/");
		
		LocalDate data_nascimento_convertida = LocalDate.of(Integer.parseInt(data_nascimento_separada[2]), 
				Integer.parseInt(data_nascimento_separada[1]), Integer.parseInt(data_nascimento_separada[0]));
		
		System.out.println("SEXO DO PET: ");
		
		sexo = scan.next();
		
		System.out.print("ESCOLHA O TIPO DO ANIMAL\n1) AVE\n2) CACHORRO\n3) GATO\n  => ");
		
		op = scan.nextInt();
		
		switch(op) {
		
			case 1:
				
				tipo = "AVE";
				
				break;
				
			case 2:	
				
				tipo = "CACHORRO";
				
				break;
				
			case 3:	
				
				tipo = "GATO";
				
				break;
				
			default: tipo = "INDEFINIDO!";
		
		}
		
		System.out.println("INFORME O RAÇA DO PET: ");
		
		raca = scan.next();

		System.out.println("INSIRA O PESO: ");
		
		peso = scan.nextDouble();
		
		Pet pet = new Pet(id_pet, id_cliente, nome, data_nascimento_convertida, sexo, tipo, raca, peso);
		
		return pet;
		
	}
	
	public static Pet editarPet(Pet pet) {
		
		Scanner scan = new Scanner(System.in);
	
		double novo_peso;
	
		System.out.println("INSIRA O NOVO PESO:");
	
		novo_peso = scan.nextDouble();

		pet.atualizarPeso(novo_peso);
		
		return pet;

	}
	
}
