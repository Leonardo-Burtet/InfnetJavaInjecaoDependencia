package br.edu.infnet.apiusuario.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiusuario.model.domain.Cliente;
import br.edu.infnet.apiusuario.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

	public List<Cliente> obterLista(){

		return (List<Cliente>) clienteRepository.findAll();
	}

	public Cliente validar(String email, String senha) {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		
		if(cliente != null && senha.equals(cliente.getSenha())) {
			return cliente;
		}
		
		return null;
	}
}