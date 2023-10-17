package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Veiculo;
import com.infnet.leonardo.model.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public Collection<Veiculo> obterLista(){
		
		return (Collection<Veiculo>) veiculoRepository.findAll();
	}
	
	public Collection<Veiculo> obterLista(Cliente cliente){
		
		return (Collection<Veiculo>) veiculoRepository.obterLista(cliente.getId());
	}

	public void incluir(Veiculo veiculo) {

		veiculoRepository.save(veiculo);
	}
	
	public void excluir(Integer id) {

		veiculoRepository.deleteById(id);
	}	
}