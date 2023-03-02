package br.gama.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // indica que esta classe será aramazenada no BD
@Table(name = "professor") // Opcional: indica o nome da tabela no BD
@Getter // Anotação do Lombok que irá gerar todos os Get "automaticamente"
@Setter
public class Professor {

    @Id // indica que este atributo é chave primária (PK) no BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que será gerado pelo BD sequencialmente 1, 2, 3, ....
    @Column(name = "cod") // troca o nome da coluna na tabela
    private long codigo;

    @Column(length = 200, nullable = false) // tamanho máximo do nome, e nome é obrigatório
    private String nome;

    @Column(length = 100, nullable = false, unique = true) // não pode ter repetição de email
    private String email;

}
