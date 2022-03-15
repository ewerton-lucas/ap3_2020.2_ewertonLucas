package Pessoas;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoPessoas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcao_menu_principal;
		
		do {
		
			System.out.print("===== BEM VINDO A PÁGINA DE CADASTROS =====\n" + "\nPOR FAVOR, SELECIONE UMA DAS OPÇÕES ABAIXO!\n"
					+ "\n1) CLIENTE	\\(^_~)/\n2) FUNCIONÁRIO	\\(U_U)/\n3) ENCERRAR O PROGRAMA	\\(>_<)/\n => ");
			
			opcao_menu_principal = scan.nextInt();
			
			switch (opcao_menu_principal) {
			
			// PÁGINA DO CLIENTE
			
			case 1:
				
				int opcao_menu_cliente;
				
				Cliente cliente = criarCliente();
			
			do {		
				
				System.out.print("\n==== PÁGINA DO CLIENTE ==== \n\nPOR FAVOR, SELECIONE UMA OPÇÃO!\n\n1) EXIBIR DADOS DO CLIENTE"
						+ "\n2) EXIBIR DADOS DO PET \n3) ATUALIZAR O PESO DO PET\n4) VOLTAR AO MENU PRINCIPAL \\(>_<)/\n => ");
				
				opcao_menu_cliente = scan.nextInt();
				
					switch (opcao_menu_cliente) {
					
					case 1:
						
						System.out.println(cliente.identificacao());
						
						break;
						
					case 2:	
						
						System.out.println(cliente.identificarPet());
						
						break;
					
					case 3:
					
						System.out.println("\n==== EDITAR PESO DO PET ====\n");
						
						cliente.setPet(cliente.getPet());
						
						break;

					default: System.out.println("\nSESSÃO ENCERRADA... \\(>.<)/\n");
					
						break;
					}
					
				} while (opcao_menu_cliente < 4);	
						
				break;
				
				// PÁGINA DO FUNCIONÁRIO
				
				case 2:
					
					int opcao_menu_funcionario;
					
					Funcionario funcionario = criarFuncionario();
				
				do {		
					
					System.out.print("\n==== PÁGINA DO FUNCIONÁRIO ==== \nPOR FAVOR, SELECIONE UMA OPÇÃO!\n"
							+ "\n1) EXIBIR DADOS DO FUNCIONÁRIO" + "\n2) SOLICITAR DEMISSÃO "
							+ "\n3) VOLTAR AO MENU PRINCIPAL \\(>_<)/\n => ");
					
					opcao_menu_funcionario = scan.nextInt();
					
					switch (opcao_menu_funcionario) {
					
					case 1:
						
						System.out.println(funcionario.identificacao());
						
						break;

					case 2:
						
						System.out.println("INFORME A DATA DE DEMISSÃO PREVISTA COM O SEGUINTE FORMATO: DIA/MÊS/ANO "
								+ "\nEXEMPLO: 03/04/2021");
						
						String data_demissao = scan.next();
						
						String data_demissao_separada[] = data_demissao.split("/");
						
						LocalDate data_demissao_convertida = LocalDate.of(Integer.parseInt(data_demissao_separada[2]), 
								Integer.parseInt(data_demissao_separada[1]), Integer.parseInt(data_demissao_separada[0]));
						
						System.out.println("INFORME A JUSTIFICATIVA:");
						
						String justificativa = scan.next();
						
						funcionario.solicitarDemissao(data_demissao_convertida, justificativa);
						
						break;

					default:  System.out.println("\nSESSÃO ENCERRADA... \\(>.<)/\n");
						
						break;
					}
					
				} while (opcao_menu_funcionario < 3);	
					
					break;
									
			default: System.out.println("\nPROGRAMA ENCERRADO... ATÉ LOGO!! \\(^_^)/");
				
				break;
			}
			
		} while (opcao_menu_principal < 3);
		
	}
	
	public static Cliente criarCliente() {
		
		Scanner scan = new Scanner(System.in);
		
		int id;
		
		String cpf_cliente, nome, endereco, data_nascimento, sexo;
		
		System.out.println("===== CADASTRO DE CLIENTE =====\n\nPOR FAVOR, INSIRA OS SEGUINTES DADOS:\n");
		
		System.out.println("CPF: ");
		
		cpf_cliente = scan.next();
		
		System.out.println("ID: ");
		
		id = scan.nextInt();
		
		System.out.println("NOME: ");
		
		nome = scan.next();
		
		System.out.println("ENDEREÇO SEPARADO POR UNDERLINE: ");
		
		endereco = scan.next();
		
		System.out.println("INSIRA A DATA DE NASCIMENTO COM O SEGUINTE FORMATO: DIA/MÊS/ANO \nEXEMPLO: 18/04/1999");
		
		data_nascimento = scan.next();
		
		String data_nascimento_separada[] = data_nascimento.split("/");
		
		LocalDate data_nascimento_convertida = LocalDate.of(Integer.parseInt(data_nascimento_separada[2]), 
				Integer.parseInt(data_nascimento_separada[1]), Integer.parseInt(data_nascimento_separada[0]));
		
		System.out.println("SEXO: ");
		
		sexo = scan.next();
		
		Cliente cliente = new Cliente(cpf_cliente, id, nome, endereco, data_nascimento_convertida, sexo);
		
		return cliente;
		
	}
	
	public static Funcionario criarFuncionario() {
		
		Scanner scan = new Scanner(System.in);
		
		int id;
		
		double salario;
		
		String cpf_funcionario, nome, endereco, data_nascimento, sexo, data_admissao;
		
		System.out.println("===== CADASTRO DE FUNCIONÁRIO =====\n\nPOR FAVOR, INSIRA OS SEGUINTES DADOS:\n");
		
		System.out.println("CPF: ");
		
		cpf_funcionario = scan.next();
		
		System.out.println("ID: ");
		
		id = scan.nextInt();
		
		System.out.println("NOME: ");
		
		nome = scan.next();
		
		System.out.println("ENDEREÇO SEPARADO POR UNDERLINE: ");
		
		endereco = scan.next();
		
		System.out.println("INSIRA A DATA DE NASCIMENTO COM O SEGUINTE FORMATO: DIA/MÊS/ANO \nEXEMPLO: 18/04/1999");
		
		data_nascimento = scan.next();
		
		String data_nascimento_separada[] = data_nascimento.split("/");
		
		LocalDate data_nascimento_convertida = LocalDate.of(Integer.parseInt(data_nascimento_separada[2]), 
				Integer.parseInt(data_nascimento_separada[1]), Integer.parseInt(data_nascimento_separada[0]));
		
		System.out.println("SEXO: ");
		
		sexo = scan.next();
		
		System.out.println("INSIRA A DATA DE ADMISSÃO COM O SEGUINTE FORMATO: DIA/MÊS/ANO \nEXEMPLO: 01/01/2018");
		
		data_admissao = scan.next();
		
		String data_admissao_separada[] = data_admissao.split("/");
		
		LocalDate data_admissao_convertida = LocalDate.of(Integer.parseInt(data_admissao_separada[2]), 
				Integer.parseInt(data_admissao_separada[1]), Integer.parseInt(data_admissao_separada[0]));
		
		System.out.println("SALÁRIO: ");
		
		salario = scan.nextDouble();
		
		Funcionario funcionario = new Funcionario(cpf_funcionario, id, nome, endereco, data_nascimento_convertida, sexo, 
				data_admissao_convertida, salario);
		
		return funcionario;
		
	}

}
