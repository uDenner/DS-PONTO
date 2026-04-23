package com.example.pontuada.controller;

import com.example.pontuada.model.FuncionarioModel;
import com.example.pontuada.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel> listar() { return service.listar(); }

    @PostMapping
    public FuncionarioModel criar(@RequestBody FuncionarioModel funcionario) { return service.salvar(funcionario); }
}
