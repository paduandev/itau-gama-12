package br.gama.itau.spring03.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.spring03.model.Veiculo;


public interface VeiculoRepo extends CrudRepository<Veiculo, Long> {
    Veiculo findByPlaca(String placa);
    List<Veiculo> findByAnoFabricacaoGreaterThanEqual(int anoFabricacao);
}
