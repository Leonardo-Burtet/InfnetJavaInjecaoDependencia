package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.service.VeiculoService;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;

	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {

		model.addAttribute("listaVeiculo", veiculoService.obterLista(cliente));
		
		return "veiculo/lista";
	}

	@GetMapping(value = "/veiculo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		veiculoService.excluir(id);

		return "redirect:/veiculo/lista";
	}
}