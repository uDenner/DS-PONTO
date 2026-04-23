package com.example.pontuada.controller;

import com.example.pontuada.model.ProdutoModel;
import com.example.pontuada.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel> getAll() { return service.listar(); }

    @PostMapping
    public ProdutoModel create(@RequestBody ProdutoModel produto) { return service.salvar(produto); }
}