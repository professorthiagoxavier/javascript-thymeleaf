package com.javascript_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javascript_thymeleaf.models.Produto;

@Controller
public class ProdutoController {

    @GetMapping("/produto")
    public String exibirProduto(Model model) {
        // Criando um produto fictício
        Produto produto = new Produto("Produto Exemplo", "Descrição do Produto Exemplo");

        // Adicionando o objeto produto ao modelo
        model.addAttribute("produto", produto);

        // Retornando o nome do template Thymeleaf
        return "produto/index"; // O arquivo HTML será produto.html
    }
}
