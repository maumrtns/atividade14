package com.example.atividade14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.atividade14.model.Projeto;
import com.example.atividade14.service.ProjetoService;
import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/descricao/{descricao}")
    public List<Projeto> findByDescricao(@PathVariable String descricao) {
        return projetoService.findByDescricao(descricao);
    }
}
