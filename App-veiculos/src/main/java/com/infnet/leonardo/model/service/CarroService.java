package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Carro;
import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;

	public Collection<Carro> obterLista(){
		
		return (Collection<Carro>) carroRepository.findAll();
	}
	
	public Collection<Carro> obterLista(Cliente cliente){
		
		return (Collection<Carro>) carroRepository.obterLista(cliente.getId());
	}

	public void incluir(Carro carro) {

		carroRepository.save(carro);
	}
	
	public void excluir(Integer id) {

		carroRepository.deleteById(id);
	}	
}