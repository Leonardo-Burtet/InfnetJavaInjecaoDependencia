package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Van;
import com.infnet.leonardo.model.repository.VanRepository;

@Service
public class VanService {
	
	@Autowired
	private VanRepository vanRepository;

	public Collection<Van> obterLista(){
		
		return (Collection<Van>) vanRepository.findAll();
	}
	
	public Collection<Van> obterLista(Cliente cliente){
		
		return (Collection<Van>) vanRepository.obterLista(cliente.getId());
	}

	public void incluir(Van van) {

		vanRepository.save(van);
	}
	
	public void excluir(Integer id) {

		vanRepository.deleteById(id);
	}	
}