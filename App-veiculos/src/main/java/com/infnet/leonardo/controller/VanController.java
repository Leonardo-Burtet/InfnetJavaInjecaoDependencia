package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Van;
import com.infnet.leonardo.model.service.VanService;

@Controller
public class VanController {

	@Autowired 
	private VanService vanService;

	@GetMapping(value = "/van/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {

		model.addAttribute("listaVan", vanService.obterLista(cliente));
		
		return "van/lista";
	}

	@GetMapping(value = "/van/cadastro")
	public String telaCadastro() {

		return "van/cadastro";
	}

	@PostMapping(value = "/van/incluir")
	public String incluir(Van van, @SessionAttribute("user") Cliente cliente) {
		
		van.setUsuario(cliente);
		
		vanService.incluir(van);
		
		return "redirect:/van/lista";
	}

	@GetMapping(value = "/van/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		vanService.excluir(id);

		return "redirect:/van/lista";
	}
}