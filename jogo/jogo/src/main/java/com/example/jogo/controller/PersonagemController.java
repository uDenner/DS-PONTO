package com.example.jogo.controller;

import com.example.jogo.dto.PersonagemDTO;
import com.example.jogo.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
private PersonagemService service;

    @PostMapping
    public ResponseEntity<Personagem> criar(@RequestBody PersonagemDTO dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personagem> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

}
