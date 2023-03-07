package br.gama.itau.spring03.util;

import br.gama.itau.spring03.model.Veiculo;

public class GenerateVeiculo {

    public static Veiculo novoVeiculoToSave() {
        return Veiculo.builder()
                .modelo("modelo v1")
                .placa("ABC123")
                .build();
    }

}
