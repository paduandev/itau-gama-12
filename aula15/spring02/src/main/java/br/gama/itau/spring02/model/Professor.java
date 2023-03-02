package br.gama.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que esta classe será aramazenada no BD
@Table(name = "professor") // Opcional: indica o nome da tabela no BD
public class Professor {

    @Id // indica que este atributo é chave primária (PK) no BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que será gerado pelo BD sequencialmente 1, 2, 3, ....
    @Column(name = "cod") // troca o nome da coluna na tabela
    private long codigo;

    @Column(length = 200, nullable = false) // tamanho máximo do nome, e nome é obrigatório
    private String nome;

    @Column(length = 100, nullable = false, unique = true) // não pode ter repetição de email
    private String email;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
