package br.gama.itau.spring03.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length=150, nullable = false)
    private String nome;

    @Column(length = 20, nullable= false, unique=true)
    private String telefone;

    @OneToMany(mappedBy = "proprietario")
    @JsonIgnoreProperties("proprietario") // quando buscar os dados dos veículos, ignore os dados do proprietario
    private List<Veiculo> veiculos;

}
