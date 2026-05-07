package com.example.jogo.repository;

import com.example.jogo.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
    Optional<PersonagemModel> findbyEmail(String email);
}
