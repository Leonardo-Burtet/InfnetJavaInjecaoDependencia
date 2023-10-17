package com.infnet.leonardo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.infnet.leonardo.model.domain.Cliente;

@FeignClient(url = "localhost:8081/api/usuario", name = "usuarioClient")
public interface IClienteClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Cliente> obterLista();
	
	@PostMapping(value = "/validar")
	public Cliente validar(@RequestParam String email, @RequestParam String senha);
}