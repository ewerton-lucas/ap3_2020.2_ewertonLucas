package aula03.modelos;

public class PessoaEstudante {
	
	// ATRIBUTOS PESSOA
	
	private int id;
	private String nome;
	private String data_nasc;
	private String endereco;
	private String cpf;
	private String email;
	
	// ATRIBUTOS ESTUDANTE
	
	private String matricula;
	private String curso;
	private String ira;
	private String periodo_entrada;
	private String status;
	private String periodo_atual;
	private String [] disciplinas;
	
	// CONSTRUTORES
	
	public PessoaEstudante() {
		
	}
	
	public PessoaEstudante(String cpf, int id, String nome, String data_nasc, String endereco, String email,
			String matricula, String curso, String status, String periodo_entrada, String periodo_atual,
			String ira) {
		
		super();
		
		this.cpf = cpf;
		
		// SE O CPF FOR INVÁLIDO NÃO EXECUTA OS PRÓXIMOS COMANDOS
		
		if (!this.validaCPF(cpf)) {
			
			throw new IllegalArgumentException("ERRO!! CPF INVÁLIDO!!!");
			
		} else {
		
		this.id = id;
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.endereco = endereco;
		this.email = email;
		this.matricula = matricula;
		this.curso = curso;
		this.status = status;
		this.periodo_entrada = periodo_entrada;
		this.periodo_atual = periodo_atual;
		this.ira = ira;
		
		}
	}
	
	// MÉTODOS
	
	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	// ESSE MÉTODO FOI DESENVOLVIDO COM BASE EM CÁLCULOS QUE ESTÃO DISPONÍVEIS NO SITE DO MINISTÉRIO DA FAZENDA PARA REALIZAR A VALIDAÇÃO DO CPF...
	
	private boolean validaCPF(String cpf) {
		
		// EXPLICANDO UM POUCO DA LÓGICA:
		// INÍCIO DO PASSO 1: CALCULAR O PRIMEIRO DÍGITO VERIFICADOR...
		
		 String cpf_verificado;
		 int soma = 0, digito1 = 0, digito2 = 0, i = 0, j = 10;	 
		 
		 while (i < 9) {
			 
		//  A VARIÁVEL 'soma' RECEBE A SOMA DO PRODUTO DOS CARACTERES DO CPF FORNECIDO PELO USUÁRIO EM ORDEM CRESCENTE 
		//  CONVERTIDOS EM TIPO INTEIRO, PELO VALOR DE 'j' EM ORDEM DECRESCENTE... 
			 
			 soma += Integer.parseInt((getCpf()).charAt(i) + "") * j;
			 		 
			 i++;
			 j--;
			 
		 }
		 
		 // A VARIÁVEL 'digito1' RECEBE O RESTO DA DIVISÃO POR 11 DA VARIÁVEL 'soma'...
		 // DEPOIS É FEITA UMA SUBTRAÇÃO DO RESTO DA DIVISÃO POR 11...
		 
		 digito1 = (soma % 11);
		 digito1 = (11 - digito1);
		 
		 // AGORA, DEVE-SE VERIFICAR SE O RESULTADO DA SUBTRAÇÃO É MAIOR QUE 9, SE SIM, A VARIÁVEL 'digito1' RECEBE ZERO...
		 
		 if(digito1 > 9) {
			 
			 digito1 = 0;
			 
		 }
		 		 
		 // APÓS EXECUTAR OS COMANDOS, DEVE-SE PEGAR OS 9 PRIMEIROS DIGITOS DO CPF INFORMADO PELO USUÁRIO, CONCATENAR COM
		 // O PRIMEIRO DIGITO VERIFICADOR E ATRIBUIR ESSE RESULTADO À VARIÁVEL "cpf_verificado"...
		 
		 cpf_verificado = getCpf().substring(0, 9) + digito1;
			
		 // FIM DO PASSO 1...
		 
		 // INÍCIO DO PASSO 2: CALCULAR O SEGUNDO DÍGITO VERIFICADOR...
		 // REINICIALIZAR O VALOR DA VARIÁVEL 'soma' E ATUALIZAR O VALOR DO CONTADOR 'j'...
		 
		    soma = 0;
		    j = 11;
		    
		    while (i < 10) {
			 
		 //  A VARIÁVEL 'soma' RECEBE A SOMA DO PRODUTO DOS CARACTERES DO 'cpf_verificado' EM ORDEM CRESCENTE 
		 //  CONVERTIDOS EM TIPO INTEIRO PELO VALOR DE 'j' EM ORDEM DECRESCENTE...    	
		    	
			 soma += Integer.parseInt((cpf_verificado).charAt(i) + "") * j;
			 
			 i++;
			 j--;
			 
		 }
		
		// A VARIÁVEL 'digito2' RECEBE O RESTO DA DIVISÃO POR 11 DA VARIÁVEL 'soma'...  
		// DEPOIS É FEITA UMA SUBTRAÇÃO DO RESTO DA DIVISÃO POR 11...  
		    
		 digito2 = (soma % 11);
		 digito2 = (11 - digito2);
		 
		// SE O RESULTADO DA SUBTRAÇÃO FOR MAIOR QUE 9, A VARIÁVEL 'digito2' RECEBE ZERO...	 
		 
		 if(digito2 > 9) {
			 
			 digito2 = 0;
			 
		 }
		 
		// PEGAR OS 10 DIGITOS DO CPF VERIFICADO, CONCATENAR COM O SEGUNDO DIGITO VERIFICADOR
		// E ATRIBUIR ESSE RESULTADO À VARIÁVEL "cpf_verificado"...		 
		 
		cpf_verificado = cpf_verificado.substring(0, 10) + digito2;
		
		// POR FIM, COMPARAR SE O CPF DO USUÁRIO É IGUAL AO CPF VERIFICADO E RETORNAR UM VALOR BOOLEANO...
		
		if (getCpf().equals(cpf_verificado)) {
				
			return true;
				
		} else {
					
			return false;
		
		}
	
	}

	// ESSE MÉTODO CONSULTA APENAS OS ATRIBUTOS GENÉRICOS DA PESSOA... 

	public void consultar() {
		
		System.out.println("ID: "+ id + "\nNOME: " + nome + "\nDATA DE NASCIMENTO: " + data_nasc + "\nENDEREÇO: " + endereco
				+ "\nCPF: " + cpf + "\nEMAIL: " + email);
		
	}

	// AS INFORAÇÕES E LÓGICA CONTIDAS NESTE MÉTODO FORAM INSPIRADAS NO EXEMPLO EXPOSTO PELA PROFESSORA SARA DURANTE AULAS SÍNCRONAS
	
	public String vinculoAtual() {
		
		String vinculo;
		
		vinculo = "	DECLARAMOS QUE O ALUNO " + this.nome + " PORTADOR DO CPF "+ this.cpf + " ESTÁ \nVINCULADO À ESTA UNIVERSIDADE"
				+ " SOB MATRICULA " + this.matricula + " NO CURSO "
				+ this.curso + "\nDESDE O PERÍODO " + this.periodo_entrada + ", ATUALMENTE NO PERÍODO " + this.periodo_atual
				+ " COM STATUS " + this.status + " IRA " + this.ira;
		
		if(this.status == "ATIVO") {
			
			vinculo = vinculo + "\nCURSANDO AS DISCIPLINAS DE: | ";
			
			for(int i = 0; i < disciplinas.length; i ++) {
				
				vinculo = vinculo + this.disciplinas[i] + " | ";
				
			}
			
		}
			return vinculo;

	}

}
