package com.javascript_thymeleaf.models;
import javax.validation.constraints.NotEmpty;

public class Produto {
	 @NotEmpty(message = "O nome do produto é obrigatório!")
	private String nome;
    private String descricao;
    private double preco;

    // Construtores, getters e setters

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

