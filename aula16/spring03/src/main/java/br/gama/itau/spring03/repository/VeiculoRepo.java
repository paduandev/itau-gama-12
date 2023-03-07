package br.gama.itau.spring03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gama.itau.spring03.model.Veiculo;


public interface VeiculoRepo extends CrudRepository<Veiculo, Long> {
    // Usando Query Methods
    Veiculo findByPlaca(String placa);
    List<Veiculo> findByAnoFabricacaoGreaterThanEqual(int anoFabricacao);

    // Usando Named Queries
    @Query("select v from Veiculo v order by v.marca")
    List<Veiculo> getAllOrderMarca();
}
