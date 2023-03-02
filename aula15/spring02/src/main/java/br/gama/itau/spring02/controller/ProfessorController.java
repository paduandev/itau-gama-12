package br.gama.itau.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.itau.spring02.model.Professor;
import br.gama.itau.spring02.repository.ProfessorRepo;

@RestController // indica que esta classe é um controller do tipo REST
public class ProfessorController {
    
    @Autowired
    private ProfessorRepo repo;

    @GetMapping
    public Professor getProfessor() {
        return repo.findById(1L).get();
    }
}
