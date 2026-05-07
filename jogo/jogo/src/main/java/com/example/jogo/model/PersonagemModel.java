package com.example.jogo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagem")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String nome;
    @Column
    private String classe;
    @Column
    private Integer nivel;

    public PersonagemModel() {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
