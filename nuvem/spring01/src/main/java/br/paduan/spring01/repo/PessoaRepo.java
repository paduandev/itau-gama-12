package br.paduan.spring01.repo;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring01.model.Pessoa;

public interface PessoaRepo extends CrudRepository<Pessoa, Integer> {
    
}
