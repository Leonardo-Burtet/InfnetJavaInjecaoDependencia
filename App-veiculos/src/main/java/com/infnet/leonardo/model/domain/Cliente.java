package com.infnet.leonardo.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tcliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany
	@JoinColumn(name = "idCliente")
	private List<Solicitante> solicitantes;
	@OneToMany
	@JoinColumn(name = "idCliente")
	private List<Reserva> reservas;
	@OneToMany
	@JoinColumn(name = "idCliente")
	private List<Veiculo> veiculos;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idendereco")
	private Endereco endereco;
	
	public Cliente() {

	}
	
	public Cliente(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {

		return String.format("%d - %s - %s - %s", id, nome, email, senha);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Solicitante> getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(List<Solicitante> solicitantes) {
		this.solicitantes = solicitantes;
	}

	public List<Reserva> getPedidos() {
		return reservas;
	}

	public void setPedidos(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Veiculo> getProdutos() {
		return veiculos;
	}

	public void setProdutos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
