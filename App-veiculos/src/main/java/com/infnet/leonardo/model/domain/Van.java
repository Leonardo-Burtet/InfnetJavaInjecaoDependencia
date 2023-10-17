package com.infnet.leonardo.model.domain;

import javax.persistence.Entity;

@Entity
public class Van extends Veiculo {

	private String tipo;
	private Boolean passeio;

	public Van() {
		// TODO Auto-generated constructor stub
	}

	public Van(Integer id) {
		super(id);
	}

	public Van(String nome, float valor, int codigo, boolean passeio, String tipo) {
		super(nome, valor, codigo);
		this.tipo = tipo;
		this.passeio = passeio;
	}

	@Override
	public String toString() {
		return "Van [tipo=" + tipo + ", passeio=" + passeio + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getPasseio() {
		return passeio;
	}

	public void setPasseio(Boolean passeio) {
		this.passeio = passeio;
	}

}
