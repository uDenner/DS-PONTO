package com.example.pontuada.service;

import com.example.pontuada.model.ClienteModel;
import com.example.pontuada.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> listar() { return repository.findAll(); }

    public ClienteModel salvar(ClienteModel cliente) {

        return repository.save(cliente);
    }

    public void deletar(Long id) { repository.deleteById(id); }
}