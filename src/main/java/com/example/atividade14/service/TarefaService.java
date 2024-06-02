package com.example.atividade14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.atividade14.model.Tarefa;
import com.example.atividade14.repository.TarefaRepository;
import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findByStatus(String status) {
        return tarefaRepository.findByStatus(status);
    }
}
