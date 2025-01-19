package com.javascript_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javascript_thymeleaf.models.Produto;

@Controller
public class ProdutoController {

	private Produto produto = new Produto("Produto Exemplo", "Descrição do Produto Exemplo", 100.0);

	@GetMapping("/produto")
	public String exibirProduto(Model model) {

		// Adicionando o objeto produto ao modelo
		model.addAttribute("produto", produto);

		// Retornando o nome do template Thymeleaf
		return "produto/index"; // O arquivo HTML será produto.html
	}
	
    // Endpoint para atualizar o preço do produto via AJAX
    @GetMapping("/atualizarPreco")
    @ResponseBody
    public Produto atualizarPreco() {
        // Lógica para alterar o preço (exemplo, adicionando 10% ao preço atual)
        produto.setPreco(produto.getPreco() * 1.10);

        // Retorna o produto com o novo preço no formato JSON
        return produto;
    }
}
