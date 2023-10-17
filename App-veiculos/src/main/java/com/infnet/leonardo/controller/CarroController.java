package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Carro;
import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.service.CarroService;

@Controller
public class CarroController {
	
	@Autowired
	private CarroService carroService;

	@GetMapping(value = "/carro/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {

		model.addAttribute("listaCarro", carroService.obterLista(cliente));
		
		return "carro/lista";
	}

	@GetMapping(value = "/carro/cadastro")
	public String telaCadastro() {

		return "carro/cadastro";
	}

	@PostMapping(value = "/carro/incluir")
	public String incluir(Carro carro, @SessionAttribute("user") Cliente cliente) {
		
		carro.setUsuario(cliente);
		
		carroService.incluir(carro);
		
		return "redirect:/carro/lista";
	}
	
	@GetMapping(value = "/carro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		carroService.excluir(id);

		return "redirect:/carro/lista";
	}
}