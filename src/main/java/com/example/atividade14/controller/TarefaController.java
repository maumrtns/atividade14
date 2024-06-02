package com.example.atividade14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.atividade14.model.Tarefa;
import com.example.atividade14.service.TarefaService;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/status/{status}")
    public List<Tarefa> findByStatus(@PathVariable String status) {
        return tarefaService.findByStatus(status);
    }
}
