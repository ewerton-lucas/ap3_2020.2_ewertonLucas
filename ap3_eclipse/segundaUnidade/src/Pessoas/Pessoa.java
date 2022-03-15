package Pessoas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String cpf;
	private int id;
	private String nome;
	private String endereco;
	private LocalDate nascimento;
	private String sexo;
	
	// CONSTRUTOR
		
	public Pessoa(String cpf, int id, String nome, String endereco, LocalDate nascimento, String sexo) {
		super();
		
		this.cpf = cpf;
		
		if (!this.validaCPF(cpf)) {
			
			throw new IllegalArgumentException("ERRO!! CPF INVÁLIDO!! POR FAVOR, REINICIAR O SISTEMA!!");
			
		} else {
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.sexo = sexo;
		
		}
	
	}

	// MÉTODOS

	public String getNome() {
		return nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public String getCpf() {
		return cpf;
	}
	
	// A LÓGICA DESSE MÉTODO JÁ FOI COMENTADA POR MIM NA AVALIAÇÃO DA PRIMEIRA UNIDADE...
	
	private boolean validaCPF(String cpf) {
		
		 String cpf_invalido = "00000000000";
		 String cpf_verificado;
		 int soma = 0, digito1 = 0, digito2 = 0, i = 0, j = 10;	 
		 
		 if(cpf.equals(cpf_invalido)) {
			 
			 return false;
			 
		 } else {
		 
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
	
	}
	
	public String identificacao() {
				
		// A PRÓXIMA LINHA DE CÓDIGO REALIZA O CÁLCULO DA DIFERENÇA EM ANOS DE UMA DATA FORNECIDA PELO USUÁRIO PELA
		// DATA ATUAL REFERENTE AO MOMENTO EM QUE ESSE PROGRAMA FOI EXECUTADO...
		
		long idade = ChronoUnit.YEARS.between(getNascimento(), LocalDate.now());
		
		String info = "\nID: " + this.id + "\nNOME: "+ this.nome + "\nCPF: " + this.cpf + 
				"\nENDERECO: " + this.endereco + "\nSEXO: " + this.sexo + "\nDATA DE NASCIMENTO: " 
				+ this.nascimento + "\nIDADE: " + idade + " ANOS";
		
		// O OPERADOR INSTANCEOF IDENTIFICA A QUE TIPO REFERE-SE A CLASSE QUE SOLICITOU ESTE MÉTODO DE IDENTIFICAÇÃO...
		
		if(this instanceof Cliente) {
			
			return "\nESSA PESSOA É UM CLIENTE" + info;

		} else if(this instanceof Funcionario) {
			
			return "\nESSA PESSOA É UM FUNCIONÁRIO" + info;
			
		} else {
		
			return "\nESSA PESSOA NÃO POSSUI UM SUBTIPO" + info;
		
		}
		
	}
	
}
