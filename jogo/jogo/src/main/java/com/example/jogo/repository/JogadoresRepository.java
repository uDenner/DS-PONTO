package com.example.jogo.repository;

import com.example.jogo.model.JogadoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadoresRepository extends JpaRepository<JogadoresModel, Long> {
    Optional<JogadoresModel> findbyEmail(String email);
}
