package aula03.main;

import java.util.Scanner;

import aula03.modelos.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String cpf_estudante, cpf_professor, cpf_estudante_ufersa;
		
		System.out.print("OBSERVA��ES IMPORTANTES:\n1. TODOS OS DADOS DAS CLASSES J� FORAM INSERIDOS, COM EXCESS�O DOS CPFs;"
				+ "\n2. A IDEIA DE N�O INSERIR OS CPFs ERA APENAS PARA QUE A PROFESSORA PUDESSE TESTAR O M�TODO DE VALIDA��O DOS MESMOS;"
				+ "\n3. ALGUMAS EXPLICA��ES A CERCA DA L�GICA ENVOLVIDA EST�O COMENTADAS DENTRO DOS PR�PRIOS M�TODOS;"
				+ "\n4. CASO QUEIRA ENTENDER UM POUCO, BASTA ABRIR O PACOTE \"aula03.modelos\" E PROCURAR PELOS M�TODOS DENTRO DAS CLASSES DESSE PACOTE;"
				+ "\n5. AQUI EST� UM CPF V�LIDO -> 58857403300 <- RETIRADO DO SITE: https://www.geradordecpf.org/, PORTANTO, MESMO QUE SEJA COMPATIVEL, "
				+ "AINDA N�O FOI UTILIZADO OFICIALMENTE;\n7. RECOMENDO QUE ENTRE DEPOIS, TAMB�M, COM ALGUM CPF INV�LIDO PARA GARANTIR A FUNCIONALIDADE"
				+ " DO M�TODO. NO MAIS, ERA APENAS ISSO... \\(^_^)/\n\n	DIGITE 1 PARA CONTINUAR O PROGRAMA...\n	=> ");
		
		int observacoes = scan.nextInt();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INST�NCIA DO OBJETO PessoaEstudante:\n=> ");
		
		cpf_estudante = scan.next();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INST�NCIA DO OBJETO PessoaProfesssor:\n=> ");
		
		cpf_professor = scan.next();
		
		System.out.print("POR FAVOR, INFORME UM CPF PARA CONCLUIR A INST�NCIA DO OBJETO PessoaEstudanteUfersa:\n=> ");
		
		cpf_estudante_ufersa = scan.next();
		
		// INSTANCIANDO O OBJETO PESSOA ESTUDANTE
		
		PessoaEstudante estudante = new PessoaEstudante(cpf_estudante, 1, "DINO DA SILVA SAURO", "01/01/1999", "ACRE",
				"dino@email.com", "11223344", "SISTEMAS DE INFORMA��O", "ATIVO", "2019.1", "2020.2" , "8,89000000");	
		
		String [] disciplinas_estudante = {"ALGORITMOS 1", "ALGORITMOS 2", "ALGORITMOS 3"};
		
		estudante.setDisciplinas(disciplinas_estudante);
		
		// INSTANCIANDO O OBJETO PESSOA PROFESSOR
		
		PessoaProfessor professor = new PessoaProfessor(cpf_professor, 27, "GLENN RADARS", "01/08/1984",
				"S�O PAULO", "glenn@email.com", "20211504", "XXX", "TECNOLOGIA DA INFORMA��O - TI");
		
		String [] disciplinas_professor = {"ALGORITMOS 1", "ALGORITMOS 2", "ALGORITMOS 3"};
		
		professor.setDisciplinas(disciplinas_professor);
		
		// INSTANCIANDO O OBJETO PESSOA ESTUDANTE UFERSA
		
		PessoaEstudanteUfersa estudante_ufersa = new PessoaEstudanteUfersa(cpf_estudante_ufersa, "PATOLINO O MAGO", 23, "01/07/2001", "S�O PAULO", "2019011236", 
				"SISTEMAS DE INFORMA��O/CMA - ANGICOS - N", "GRADUA��O", "ATIVO", "patolino@email.com", 
				"PATOLINO.MAGO@alunos.ufersa.edu.br", "2019.1", "8.1182", "0.9167", "4.3662",
				"7.475", "0.5867", 2040, 300, 3000, 22);
		
		// CHAMANDO TODOS OS M�TODOS DE PESSOA ESTUDANTE
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA CONSULTAR OS DADOS DE PESSOA_ESTUDANTE:\n");
		
		estudante.consultar();
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA VERIFICAR O V�NCULO ATUAL DE PESSOA_ESTUDANTE:\n");
	
		System.out.println(estudante.vinculoAtual());
		
		// CHAMANDO TODOS OS M�TODOS DE PESSOA PROFESSOR
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA CONSULTAR OS DADOS DE PESSOA_PROFESSOR:\n");
		
		professor.consultar();
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA VERIFICAR O V�NCULO ATUAL DE PESSOA_PROFESSOR:\n");
		
		System.out.println(professor.vinculoAtual());
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA CONSULTAR AS TURMAS CADASTRADAS:\n");
		
		professor.cadastrarTurmasAluno(estudante.getNome(), estudante.getDisciplinas());
		
		// CHAMANDO TODOS OS M�TODOS DE PESSOA ESTUDANTE UFERSA
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA VERIFICAR OS DADOS ACAD�MICOS DE PESSOA_ESTUDANTE_UFERSA NO SIGAA:\n");

		System.out.println(estudante_ufersa.mostrarDadosUFERSA());
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA CONSULTAR OS DADOS PESSOAIS NO SIGAA:\n");
		
		estudante_ufersa.consultar();
		
		System.out.println("\nIMPRESS�O DO M�TODO PARA VERIFICAR O V�NCULO ATUAL DE PESSOA_ESTUDANTE_UFERSA NO SIGAA:\n");

		System.out.println(estudante_ufersa.vinculoAtual());
		
		System.out.println("\n\n	ARRASTA PRA CIMA PRA VIZUALIZAR AS SA�DAS DOS OUTROS M�TODOS!! \\(^_^)/");

	}

}
