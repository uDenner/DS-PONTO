package com.example.pontuada.controller;

import com.example.pontuada.model.EntregadorModel;
import com.example.pontuada.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {
    @Autowired
    private EntregadorService service;

    @GetMapping
    public List<EntregadorModel> listar() { return service.listar(); }

    @PostMapping
    public EntregadorModel criar(@RequestBody EntregadorModel entregador) { return service.salvar(entregador); }
}