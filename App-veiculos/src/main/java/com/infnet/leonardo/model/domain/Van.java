package com.infnet.leonardo.model.domain;

import javax.persistence.Entity;

@Entity
public class Van extends Veiculo{

	
	public Van() {
		// TODO Auto-generated constructor stub
	}
	
	public Van(Integer id) {
		super(id);
	}

	public Van(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	public Van(String string, Float valueOf, Integer valueOf2, Float valueOf3, Boolean valueOf4, String string2) {
		// TODO Auto-generated constructor stub
	}

	

	
}
