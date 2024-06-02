package com.example.atividade14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.atividade14.model.Projeto;
import com.example.atividade14.repository.ProjetoRepository;
import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findByDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}
