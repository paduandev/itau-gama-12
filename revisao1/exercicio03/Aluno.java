package exercicio03;

public class Aluno {
    private String nome;
    private double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }
   
}
