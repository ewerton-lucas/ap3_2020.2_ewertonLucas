package Pessoas;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
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
		
		// APÓS O USUÁRIO PASSAR OS PARÂMETROS AQUI EXIGIDOS, ESTES SERÃO INSERIDOS EM SEUS RESPECTIVOS ENDEREÇOS...
		
		setData_demissao(data);
		setJustificativa(justificativa);
		
		// LOGO, CABE IMPRIMIR UMA MENSAGEM CONFIRMANDO O EXITO DESSA OPERAÇÃO...
		
		System.out.println("\nDEMISSÃO DO FUNCIONÁRIO " + getNome() + " AGENDADA PARA: "+ getData_demissao() 
		+ "\nSOB JUSTIFICATIVA: " + getJustificativa());
		
		// POR MAIS QUE NÃO TENHA SIDO SOLICITADO PELA PROFESSORA, ACHEI CONVENIENTE IMPRIMIR TODOS OS DADOS DO FUNCIONÁRIO
		// JUNTO AS INFORMAÇÕES ANTERIORES. A MOTIVAÇÃO DISSO, ERA APENAS EXIBIR OS DADOS REFERENTE A DATA DE ADMISSÃO E
		// O SALÁRIO QUE ANTES NÃO HAVIAM SIDO MOSTRADOS...
		
		System.out.println("\n==== DADOS PESSOAIS ====\n" + super.identificacao() + "\nDATA DE ADIMISSÃO: " 
		+ this.data_admissao + "\nSALÁRIO: R$ " + this.salario);
		
	}

}
