package com.example.jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cenario")
public class CenarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String bioma;

    @Column
    private String clima;

    public CenarioModel(Long id, String bioma, String clima) {
        this.id = id;
        this.bioma = bioma;
        this.clima = clima;
    }

    public Long getId() {
        return id;
    }

    public String getBioma() {
        return bioma;
    }

    public String getClima() {
        return clima;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
