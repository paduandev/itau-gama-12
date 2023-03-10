package br.gama.itau.hospital.repo;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.hospital.model.Atendimento;

public interface AtendimentoRepo extends CrudRepository<Atendimento, Long> {

}
