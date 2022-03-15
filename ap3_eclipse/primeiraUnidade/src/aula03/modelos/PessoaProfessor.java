package aula03.modelos;

public class PessoaProfessor {

	// ATRIBUTOS PESSOA

	private String cpf;
	private int id;
	private String nome;
	private String data_nasc;
	private String endereco;
	private String email;

	
	// ATRIBUTOS PROFESSOR
	
	private String matricula;
	private String titulacao;
	private String departamento;
	private String [] disciplinas;
	
	// CONSTRUTORES
	
	public PessoaProfessor() {
		
	}
	
	public PessoaProfessor(String cpf, int id, String nome, String data_nasc, String endereco, String email,
			String matricula, String titulacao, String departamento) {
		super();
		
		this.cpf = cpf;
		
		if (!this.validaCPF(cpf)) {
			
			throw new IllegalArgumentException("ERRO!! CPF INV�LIDO!!!");
			
		} else {
		
		this.id = id;
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.endereco = endereco;
		this.email = email;
		this.matricula = matricula;
		this.titulacao = titulacao;
		this.departamento = departamento;
		
		}
		
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}	

	public String[] getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	// A EXPLICA��O PARA A L�GICA DESTE M�TODO EST� NOS COMENT�RIOS DA CLASSE "PessoaEstudante"...
	
	private boolean validaCPF(String cpf) {
		
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
	
	// ESSE M�TODO CONSULTA APENAS OS ATRIBUTOS GEN�RICOS DA PESSOA... 

	public void consultar() {
		
		System.out.println("ID: "+ id + "\nNOME: " + nome + "\nDATA DE NASCIMENTO: " + data_nasc + "\nENDERE�O: " + endereco
				+ "\nCPF: " + cpf + "\nEMAIL: " + email);
		
	}
	
	// AS INFORA��ES E L�GICA CONTIDAS NESTE M�TODO FORAM INSPIRADAS NO EXEMPLO POSTO PELA PROFESSORA SARA DURANTE AULAS S�NCRONAS...
	
	public String vinculoAtual() {
		
		String vinculo;
		
		vinculo =  this.nome + " PORTADOR DO CPF "+ this.cpf + " EST� VINCULADO � UNIVERSIDADE COM TITULA��O\n"
				+ this.titulacao + " SOB MATRICULA " + this.matricula + " NO DEPARTAMENTO DE " + this.departamento
				+ ".\nMINISTRANDO AS DISCIPLINAS DE: | ";
			
			for(int i = 0; i < disciplinas.length; i ++) {
				
				vinculo = vinculo + this.disciplinas[i] + " | ";
				
			}
		
			return vinculo;

	}
	
	public void cadastrarTurmasAluno(String nome_estudante, String[] disciplinas) {	
		
		String professor_turma = getNome();
		 	
		String turma = "\nPROFESSOR RESPONS�VEL: " + professor_turma + "\nESTUDANTE MATRICULADO: " + nome_estudante;
		
		String nome_turma = "TURMAS: | ";
		
		for(int i = 0; i < disciplinas.length; i ++) {
			
			nome_turma = nome_turma + this.disciplinas[i] + " | ";
			
		}
		
		nome_turma = nome_turma + turma;
		
		System.out.println(nome_turma);
		
	}
	
}
