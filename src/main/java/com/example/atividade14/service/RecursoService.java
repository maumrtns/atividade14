package com.example.atividade14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.atividade14.model.Recurso;
import com.example.atividade14.repository.RecursoRepository;
import java.util.List;

@Service
public class RecursoService {
    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> findByNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}
