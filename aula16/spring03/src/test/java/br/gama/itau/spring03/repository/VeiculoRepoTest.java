package br.gama.itau.spring03.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.gama.itau.spring03.model.Veiculo;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class VeiculoRepoTest {
    
    @Autowired
    private VeiculoRepo repo;

    @Test
    public void save_returnSavedVeiculo_whenValidVeiculo() {
        Veiculo novoVeiculo = Veiculo.builder()
            .modelo("modelo v1")
            .placa("ABC123")
            .build();

        Veiculo veiculoCriado = repo.save(novoVeiculo);

        assertThat(veiculoCriado).isNotNull();
        assertThat(veiculoCriado.getModelo()).isEqualTo(novoVeiculo.getModelo());
    }

}
