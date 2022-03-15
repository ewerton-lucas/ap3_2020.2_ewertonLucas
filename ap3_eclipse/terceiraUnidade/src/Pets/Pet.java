package Pets;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pet {
	
	private int id;
	private int id_cliente;
	private String nome;
	private LocalDate nascimento;
	private String sexo;
	private String tipo;
	private String raca;
	private double peso;
	private String porte;
	
	public Pet(int id, int id_cliente, String nome, LocalDate nascimento, String sexo, String tipo, String raca, double peso) {
		super();
		
		this.id = id;
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.tipo = tipo;
		this.raca = raca;
		this.peso = peso;		
		this.porte = TipoAnimal.identificarPorte(peso, tipo);
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String identificacao() {
		
		String identificacao_pet = "\nID DO PET: " + this.id + "		ID DO CLIENTE: " + this.id_cliente 
		+ "\nNOME DO PET: " + this.nome + "		SEXO: " + this.sexo + "\nDATA DE NASCIMENTO: " + this.nascimento;
		
		long idade_anos = ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
		
		if (idade_anos < 1) {
			
			identificacao_pet += "		IDADE: MENOS DE 1 ANO" + "\nTIPO: " + this.tipo + "		RA�A: " 
			+ this.raca + "\nPESO: " + this.peso + " Kg" + "		PORTE: " + porte;
			
		} else {
			
			identificacao_pet += "		IDADE: " + idade_anos  + " ANO(S)" + "\nTIPO: " + this.tipo + "		RA�A: " 
			+ this.raca + "\nPESO: " + this.peso + " Kg" + "		PORTE: " + porte;
			
		}
		
		return identificacao_pet;
		
	}
	
	public void atualizarPeso(double novo_peso) {
	
		setPeso(novo_peso);

		this.porte = TipoAnimal.identificarPorte(novo_peso, this.tipo);
		
		System.out.println("\nPESO DO PET " + getNome() + " ATUALIZADO COM SUCESSO!");
		
	}

}
