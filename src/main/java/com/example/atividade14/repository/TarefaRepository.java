package com.example.atividade14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.atividade14.model.Tarefa;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByStatus(String status);
}
