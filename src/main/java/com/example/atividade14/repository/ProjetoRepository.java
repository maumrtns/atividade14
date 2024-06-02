package com.example.atividade14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.atividade14.model.Projeto;
import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescricao(String descricao);
}
