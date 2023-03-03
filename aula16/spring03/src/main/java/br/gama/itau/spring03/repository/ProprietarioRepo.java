package br.gama.itau.spring03.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.spring03.model.Proprietario;

public interface ProprietarioRepo extends CrudRepository<Proprietario, Long> {

}
