package com.example.pontuada.service;

import com.example.pontuada.model.ProdutoModel;
import com.example.pontuada.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> listar() {
        return repository.findAll(); }

    public ProdutoModel salvar(ProdutoModel produto) {
        return repository.save(produto); }

    public void deletar(Long id) { repository.deleteById(id); }
}