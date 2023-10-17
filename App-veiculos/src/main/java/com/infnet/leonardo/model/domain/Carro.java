package com.infnet.leonardo.model.domain;

import javax.persistence.Entity;

@Entity
public class Carro extends Veiculo {

	private int qtdePortas;
	private int qtdeAssentos;

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public Carro(Integer id) {
		super(id);
	}

	public Carro(String nome, float valor, int codigo, int qtdePortas, int qtdeAssentos) {
		super(nome, valor, codigo);
		this.qtdePortas = qtdePortas;
		this.qtdeAssentos = qtdeAssentos;
	}

	@Override
	public String toString() {
		return "Carro [qtdePortas=" + qtdePortas + ", qtdeAssentos=" + qtdeAssentos + "]";
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
