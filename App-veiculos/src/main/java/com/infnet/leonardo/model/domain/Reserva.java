package com.infnet.leonardo.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "treserva")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Veiculo> veiculos;
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	public Reserva() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		web = true;
	}

	public Reserva(Solicitante solicitante) {
		this();
		this.solicitante = solicitante;
	}

	public Reserva(String descricao, Solicitante solicitante, List<Veiculo> veiculos, Cliente cliente) {
		this();
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.veiculos = veiculos;
		this.cliente = cliente;
	}
	
	

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", descricao=" + descricao + ", data=" + data + ", web=" + web + ", solicitante="
				+ solicitante + ", veiculos=" + veiculos + ", clientes=" + cliente + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Veiculo> getProdutos() {
		return veiculos;
	}

	public void setProdutos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Cliente getUsuario() {
		return cliente;
	}

	public void setUsuario(Cliente cliente) {
		this.cliente = cliente;
	}
}