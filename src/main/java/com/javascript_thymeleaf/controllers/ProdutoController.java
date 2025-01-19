package com.javascript_thymeleaf.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @PostMapping("produto/salvar")
    public String salvarProduto(@Valid @ModelAttribute Produto produto, BindingResult bindingResult, Model model) {
    
        System.out.println(produto.getNome());
        
        // Lógica para salvar o produto, pode ser um banco de dados ou outro processamento
        
        model.addAttribute("mensagemSucesso", "Produto salvo com sucesso!");
        return "redirect:/produto-sucesso";// Pode redirecionar ou exibir uma mensagem de sucesso
    }
    
    @GetMapping("/produto-sucesso")
    public String exibirPaginaSucesso() {
        // Retorna o template de sucesso
        return "/produto/produto-sucesso"; // Nome do template Thymeleaf para a página de sucesso
    }
}
