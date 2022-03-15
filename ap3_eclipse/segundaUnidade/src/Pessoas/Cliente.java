package Pessoas;

import java.time.LocalDate;

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
	
	// NO MOMENTO EM QUE O CLIENTE SOLICITAR A MODIFICA��O DO PET, ELE SER� DIRECIONADO AO M�TODO DE EDITAR PET
	// DA CLASSE DEMOPETS E PODER� MODIFICAR O PESO DESTE.
	
	public void setPet(Pet pet) {
		
		this.pet = DemoPets.editarPet(pet);
	}
	
	public String identificarPet() {
		
		return this.getPet().identificacao();
		
	}

}
