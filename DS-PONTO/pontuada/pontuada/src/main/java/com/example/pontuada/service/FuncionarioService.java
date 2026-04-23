package com.example.pontuada.service;

import com.example.pontuada.model.FuncionarioModel;
import com.example.pontuada.repository.PontuadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private PontuadaRepository.FuncionarioRepository repository;

    public List<FuncionarioModel> listar() {
        return repository.findAll(); }

    public FuncionarioModel salvar(FuncionarioModel produto) {
        return repository.save(produto); }

    public void deletar(Long id) { repository.deleteById(id); }
}