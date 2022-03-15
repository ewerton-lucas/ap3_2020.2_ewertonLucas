package aula03.modelos;

public class PessoaEstudanteUfersa {

	// ATRIBUTOS PESSOA
	
	private String cpf;
	private int id;
	private String nome;
	private String data_nasc;
	private String endereco;

	// ATRIBUTOS ESTUDANTE UFERSA
	
	private String matricula;
	private String curso;
	private String nivel;
	private String status;
	private String email_pessoal;
	private String email_institucional;
	private String entrada;
	private String mc;
	private String iech;
	private String iea;
	private String ira;
	private String iepl;
	private int ch_Obrigatoria_Pendente;
	private int ch_Optativa_Pendente;
	private int ch_Total_Curriculo;
	private int integralizado;
	
	// CONSTRUTORES
	
	public PessoaEstudanteUfersa() {
		
	}
	
	public PessoaEstudanteUfersa(String cpf, String nome, int id, String data_nasc, String endereco, String matricula, String curso,
			String nivel, String status, String email_pessoal, String email_institucional, String entrada, String mc, String iech, 
			String iea, String ira, String iepl, int ch_Obrigatoria_Pendente, int ch_Optativa_Pendente, int ch_Total_Curriculo,
			int integralizado) {
		
		super();
		
		this.cpf = cpf;
		
		if (!this.validaCPF(cpf)) {
			
			throw new IllegalArgumentException("ERRO!! CPF INV�LIDO!!!");
			
		} else {
		
		this.id = id;
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.endereco = endereco;
		this.matricula = matricula;
		this.curso = curso;
		this.nivel = nivel;
		this.status = status;
		this.email_pessoal = email_pessoal;
		this.email_institucional = email_institucional;
		this.entrada = entrada;
		this.mc = mc;
		this.iech = iech;
		this.iea = iea;
		this.ira = ira;
		this.iepl = iepl;
		this.ch_Obrigatoria_Pendente = ch_Obrigatoria_Pendente;
		this.ch_Optativa_Pendente = ch_Optativa_Pendente;
		this.ch_Total_Curriculo = ch_Total_Curriculo;
		this.integralizado = integralizado;
		
		}
		
	}

	// M�TODOS
	
	public String getCpf() {
		return cpf;
	}
	
	//ESTE M�TODO RETORNA OS DADOS DE UM ALUNO COM A M�SCARA DO SIGAA
	
	public String mostrarDadosUFERSA() {
		
		String pagina_do_aluno;
		
		pagina_do_aluno =  "		Dados Institucionais"
				+ "\n\nMatricula: " + this.matricula
				+ "\nCurso: " + this.curso
				+ "\nNivel: " + this.nivel 
				+ "\nStatus: "+ this.status
				+ "\n\n		   E-mail Pessoal\n	       " + this.email_pessoal +"\n"
				+ "\n		E-mail Institucional\n	 " + this.email_institucional
				+ "\n\nEntrada: " + this.entrada
				+"\n\n		�ndices Acad�micos"
				+ "\n\nMC:		" + this.mc + "		IRA:		" + this.ira 
				+ "\nIECH:		" + this.iech + "		IEPL:		" + this.iepl
				+ "\nIEA:		" + iea
				+ "\n		  Detalhar"
				+ "\n\n		Integraliza��es:"
				+ "\n\nCH. Obrigatoria Pendente:			" + this.ch_Obrigatoria_Pendente 
				+ "\nCH. Optativa_Pendente:				 " + this.ch_Optativa_Pendente 
				+ "\nCH. Total Curriculo:				" + this.ch_Total_Curriculo 
				+ "\n======================================================"
				+ "\n		" + this.integralizado +"% Integralizado";
		
		return pagina_do_aluno;
		
	}
	
	// A EXPLICA��O PARA A L�GICA DESTE M�TODO EST� NOS COMENT�RIOS DA CLASSE "PessoaEstudante"...
	
	public boolean validaCPF(String cpf) {
		
		 String cpf_verificado;
		 int soma = 0, digito1 = 0, digito2 = 0, i = 0, j = 10;	 
		
		 while (i < 9) {
			 
			 soma += Integer.parseInt((getCpf()).charAt(i) + "") * j;
			 i++;
			 j--;
			 
		 }
		 
		 digito1 = (soma % 11);
		 digito1 = (11 - digito1);
		 
		 if(digito1 > 9) {
			 
			 digito1 = 0;
			 
		 }
		 		 
		 cpf_verificado = getCpf().substring(0, 9) + digito1;
			
		    soma = 0;
		    j = 11;
		    
		    while (i < 10) {
			 
			 soma += Integer.parseInt((cpf_verificado).charAt(i) + "") * j;
			 i++;
			 j--;
			 
		 }
		 
		 digito2 = (soma % 11);
		 digito2 = (11 - digito2);
		 
		 if(digito2 > 9) {
			 
			 digito2 = 0;
			 
		 }
		 
		cpf_verificado = cpf_verificado.substring(0, 10) + digito2;
		 		 
		if (getCpf().equals(cpf_verificado)) {
				
			return true;
				
		} else {
					
			return false;
		
		}
	
	}
	
	// ESSE M�TODO CONSULTA APENAS OS ATRIBUTOS GEN�RICOS DA PESSOA 
	
	public void consultar() {
		
		System.out.println("DADOS PESSOAIS DO ALUNO:\n\nID: "+ id + "\nNOME: " + nome + "\nDATA DE NASCIMENTO: " + data_nasc + "\nENDERE�O: " 
		+ endereco + "\nCPF: " + cpf + "\nEMAIL PESSOAL: " + email_pessoal + "\nEMAIL INSTITUCIONAL: " + email_institucional);

	}
	
	// AS INFORA��ES CONTIDAS NO RETORNO DESTE M�TODO FORAM INSPIRADAS NO MODELO DE DECLARA��O DE V�NCULO DO SIGAA
	
	public String vinculoAtual() {
		
		String vinculo;
		
		vinculo = "			D E C L A R A � � O\n\n"
				+ "   Declaramos para os fins a que se fizerem necess�rios que " + this.nome
				+ ", portador \ndo CPF " + this.cpf + ", � aluno vinculado a esta "
				+ "Universidade sob matr�cula  " + this.matricula + "\nno curso de BACHARELADO em " + this.curso
				+ ", com percentual \nde carga hor�ria integralizada de " + this.integralizado + "%, com situa��o atual " 
				+ this.status + ".";
		
			return vinculo;
		
	}
	
}
