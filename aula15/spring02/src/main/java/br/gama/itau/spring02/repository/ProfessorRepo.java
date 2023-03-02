package br.gama.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.spring02.model.Professor;

// CRUD = Create, Read, Update, Delete
// <Professor, Long> = Professor é a Entidade e Long é o tipo da chave primária
public interface ProfessorRepo extends CrudRepository<Professor, Long> {
    
}
