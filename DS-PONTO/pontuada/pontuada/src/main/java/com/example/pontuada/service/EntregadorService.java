package com.example.pontuada.service;

import com.example.pontuada.model.EntregadorModel;
import com.example.pontuada.repository.PontuadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregadorService {
    @Autowired
    private PontuadaRepository.EntregadorRepository repository;

    public List<EntregadorModel> listar() { return repository.findAll(); }

    public EntregadorModel salvar(EntregadorModel produto) { return repository.save(produto); }

    public void deletar(Long id) { repository.deleteById(id); }
}