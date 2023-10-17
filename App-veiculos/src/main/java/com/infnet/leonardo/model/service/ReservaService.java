package com.infnet.leonardo.model.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Reserva;
import com.infnet.leonardo.model.repository.ReservaRepository;


@Service
public class ReservaService {
	
	@Autowired
	private ReservaRepository reservaRepository;

	public Collection<Reserva> obterLista(){
		
		return (Collection<Reserva>) reservaRepository.findAll();
	}
	
	public Collection<Reserva> obterLista(Cliente cliente){
		
		List<Reserva> lista = reservaRepository.obterLista(cliente.getId());
		
		if(lista.isEmpty()) {
			return Collections.emptyList();
		}
		
		return lista;
	}

	public void incluir(Reserva reserva) {

		reservaRepository.save(reserva);
	}
	
	public void excluir(Integer id) {

		reservaRepository.deleteById(id);
	}	
}