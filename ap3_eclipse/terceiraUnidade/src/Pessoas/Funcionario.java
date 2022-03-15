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
		
		System.out.println("\nDEMISSÃO DO FUNCIONÁRIO " + getNome() + " AGENDADA PARA: "+ getData_demissao() 
		+ "\nSOB JUSTIFICATIVA: " + getJustificativa());
		
	}

	@Override
	public String identificacao() {
		
		long idade = ChronoUnit.YEARS.between(this.getNascimento(), LocalDate.now());
		
		String info = "\nID: " + this.getId() + "\nNOME: "+ this.getNome() + "\nCPF: " + this.getCpf() 
		+ "\nENDERECO: " + this.getEndereco() + "\nSEXO: " + this.getSexo() + "\nDATA DE NASCIMENTO: " + this.getNascimento() 
		+ "\nIDADE: " + idade + " ANOS" + "\nDATA DE ADMISSÃO: " + this.data_admissao + "\nSALÁRIO: " + this.salario;
		
		// VERIFICAR SE O ATRIBUTO DATA_DEMISSAO ESTÁ VAZIO, SE SIM, O MÉTODO IRÁ RETORNAR AS INFORMAÇÕES DO FUNCIONÁRIO, BEM 
		// COMO, SEU STATUS (ATIVO). CASO CONTRÁRIO, SIGNIFICA QUE O MÉTODO DE SOLICITAR DEMISSÃO FOI INVOCADO E O VÍNCULO DESSE 
		// FUNCIONÁRIO SERÁ DESFEITO. LOGO, CABE RETORNAR QUE O MESMO NÃO ESTÁ MAIS ATIVO E OS DADOS REFERENTE A DATA DE DEMISSÃO 
		// E A JUSTIFICATIVA JUNTO A SUAS INFORMAÇÕES PESSOAIS.
		
		if(this.data_demissao != null) {
			
			return "\nESSA PESSOA É UM FUNCIONÁRIO\nSTATUS: INATIVO" + info + "\nDATA DE DEMISSÃO: " + this.data_demissao 
					+ "\nJUSTIFICATIVA: " + this.justificativa;
			
		} else {
			
			return "\nESSA PESSOA É UM FUNCIONÁRIO\nSTATUS: ATIVO" + info;
			
		}
	
	}

	@Override
	public double venderProduto(double valor_compra, double valor_recebido) {
	
		double comissao;
		
		// CASO O RETORNO DO MÉTODO COMISSAOPORVENDA SEJA VERDADEIRO, SIGNIFICA QUE O FUNCIONÁRIO ESTÁ APTO A RECEBER UMA COMISSÃO.
		// SENDO ASSIM, É NECESSÁRIO CALCULAR QUANTO SERÁ ESSE VALOR COM BASE NA PORCENTAGEM ESTABELECIDA NA INTERFACE VENDEDOR.
		
		if(comissaoPorVenda(valor_compra)) {
			
			comissao = valor_compra * Vendedor.porcentagem_comissao;
		
		}
		
		// SE O VALOR RECEBIDO PELA COMPRA FOR MAIOR OU EQUIVALENTE AO VALOR TOTAL DELA, SERÁ RETORNADO O TROCO.
		// CASO CONTRÁRIO, O SISTEMA DEVE RETORNAR QUE O VALOR É INSUFICIENTE.
		
		if(valor_recebido >= valor_compra) {
					
			return valor_recebido - valor_compra;
			
		} else {
			
			throw new IllegalArgumentException("O VALOR INFORMADO É INSUFICIENTE PARA EFETUAR O PAGAMENTO!!");
			
		}
	
	}

	// MÉTODO PARA VERIFICAR SE A COMPRA ESTÁ SUJEITA A OFERECER UMA COMISSÃO PARA O VENDEDOR...
	
	@Override
	public boolean comissaoPorVenda(double valor_compra) {

		if(valor_compra > 100.0) {
			
			return true;
			
		} else {
		
			return false;
		
		}
	
	}

	// OS PRÓXIMOS MÉTODOS SÃO IMPLEMENTAÇÕES DA INTERFACE GERENTE...
	
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
