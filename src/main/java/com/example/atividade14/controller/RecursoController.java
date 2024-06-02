package com.example.atividade14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.atividade14.model.Recurso;
import com.example.atividade14.service.RecursoService;
import java.util.List;

@RestController
@RequestMapping("/recursos")
public class RecursoController {
    @Autowired
    private RecursoService recursoService;

    @GetMapping("/nome/{nome}")
    public List<Recurso> findByNome(@PathVariable String nome) {
        return recursoService.findByNome(nome);
    }
}
