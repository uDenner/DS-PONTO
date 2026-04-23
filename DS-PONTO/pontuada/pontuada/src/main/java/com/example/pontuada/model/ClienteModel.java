package com.example.pontuada.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_pontuada")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String formaPagamento;
    private String endereco;

    public ClienteModel(Long id, String nome, String email, String telefone, String formaPagamento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.formaPagamento = formaPagamento;
        this.endereco = endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
