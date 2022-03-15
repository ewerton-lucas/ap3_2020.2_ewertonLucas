package Pessoas;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoPessoas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcao_menu_principal;
		
		do {
		
			System.out.print("===== BEM VINDO A P�GINA DE CADASTROS =====\n" + "\nPOR FAVOR, SELECIONE UMA DAS OP��ES ABAIXO!\n"
					+ "\n1) CLIENTE	\\(^_~)/\n2) FUNCION�RIO	\\(U_U)/\n3) ENCERRAR O PROGRAMA	\\(>_<)/\n => ");
			
			opcao_menu_principal = scan.nextInt();
			
			switch (opcao_menu_principal) {
			
			// P�GINA DO CLIENTE
			
			case 1:
				
				int opcao_menu_cliente;
				
				Cliente cliente = criarCliente();
			
			do {		
				
				System.out.print("\n==== P�GINA DO CLIENTE ==== \n\nPOR FAVOR, SELECIONE UMA OP��O!\n\n1) EXIBIR DADOS DO CLIENTE"
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

					default: System.out.println("\nSESS�O ENCERRADA... \\(>.<)/\n");
					
						break;
					}
					
				} while (opcao_menu_cliente < 4);	
						
				break;
				
				// P�GINA DO FUNCION�RIO
				
				case 2:
					
					int opcao_menu_funcionario;
					
					Funcionario funcionario = criarFuncionario();
				
				do {		
					
					System.out.print("\n==== P�GINA DO FUNCION�RIO ==== \nPOR FAVOR, SELECIONE UMA OP��O!\n"
							+ "\n1) EXIBIR DADOS DO FUNCION�RIO" + "\n2) SOLICITAR DEMISS�O "
							+ "\n3) VOLTAR AO MENU PRINCIPAL \\(>_<)/\n => ");
					
					opcao_menu_funcionario = scan.nextInt();
					
					switch (opcao_menu_funcionario) {
					
					case 1:
						
						System.out.println(funcionario.identificacao());
						
						break;

					case 2:
						
						System.out.println("INFORME A DATA DE DEMISS�O PREVISTA COM O SEGUINTE FORMATO: DIA/M�S/ANO "
								+ "\nEXEMPLO: 03/04/2021");
						
						String data_demissao = scan.next();
						
						String data_demissao_separada[] = data_demissao.split("/");
						
						LocalDate data_demissao_convertida = LocalDate.of(Integer.parseInt(data_demissao_separada[2]), 
								Integer.parseInt(data_demissao_separada[1]), Integer.parseInt(data_demissao_separada[0]));
						
						System.out.println("INFORME A JUSTIFICATIVA:");
						
						String justificativa = scan.next();
						
						funcionario.solicitarDemissao(data_demissao_convertida, justificativa);
						
						break;

					default:  System.out.println("\nSESS�O ENCERRADA... \\(>.<)/\n");
						
						break;
					}
					
				} while (opcao_menu_funcionario < 3);	
					
					break;
									
			default: System.out.println("\nPROGRAMA ENCERRADO... AT� LOGO!! \\(^_^)/");
				
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
		
		System.out.println("ENDERE�O SEPARADO POR UNDERLINE: ");
		
		endereco = scan.next();
		
		System.out.println("INSIRA A DATA DE NASCIMENTO COM O SEGUINTE FORMATO: DIA/M�S/ANO \nEXEMPLO: 18/04/1999");
		
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
		
		System.out.println("===== CADASTRO DE FUNCION�RIO =====\n\nPOR FAVOR, INSIRA OS SEGUINTES DADOS:\n");
		
		System.out.println("CPF: ");
		
		cpf_funcionario = scan.next();
		
		System.out.println("ID: ");
		
		id = scan.nextInt();
		
		System.out.println("NOME: ");
		
		nome = scan.next();
		
		System.out.println("ENDERE�O SEPARADO POR UNDERLINE: ");
		
		endereco = scan.next();
		
		System.out.println("INSIRA A DATA DE NASCIMENTO COM O SEGUINTE FORMATO: DIA/M�S/ANO \nEXEMPLO: 18/04/1999");
		
		data_nascimento = scan.next();
		
		String data_nascimento_separada[] = data_nascimento.split("/");
		
		LocalDate data_nascimento_convertida = LocalDate.of(Integer.parseInt(data_nascimento_separada[2]), 
				Integer.parseInt(data_nascimento_separada[1]), Integer.parseInt(data_nascimento_separada[0]));
		
		System.out.println("SEXO: ");
		
		sexo = scan.next();
		
		System.out.println("INSIRA A DATA DE ADMISS�O COM O SEGUINTE FORMATO: DIA/M�S/ANO \nEXEMPLO: 01/01/2018");
		
		data_admissao = scan.next();
		
		String data_admissao_separada[] = data_admissao.split("/");
		
		LocalDate data_admissao_convertida = LocalDate.of(Integer.parseInt(data_admissao_separada[2]), 
				Integer.parseInt(data_admissao_separada[1]), Integer.parseInt(data_admissao_separada[0]));
		
		System.out.println("SAL�RIO: ");
		
		salario = scan.nextDouble();
		
		Funcionario funcionario = new Funcionario(cpf_funcionario, id, nome, endereco, data_nascimento_convertida, sexo, 
				data_admissao_convertida, salario);
		
		return funcionario;
		
	}

}
