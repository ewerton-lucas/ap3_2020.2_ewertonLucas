package aula03.main;

import java.util.Scanner;

import aula03.modelos.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String cpf_estudante, cpf_professor, cpf_estudante_ufersa;
		
		System.out.print("OBSERVAÇÕES IMPORTANTES:\n1. TODOS OS DADOS DAS CLASSES JÁ FORAM INSERIDOS, COM EXCESSÃO DOS CPFs;"
				+ "\n2. A IDEIA DE NÃO INSERIR OS CPFs ERA APENAS PARA QUE A PROFESSORA PUDESSE TESTAR O MÉTODO DE VALIDAÇÃO DOS MESMOS;"
				+ "\n3. ALGUMAS EXPLICAÇÕES A CERCA DA LÓGICA ENVOLVIDA ESTÃO COMENTADAS DENTRO DOS PRÓPRIOS MÉTODOS;"
				+ "\n4. CASO QUEIRA ENTENDER UM POUCO, BASTA ABRIR O PACOTE \"aula03.modelos\" E PROCURAR PELOS MÉTODOS DENTRO DAS CLASSES DESSE PACOTE;"
				+ "\n5. AQUI ESTÁ UM CPF VÁLIDO -> 58857403300 <- RETIRADO DO SITE: https://www.geradordecpf.org/, PORTANTO, MESMO QUE SEJA COMPATIVEL, "
				+ "AINDA NÃO FOI UTILIZADO OFICIALMENTE;\n7. RECOMENDO QUE ENTRE DEPOIS, TAMBÉM, COM ALGUM CPF INVÁLIDO PARA GARANTIR A FUNCIONALIDADE"
				+ " DO MÉTODO. NO MAIS, ERA APENAS ISSO... \\(^_^)/\n\n	DIGITE 1 PARA CONTINUAR O PROGRAMA...\n	=> ");
		
		int observacoes = scan.nextInt();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INSTÂNCIA DO OBJETO PessoaEstudante:\n=> ");
		
		cpf_estudante = scan.next();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INSTÂNCIA DO OBJETO PessoaProfesssor:\n=> ");
		
		cpf_professor = scan.next();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INSTÂNCIA DO OBJETO PessoaEstudanteUfersa:\n=> ");
		
		cpf_estudante_ufersa = scan.next();
		
		// INSTANCIANDO O OBJETO PESSOA ESTUDANTE
		
		PessoaEstudante estudante = new PessoaEstudante(cpf_estudante, 1, "DINO DA SILVA SAURO", "01/01/1999", "ACRE",
				"dino@email.com", "11223344", "SISTEMAS DE INFORMAÇÃO", "ATIVO", "2019.1", "2020.2" , "8,89000000");	
		
		String [] disciplinas_estudante = {"ALGORITMOS 1", "ALGORITMOS 2", "ALGORITMOS 3"};
		
		estudante.setDisciplinas(disciplinas_estudante);
		
		// INSTANCIANDO O OBJETO PESSOA PROFESSOR
		
		PessoaProfessor professor = new PessoaProfessor(cpf_professor, 27, "GLENN RADARS", "01/08/1984",
				"SÃO PAULO", "glenn@email.com", "20211504", "XXX", "TECNOLOGIA DA INFORMAÇÃO - TI");
		
		String [] disciplinas_professor = {"ALGORITMOS 1", "ALGORITMOS 2", "ALGORITMOS 3"};
		
		professor.setDisciplinas(disciplinas_professor);
		
		// INSTANCIANDO O OBJETO PESSOA ESTUDANTE UFERSA
		
		PessoaEstudanteUfersa estudante_ufersa = new PessoaEstudanteUfersa(cpf_estudante_ufersa, "PATOLINO O MAGO", 23, "01/07/2001", "SÃO PAULO", "2019011236", 
				"SISTEMAS DE INFORMAÇÃO/CMA - ANGICOS - N", "GRADUAÇÃO", "ATIVO", "patolino@email.com", 
				"PATOLINO.MAGO@alunos.ufersa.edu.br", "2019.1", "8.1182", "0.9167", "4.3662",
				"7.475", "0.5867", 2040, 300, 3000, 22);
		
		// CHAMANDO TODOS OS MÉTODOS DE PESSOA ESTUDANTE
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA CONSULTAR OS DADOS DE PESSOA_ESTUDANTE:\n");
		
		estudante.consultar();
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA VERIFICAR O VÍNCULO ATUAL DE PESSOA_ESTUDANTE:\n");
	
		System.out.println(estudante.vinculoAtual());
		
		// CHAMANDO TODOS OS MÉTODOS DE PESSOA PROFESSOR
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA CONSULTAR OS DADOS DE PESSOA_PROFESSOR:\n");
		
		professor.consultar();
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA VERIFICAR O VÍNCULO ATUAL DE PESSOA_PROFESSOR:\n");
		
		System.out.println(professor.vinculoAtual());
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA CONSULTAR AS TURMAS CADASTRADAS:\n");
		
		professor.cadastrarTurmasAluno(estudante.getNome(), estudante.getDisciplinas());
		
		// CHAMANDO TODOS OS MÉTODOS DE PESSOA ESTUDANTE UFERSA
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA VERIFICAR OS DADOS ACADÊMICOS DE PESSOA_ESTUDANTE_UFERSA NO SIGAA:\n");

		System.out.println(estudante_ufersa.mostrarDadosUFERSA());
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA CONSULTAR OS DADOS PESSOAIS NO SIGAA:\n");
		
		estudante_ufersa.consultar();
		
		System.out.println("\nIMPRESSÃO DO MÉTODO PARA VERIFICAR O VÍNCULO ATUAL DE PESSOA_ESTUDANTE_UFERSA NO SIGAA:\n");

		System.out.println(estudante_ufersa.vinculoAtual());
		
		System.out.println("\n\n	ARRASTA PRA CIMA PRA VIZUALIZAR AS SAÍDAS DOS OUTROS MÉTODOS!! \\(^_^)/");

	}

}
