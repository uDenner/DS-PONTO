package com.example.jogo.repository;

import com.example.jogo.model.CenarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenarioRepository extends JpaRepository<CenarioModel, Long> {
}
