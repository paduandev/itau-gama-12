package br.gama.itau.spring03.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.util.GenerateVeiculo;

@DataJpaTest
public class VeiculoRepoTest {

    @Autowired
    private VeiculoRepo repo;

    @Test
    public void save_returnSavedVeiculo_whenValidVeiculo() {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        Veiculo veiculoCriado = repo.save(novoVeiculo);

        assertThat(veiculoCriado).isNotNull();
        assertThat(veiculoCriado.getModelo()).isEqualTo(novoVeiculo.getModelo());
    }

    @Test
    public void delete_removeUmVeiculo_whenIdExist() {
        // preparação
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        Veiculo veiculoCriado = repo.save(novoVeiculo);

        // ação
        repo.deleteById(veiculoCriado.getId());

        // verificação
        Optional<Veiculo> optional = repo.findById(veiculoCriado.getId());
        assertThat(optional.isEmpty()).isTrue();
    }

    // crie um teste para verificar o funcionamento do Update Veiculo
    @Test
    public void update_updateVeiculo_whenVeiculoValido() {
        // preparação
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();
        Veiculo veiculoCriado = repo.save(novoVeiculo);

        veiculoCriado.setPlaca("AAA");

        // ação
        Veiculo veiculoAtualizado = repo.save(veiculoCriado);

        // verificação
        assertThat(veiculoAtualizado).isNotNull();
        assertThat(veiculoAtualizado.getPlaca()).isEqualTo(veiculoCriado.getPlaca());

    }

}
