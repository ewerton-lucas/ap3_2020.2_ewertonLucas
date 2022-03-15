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
		
		// AP�S O USU�RIO PASSAR OS PAR�METROS AQUI EXIGIDOS, ESTES SER�O INSERIDOS EM SEUS RESPECTIVOS ENDERE�OS...
		
		setData_demissao(data);
		setJustificativa(justificativa);
		
		// LOGO, CABE IMPRIMIR UMA MENSAGEM CONFIRMANDO O EXITO DESSA OPERA��O...
		
		System.out.println("\nDEMISS�O DO FUNCION�RIO " + getNome() + " AGENDADA PARA: "+ getData_demissao() 
		+ "\nSOB JUSTIFICATIVA: " + getJustificativa());
		
		// POR MAIS QUE N�O TENHA SIDO SOLICITADO PELA PROFESSORA, ACHEI CONVENIENTE IMPRIMIR TODOS OS DADOS DO FUNCION�RIO
		// JUNTO AS INFORMA��ES ANTERIORES. A MOTIVA��O DISSO, ERA APENAS EXIBIR OS DADOS REFERENTE A DATA DE ADMISS�O E
		// O SAL�RIO QUE ANTES N�O HAVIAM SIDO MOSTRADOS...
		
		System.out.println("\n==== DADOS PESSOAIS ====\n" + super.identificacao() + "\nDATA DE ADIMISS�O: " 
		+ this.data_admissao + "\nSAL�RIO: R$ " + this.salario);
		
	}

}
