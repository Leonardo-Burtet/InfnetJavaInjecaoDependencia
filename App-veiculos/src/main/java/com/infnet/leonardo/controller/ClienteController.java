package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "/valida")
	public String validar(Model model, @RequestParam String email, @RequestParam String senha) {

		Cliente user = clienteService.validar(email, senha);
		
		if(user != null) {
			
			model.addAttribute("user", user);

			return "home";
		}
		return "redirect:/login";		
	}	
	
	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {

		model.addAttribute("listaUsuario", clienteService.obterLista());
		
		return "usuario/lista";
	}

	@GetMapping(value = "/usuario/cadastro")
	public String telaCadastro() {

		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Cliente cliente) {

		clienteService.incluir(cliente);
		
		return "redirect:/";
	}

	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		clienteService.excluir(id);

		return "redirect:/usuario/lista";
	}
}