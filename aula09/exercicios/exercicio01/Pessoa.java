package exercicios.exercicio01;

public class Pessoa {
    private String nome;
    private int senha;
    
    public Pessoa(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }

}
