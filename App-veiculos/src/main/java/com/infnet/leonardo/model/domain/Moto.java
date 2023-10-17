package com.infnet.leonardo.model.domain;

import javax.persistence.Entity;

@Entity
public class Moto extends Veiculo{

	private Boolean tetoSolar;
	private int qtdeCilindrada;
	private String categoria;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}
	
	public Moto(Integer id) {
		super(id);
	}

	public Moto(String nome, float valor, int codigo, int qtdeCilindrada, String categoria) {
		super(nome, valor, codigo);
		this.setQtdeCilindrada(qtdeCilindrada);
		this.setCategoria(categoria);
	}


	public Moto(String string, Float valueOf, Integer valueOf2, Boolean valueOf3, Float valueOf4, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [tetoSolar=" + tetoSolar + ", qtdeCilindrada=" + qtdeCilindrada + ", categoria=" + categoria + "]";
	}

	public int getQtdeCilindrada() {
		return qtdeCilindrada;
	}

	public void setQtdeCilindrada(int qtdeCilindrada) {
		this.qtdeCilindrada = qtdeCilindrada;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
