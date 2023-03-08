package br.gama.itau.spring03.util;

import br.gama.itau.spring03.model.Veiculo;

public class GenerateVeiculo {

    public static Veiculo novoVeiculoToSave() {
        return Veiculo.builder()
                .modelo("modelo v1")
                .placa("ABC123")
                .build();
    }
    
    public static Veiculo novoVeiculoToSave2() {
        return Veiculo.builder()
                .modelo("modelo v2")
                .placa("ABC1234")
                .build();
    }

    public static Veiculo veiculoValido() {
        return Veiculo.builder()
                .id(1)
                .modelo("modelo v1")
                .placa("ABC123")
                .build();
    }

    public static Veiculo veiculoValido2() {
        return Veiculo.builder()
                .id(1)
                .modelo("modelo v2")
                .placa("ABC1234")
                .build();
    }

    public static Veiculo veiculoValidoId2() {
        return Veiculo.builder()
                .id(2)
                .modelo("modelo v3")
                .placa("XYZ1234")
                .build();
    }

}
