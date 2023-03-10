package br.gama.itau.hospital.util;

import br.gama.itau.hospital.model.Paciente;

public class GeneratePaciente {

    public static Paciente pacienteId1() {
        return Paciente.builder()
                .id(1)
                .name("Paciente 1")
                .cpf("cpf 1")
                .fone("fone 1")
                .build();
    }

    public static Paciente pacienteId2() {
        return Paciente.builder()
                .id(2)
                .name("Paciente 2")
                .cpf("cpf 2")
                .fone("fone 2")
                .build();
    }

    public static Paciente novoPaciente1() {
        return Paciente.builder()
                .name("Paciente 1")
                .cpf("cpf 1")
                .fone("fone 1")
                .build();
    }

    public static Paciente novoPaciente2() {
        return Paciente.builder()
                .name("Paciente 2")
                .cpf("cpf 2")
                .fone("fone 2")
                .build();
    }
}
