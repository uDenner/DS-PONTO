package com.example.jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_jogadores")
public class JogadoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private String usuario;

    @Column
    private String email;

    public JogadoresModel(Long id, String usuario, String email) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
