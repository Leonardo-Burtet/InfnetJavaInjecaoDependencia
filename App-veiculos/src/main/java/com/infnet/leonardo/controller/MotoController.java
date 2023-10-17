package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Moto;
import com.infnet.leonardo.model.service.MotoService;

@Controller
public class MotoController {
	
	@Autowired
	private MotoService motoService;

	@GetMapping(value = "/moto/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {

		model.addAttribute("listaMoto", motoService.obterLista(cliente));
		
		return "moto/lista";
	}

	@GetMapping(value = "/moto/cadastro")
	public String telaCadastro() {

		return "moto/cadastro";
	}

	@PostMapping(value = "/moto/incluir")
	public String incluir(Moto moto, @SessionAttribute("user") Cliente cliente) {
		
		moto.setUsuario(cliente);
		
		motoService.incluir(moto);
		
		return "redirect:/moto/lista";
	}

	@GetMapping(value = "/moto/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		motoService.excluir(id);

		return "redirect:/moto/lista";
	}
}