package com.javascript_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ContatoController {

	@GetMapping("/contato")
	public String mostrarFormularioContato() {
		return "contato/index"; // Nome do template Thymeleaf que você vai renderizar
	}

	@PostMapping("/enviarContatos")
	public String enviarContatos(@RequestParam List<String> telefones, Model model) {
		model.addAttribute("telefones", telefones);
		return "contato/resultado"; // Exibe os telefones enviados para o template de resultado
	}
}
