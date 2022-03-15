package Pessoas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import Pets.*;

public class Funcionario extends Pessoa implements Gerente, Vendedor {
	
	private LocalDate data_admissao;
	private LocalDate data_demissao;
	private double salario;
	private String justificativa;
	
	public Funcionario(String cpf, int id, String nome, String endereco, LocalDate nascimento, String sexo,
			LocalDate data_admissao, double salario) {
		super(cpf, id, nome, endereco, nascimento, sexo);
	
		this.data_admissao = data_admissao;
		this.salario = salario;	
		
	}
	
	public LocalDate getData_demissao() {
		return data_demissao;
	}
	
	public void setData_demissao(LocalDate data_demissao) {
		this.data_demissao = data_demissao;
	}
	
	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public void solicitarDemissao(LocalDate data, String justificativa) {
		
		setData_demissao(data);
		
		setJustificativa(justificativa);
		
		System.out.println("\nDEMISS�O DO FUNCION�RIO " + getNome() + " AGENDADA PARA: "+ getData_demissao() 
		+ "\nSOB JUSTIFICATIVA: " + getJustificativa());
		
	}

	@Override
	public String identificacao() {
		
		long idade = ChronoUnit.YEARS.between(this.getNascimento(), LocalDate.now());
		
		String info = "\nID: " + this.getId() + "\nNOME: "+ this.getNome() + "\nCPF: " + this.getCpf() 
		+ "\nENDERECO: " + this.getEndereco() + "\nSEXO: " + this.getSexo() + "\nDATA DE NASCIMENTO: " + this.getNascimento() 
		+ "\nIDADE: " + idade + " ANOS" + "\nDATA DE ADMISS�O: " + this.data_admissao + "\nSAL�RIO: " + this.salario;
		
		// VERIFICAR SE O ATRIBUTO DATA_DEMISSAO EST� VAZIO, SE SIM, O M�TODO IR� RETORNAR AS INFORMA��ES DO FUNCION�RIO, BEM 
		// COMO, SEU STATUS (ATIVO). CASO CONTR�RIO, SIGNIFICA QUE O M�TODO DE SOLICITAR DEMISS�O FOI INVOCADO E O V�NCULO DESSE 
		// FUNCION�RIO SER� DESFEITO. LOGO, CABE RETORNAR QUE O MESMO N�O EST� MAIS ATIVO E OS DADOS REFERENTE A DATA DE DEMISS�O 
		// E A JUSTIFICATIVA JUNTO A SUAS INFORMA��ES PESSOAIS.
		
		if(this.data_demissao != null) {
			
			return "\nESSA PESSOA � UM FUNCION�RIO\nSTATUS: INATIVO" + info + "\nDATA DE DEMISS�O: " + this.data_demissao 
					+ "\nJUSTIFICATIVA: " + this.justificativa;
			
		} else {
			
			return "\nESSA PESSOA � UM FUNCION�RIO\nSTATUS: ATIVO" + info;
			
		}
	
	}

	@Override
	public double venderProduto(double valor_compra, double valor_recebido) {
	
		double comissao;
		
		// CASO O RETORNO DO M�TODO COMISSAOPORVENDA SEJA VERDADEIRO, SIGNIFICA QUE O FUNCION�RIO EST� APTO A RECEBER UMA COMISS�O.
		// SENDO ASSIM, � NECESS�RIO CALCULAR QUANTO SER� ESSE VALOR COM BASE NA PORCENTAGEM ESTABELECIDA NA INTERFACE VENDEDOR.
		
		if(comissaoPorVenda(valor_compra)) {
			
			comissao = valor_compra * Vendedor.porcentagem_comissao;
		
		}
		
		// SE O VALOR RECEBIDO PELA COMPRA FOR MAIOR OU EQUIVALENTE AO VALOR TOTAL DELA, SER� RETORNADO O TROCO.
		// CASO CONTR�RIO, O SISTEMA DEVE RETORNAR QUE O VALOR � INSUFICIENTE.
		
		if(valor_recebido >= valor_compra) {
					
			return valor_recebido - valor_compra;
			
		} else {
			
			throw new IllegalArgumentException("O VALOR INFORMADO � INSUFICIENTE PARA EFETUAR O PAGAMENTO!!");
			
		}
	
	}

	// M�TODO PARA VERIFICAR SE A COMPRA EST� SUJEITA A OFERECER UMA COMISS�O PARA O VENDEDOR...
	
	@Override
	public boolean comissaoPorVenda(double valor_compra) {

		if(valor_compra > 100.0) {
			
			return true;
			
		} else {
		
			return false;
		
		}
	
	}

	// OS PR�XIMOS M�TODOS S�O IMPLEMENTA��ES DA INTERFACE GERENTE...
	
	@Override
	public Cliente cadastrarCliente() {
		
		return DemoPessoas.criarCliente();
		
	}

	@Override
	public Funcionario cadastrarFuncionario() {

		return DemoPessoas.criarFuncionario();
		
	}

	@Override
	public Pet cadastrarPet() {

		return DemoPets.criarPet();
		
	}
	
}
