package br.gama.itau.hospital.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate date;
    private String exames;
    private String medicines;

    // vários atendimentos para um paciente
    @ManyToOne
    // nome da coluna que é chave estrangeira (FK)
    @JoinColumn(name = "id_paciente")
    // ao preencher os dados do paciente, não preencha os atendimentos
    // deste paciente
    @JsonIgnoreProperties("atendimentos")
    private Paciente paciente;
    
}
