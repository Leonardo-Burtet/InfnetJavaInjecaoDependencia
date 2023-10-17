package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Moto;
import com.infnet.leonardo.model.repository.MotoRepository;

@Service
public class MotoService {
	
	@Autowired
	private MotoRepository motoRepository;

	public Collection<Moto> obterLista(){
		
		return (Collection<Moto>) motoRepository.findAll();
	}
	
	public Collection<Moto> obterLista(Cliente cliente){
		
		return (Collection<Moto>) motoRepository.obterLista(cliente.getId());
	}

	public void incluir(Moto moto) {

		motoRepository.save(moto);
	}
	
	public void excluir(Integer id) {

		motoRepository.deleteById(id);
	}	
}