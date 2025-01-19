package com.javascript_thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javascript_thymeleaf.models.Produto;

@Controller
public class ProdutoController {

	   @GetMapping("/produtos")
	    public String listarProdutos(Model model) {
	        List<Produto> produtos = new ArrayList<>();
	        produtos.add(new Produto(1L, "Produto 1", 99.99));
	        produtos.add(new Produto(2L, "Produto 2", 49.99));
	        produtos.add(new Produto(3L, "Produto 3", 19.99));

	        model.addAttribute("produtos", produtos);
	        return "produto/index"; // Nome do template Thymeleaf
	    }
}
