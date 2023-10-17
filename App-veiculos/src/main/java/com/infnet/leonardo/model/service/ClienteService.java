package com.infnet.leonardo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnet.leonardo.clients.IClienteClient;
import com.infnet.leonardo.model.domain.Cliente;


@Service
public class ClienteService {

	@Autowired
	private IClienteClient clienteClient;

	public Collection<Cliente> obterLista(){

		return clienteClient.obterLista();
	}
	
	public void incluir(Cliente usuario) {
		
		clienteClient.incluir(usuario);
	}
	
	public void excluir(Integer id) {
		
		clienteClient.excluir(id);
	}
	
	public Cliente validar(String email, String senha) {
		
		return clienteClient.validar(email, senha);
	}

}