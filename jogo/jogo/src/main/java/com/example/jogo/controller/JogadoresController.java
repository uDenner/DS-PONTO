package com.example.jogo.controller;

import com.example.jogo.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogadores")
public class JogadoresController {
    @Autowired
    private PersonagemService service;

    @PostMapping
    public
}
