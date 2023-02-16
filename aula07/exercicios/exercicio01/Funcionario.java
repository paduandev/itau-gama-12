package exercicios.exercicio01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarSalario(float perc) {
        // salario = salario + salario * perc;
        // salario = salario * (1 + perc);
        salario *= (1 + perc);
    }

    public String imprimir() {
        String saida = String.format("%.2f", salario);
        return nome + " - R$ " + saida;
    }
} 
