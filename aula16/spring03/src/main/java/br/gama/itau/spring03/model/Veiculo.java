package br.gama.itau.spring03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private long id;

    @Column(length = 7, nullable = false, unique = true)
    private String placa;
    
    @Column(length = 20)
    private String marca;

    @Column(length = 50, nullable=true)
    private String modelo;
    
    private int anoFabricacao;
}
