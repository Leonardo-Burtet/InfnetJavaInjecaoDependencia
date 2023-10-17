package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Cliente;

@Controller
public class SolicitanteController {
	
	@Autowired
	private com.infnet.leonardo.model.service.SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {
		model.addAttribute("listagem", solicitanteService.obterLista(cliente));

		return "solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(com.infnet.leonardo.model.domain.Solicitante solicitante, @SessionAttribute("user") Cliente cliente) {
		
		solicitante.setUsuario(cliente);
		
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		solicitanteService.excluir(id);
		
		return "redirect:/solicitante/lista";
	}
}