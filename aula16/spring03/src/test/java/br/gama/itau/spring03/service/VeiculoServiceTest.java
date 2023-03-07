package br.gama.itau.spring03.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;
import br.gama.itau.spring03.util.GenerateVeiculo;

@ExtendWith(MockitoExtension.class)
public class VeiculoServiceTest {

    // esse obj receberá um Mock da sua dependência
    // esse é o obj da classe a ser testada
    @InjectMocks
    private VeiculoService service;

    // É a dependência a ser injetada
    @Mock
    private VeiculoRepo repo;

    @Test
    public void newVeiculo_returnNewVeiculo_whenVeiculoValido() {
        // preparação
        BDDMockito.when(repo.save(ArgumentMatchers.any(Veiculo.class)))
            .thenReturn(GenerateVeiculo.veiculoValido());

        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        // ação
        Veiculo veiculoCriado = service.newVeiculo(novoVeiculo);

        // verificação
        assertThat(veiculoCriado).isNotNull();
        assertThat(veiculoCriado.getId()).isPositive();
        assertThat(veiculoCriado.getPlaca()).isEqualTo(novoVeiculo.getPlaca());

        // verifica se o método save foi chamado 1 vez
        verify(repo, Mockito.times(1)).save(novoVeiculo);
    }

}
