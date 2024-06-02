package com.example.atividade14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.atividade14.model.Recurso;
import java.util.List;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByNome(String nome);
}
