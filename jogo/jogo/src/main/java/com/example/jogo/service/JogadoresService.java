package com.example.jogo.service;

import com.example.jogo.dto.JogadoresDTO;
import com.example.jogo.model.JogadoresModel;
import com.example.jogo.model.PersonagemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadoresService {
    @Autowired
    private JogadoresService repository;

    public JogadoresModel salvar(JogadoresDTO dto) {
        JogadoresModel p = new PersonagemModel();
        p.setUsuario(dto.usuario());
        p.setEmail(dto.email());
        return repository.save(p);
    }

    public PersonagemModel buscarPorId(Long id) {
        return repository.findByid(id)
                .orElseThrow(() -> new RuntimeException("Personagem não encontrado!"));
    }
}
