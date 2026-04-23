package com.example.pontuada.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_pontuada")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private String nome;
    private String lote;
    private String validade;
    private String categoria;
    private int quantidade;

    public ProdutoModel(Long id, String nome, String lote, String validade, String categoria, int quantidade) {
        Id = id;
        this.nome = nome;
        this.lote = lote;
        this.validade = validade;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
