package com.example.pontuada.repository;

import com.example.pontuada.model.ClienteModel;
import com.example.pontuada.model.EntregadorModel;
import com.example.pontuada.model.FuncionarioModel;
import com.example.pontuada.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PontuadaRepository {
    @Repository public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {}
    @Repository public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {}
    @Repository public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {}
    @Repository public interface EntregadorRepository extends JpaRepository<EntregadorModel, Long> {}
}
