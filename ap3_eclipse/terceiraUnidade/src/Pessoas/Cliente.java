package Pessoas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import Pets.*;

public class Cliente extends Pessoa{
	
	private Pet pet;

	public Cliente(String cpf, int id, String nome, String endereco, LocalDate nascimento, String sexo) {
		super(cpf, id, nome, endereco, nascimento, sexo);

		this.pet = DemoPets.criarPet();
		
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public void setPet(Pet pet) {
		
		this.pet = DemoPets.editarPet(pet);
	}
	
	public String identificarPet() {
		
		return this.getPet().identificacao();
		
	}

	@Override
	public String identificacao() {

		long idade = ChronoUnit.YEARS.between(this.getNascimento(), LocalDate.now());
		
		String info = "\nESSA PESSOA É UM CLIENTE" + "\nID: " + this.getId() + "\nNOME: "+ this.getNome() + "\nCPF: "+ this.getCpf() 
		+ "\nENDERECO: " + this.getEndereco() + "\nSEXO: " + this.getSexo() + "\nDATA DE NASCIMENTO: " + this.getNascimento() 
		+ "\nIDADE: " + idade + " ANOS" + "\n==== DADOS DO SEU PET ====\n" + this.identificarPet();
		
		return info;
	}

}
