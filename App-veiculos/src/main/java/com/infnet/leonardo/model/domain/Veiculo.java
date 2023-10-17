package com.infnet.leonardo.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tveiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private float valor;
	private int codigo;
	private int qtoRodas;
	private String marca;
	@ManyToMany(mappedBy = "veiculos")
	private List<Reserva> reservas;
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	public Veiculo() {

	}
	
	public Veiculo(Integer id) {
		this.id = id;
	}
	
	public Veiculo(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
		
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", qtoRodas="
				+ qtoRodas + ", marca=" + marca + ", reservas=" + reservas + ", cliente=" + cliente + "]";
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Cliente getUsuario() {
		return cliente;
	}

	public void setUsuario(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQtoRodas() {
		return qtoRodas;
	}

	public void setQtoRodas(int qtoRodas) {
		this.qtoRodas = qtoRodas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
