package br.gama.itau.hospital.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200)
    private String name;

    @Column(length = 15)
    private String cpf;
    
    @Column(length = 15)
    private String fone;

    // Um paciente tem vários atendimentos
    // mappedBy indica o atributo da relação na tabela Atendimento
    @OneToMany(mappedBy = "paciente") 
    // Ao preencher os dados dos atendimentos
    // não preencha os dados do paciente destes atendimentos
    @JsonIgnoreProperties("paciente")
    private List<Atendimento> atendimentos;

}
