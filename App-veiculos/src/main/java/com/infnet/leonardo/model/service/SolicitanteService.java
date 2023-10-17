package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Solicitante;
import com.infnet.leonardo.model.repository.SolicitanteRepository;


@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public Collection<Solicitante> obterLista(){
		
		return (Collection<Solicitante>) solicitanteRepository.findAll();
	}
	
	public Collection<Solicitante> obterLista(Cliente cliente){
		
		return (Collection<Solicitante>) solicitanteRepository.obterLista(cliente.getId());
	}

	public void incluir(Solicitante solicitante) {

		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {

		solicitanteRepository.deleteById(id);
	}	
}