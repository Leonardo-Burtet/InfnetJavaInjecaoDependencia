package com.infnet.leonardo.model.domain;

import javax.persistence.Entity;

@Entity
public class Carro extends Veiculo {
	
	private Boolean tetoSolar;
	private int qtdePortas;
	private int qtdeAssentos;
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	public Carro(Integer id) {
		super(id);
	}

	public Carro(String nome, float valor, int codigo, boolean tetoSolar, int qtdePortas, int qtdeAssentos) {
		super(nome, valor, codigo);
		this.tetoSolar = tetoSolar;
		this.qtdePortas = qtdePortas;
		this.qtdeAssentos = qtdeAssentos;
	}

	public Carro(String string, Float valueOf, Integer valueOf2, Float valueOf3, Boolean valueOf4, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Carro [tetoSolar=" + tetoSolar + ", qtdePortas=" + qtdePortas + ", qtdeAssentos=" + qtdeAssentos + "]";
	}

	public Boolean getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(Boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public int getQtdeAssentos() {
		return qtdeAssentos;
	}

	public void setQtdeAssentos(int qtdeAssentos) {
		this.qtdeAssentos = qtdeAssentos;
	}
	
	
}
