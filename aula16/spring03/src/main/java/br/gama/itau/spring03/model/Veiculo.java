package br.gama.itau.spring03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "id_proprietario") // cria uma coluna de relacionemnto na tabela 
    @JsonIgnoreProperties("veiculos") // quando buscar os dados do proprietário, ignore os dados dos veículos
    private Proprietario proprietario;
}
