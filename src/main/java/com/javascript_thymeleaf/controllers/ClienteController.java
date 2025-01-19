package com.javascript_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("/consultar-cep")
	public String consultarCep() {
		
		return "cliente/cep"; // Nome do template Thymeleaf que você vai renderizar
	}
}
