package br.gama.itau.spring02.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.itau.spring02.model.Professor;
import br.gama.itau.spring02.repository.ProfessorRepo;

@RestController // indica que esta classe é um controller do tipo REST
@RequestMapping("/professor") // mapeamento desta classe
public class ProfessorController {
    
    // gera a implementação da classe e um objeto
    @Autowired
    private ProfessorRepo repo;

    // indica que este método é chamada por meio d eum Get
    // {} indica que tem uma variável na URL
    @GetMapping("/{codigo}")
    public ResponseEntity<Professor> getProfessor(@PathVariable long codigo) {
        // O findById retorna um Optional, que pode ter ou não um Professor (dado)
        // findById = procure por meio do Id (Primay KEY)
        Optional<Professor> optional = repo.findById(codigo);

        if(optional.isPresent()) { // verifica se o professor foi encontrado (Existe no Optional)
            Professor professor = optional.get(); // O Get retorna o objeto Professor
            return ResponseEntity.ok(professor); // ok = 200
        }
        return ResponseEntity.notFound().build(); // não encontrei o professor ( notFound = 404 )
    }

    @GetMapping
    public ResponseEntity<List<Professor>> getAllProfessor() {
        // Busca todos os professores no BD
        List<Professor> professores = (List<Professor>) repo.findAll();

        if(professores != null) { // se encontrou algum professor
            return ResponseEntity.ok(professores);
        }
        return ResponseEntity.notFound().build(); // não há nenhum professor para retornar
    }

}
