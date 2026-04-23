package com.example.pontuada.controller;

import com.example.pontuada.model.ClienteModel;
import com.example.pontuada.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> listar() { return service.listar(); }

    @PostMapping
    public ClienteModel criar(@RequestBody ClienteModel cliente) { return service.salvar(cliente); }
}