package com.infnet.leonardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Reserva;
import com.infnet.leonardo.model.service.ReservaService;
import com.infnet.leonardo.model.service.VeiculoService;


@Controller
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	@Autowired
	private com.infnet.leonardo.model.service.SolicitanteService solicitanteService;
	@Autowired
	private VeiculoService veiculoService;

	@GetMapping(value = "/reserva")
	public String telaCadastro(Model model, @SessionAttribute("user") Cliente cliente) {

		model.addAttribute("solicitantes", solicitanteService.obterLista(cliente));

		model.addAttribute("veiculos", veiculoService.obterLista(cliente));
		
		return "reserva/cadastro";
	}
	
	@GetMapping(value = "/reserva/lista")
	public String telaLista(Model model, @SessionAttribute("user") Cliente cliente) {
		model.addAttribute("listagem", reservaService.obterLista(cliente));

		return "pedido/lista";
	}
	
	@PostMapping(value = "/reserva/incluir")
	public String incluir(Reserva reserva, @SessionAttribute("user") Cliente cliente) {
		
		reserva.setUsuario(cliente);
		
		reservaService.incluir(reserva);
		
		return "redirect:/reserva/lista";
	}

	@GetMapping(value = "/reserva/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		reservaService.excluir(id);
		
		return "redirect:/reserva/lista";
	}
}