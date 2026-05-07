package com.example.jogo.service;

import com.example.jogo.controller.PersonagemController;
import com.example.jogo.dto.PersonagemDTO;
import com.example.jogo.model.PersonagemModel;
import com.example.jogo.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    public PersonagemModel salvar(PersonagemDTO dto) {
        PersonagemModel p = new PersonagemModel();
        p.setNome(dto.nome());
        p.setClasse(dto.classe());
        p.setNivel(dto.nivel());
        return repository.save(p);
    }

    public PersonagemModel buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personagem não encontrado!"));
    }
}
