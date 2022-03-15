package Pessoas;

import java.time.LocalDate;

public abstract class Pessoa {

	private String cpf;
	private int id;
	private String nome;
	private String endereco;
	private LocalDate nascimento;
	private String sexo;
	
	public Pessoa(String cpf, int id, String nome, String endereco, LocalDate nascimento, String sexo) {
		super();
		
		this.cpf = cpf;
		
		if (!this.validaCPF(cpf)) {
			
			throw new IllegalArgumentException("ERRO!! CPF INV�LIDO!! POR FAVOR, REINICIAR O SISTEMA!!");
			
		} else {
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.sexo = sexo;
		
		}
	
	}

	public String getCpf() {
		return cpf;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	 /* ATUALIZEI O M�TODO DE VALIDAR O CPF!!!
    INSERI UMA NOVA CONDI��O PARA VERIFICAR SE A QUANTIDADE DE DIGITOS � EQUIVALENTE A 11 QUE SERIA O PADR�O PARA UM CPF.
    MOTIVA��O: SE O USU�RIO INFORMASSE UM CPF DE TAMANHO DIFERENTE O PROGRAMA IRIA RETORNAR QUE ERA FALSO, POIS NO FIM EXISTE
    A VERIFICA��O SE O CPF INFORMADO � IGUAL AO CPF VERIFICADO. ENTRETANTO, ISSO IMPLICA NUM TEMPO MAIOR DE EXECU��O, UMA VEZ
    QUE O DADO IR� PASSAR POR TODAS AS OUTRAS ETAPAS DE VALIDA��O E COMO J� � SABIDO QUE ELE N�O PODE TER UM TAMANHO DIFERENTE 
    DE 11, FEZ-SE NECESS�RIO IMPLEMENTAR ESSE UPGRADE APENAS PARA TORNAR MAIS EFICIENTE O PROGRAMA NESSE CASO EXCEPCIONAL. */
	
	private boolean validaCPF(String cpf) {
		
		 int soma = 0, digito1 = 0, digito2 = 0, i = 0, j = 10;	 
		 String cpf_invalido = "00000000000", cpf_verificado;
		 
		 if(cpf.equals(cpf_invalido) || cpf.length() != 11) {
			 
			 return false;
			 
		 } else {
 
			 while (i < 9) {
				 
				 soma += Integer.parseInt(cpf.charAt(i) + "") * j;	 
				 i++;
				 j--;
				 
			 }
	 
			 digito1 = (soma % 11);
			 digito1 = (11 - digito1);
			  
			 if(digito1 > 9) {
				 
				 digito1 = 0;
				 
			 }
	 		
			 cpf_verificado = cpf.substring(0, 9) + digito1; 
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
			
			if (cpf.equals(cpf_verificado)) {
					
				return true;
					
			} else {
						
				return false;
			
			}
		
		}
	
	}
	
	public abstract String identificacao(); 
	
}
