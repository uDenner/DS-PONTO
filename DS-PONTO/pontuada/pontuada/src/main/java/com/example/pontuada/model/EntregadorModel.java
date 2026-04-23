package com.example.pontuada.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_entregador")
public class EntregadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String placa;
    private String tipoVeiculo;
    private String endereco;

    public EntregadorModel(Long id, String nome, String email, String telefone, String placa, String tipoVeiculo, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
