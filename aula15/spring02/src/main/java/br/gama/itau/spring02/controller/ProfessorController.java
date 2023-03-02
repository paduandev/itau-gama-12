package br.gama.itau.spring02.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping // O método da requisição será agora um POST
    // Os dados da requisição serão enviado no corpo da requisição (requestBody)
    public ResponseEntity<Professor> saveProfessor(@RequestBody Professor novoProfessor) {
        Professor professor = repo.save(novoProfessor);
        
        return ResponseEntity.ok(professor);
    }

    @PutMapping("/{codigo}") // O método da requisição indica uma atualização do objeto
    public ResponseEntity<Professor> updateProfessor(@PathVariable Long codigo, @RequestBody Professor professor) {
        // valida se o código foi enviado
        if(codigo != null) {
            professor.setCodigo(codigo); // ajusta o código do objeto
            Professor professorAtualizado = repo.save(professor); // atualiza os dados no BD
            return ResponseEntity.ok(professorAtualizado); // retorna os dados atualizados
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{codigo}") // Delete indica que vamos apagar uma entidade
    public ResponseEntity<Void> deleteProfessor(@PathVariable Long codigo) {
        Optional<Professor> optional = repo.findById(codigo);

        // verifica se o professor com este código existe no BD
        if(optional.isPresent()) {
            // apaga a patir do Id (Chave Primária).
            repo.deleteById(codigo);
            return ResponseEntity.ok().build(); // retorna sucesso
        }

        return ResponseEntity.notFound().build(); // retorna não encontrado
    }
}
