package br.gama.itau.hospital.dto;

import br.gama.itau.hospital.model.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {
    private String name;
    private String cpf;
    private String fone;

    public PacienteDTO(Paciente paciente) {
        this.name = paciente.getName();
        this.cpf = paciente.getCpf();
        this.fone = paciente.getFone();
    }
}
