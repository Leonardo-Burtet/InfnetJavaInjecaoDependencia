package br.edu.infnet.apiusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiusuario.model.domain.Cliente;
import br.edu.infnet.apiusuario.model.service.ClienteService;

@RestController
@RequestMapping("/api/usuario")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente) {
		clienteService.incluir(cliente);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		clienteService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Cliente> obterLista(){

		return clienteService.obterLista();
	}
	
	@PostMapping(value = "/validar")
	public Cliente validar(@RequestParam String email, @RequestParam String senha) {

		return clienteService.validar(email, senha);
	}
}
