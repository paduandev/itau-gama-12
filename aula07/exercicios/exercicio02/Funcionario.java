package exercicios.exercicio02;

public class Funcionario {
    private String nome;
    private double valorPorHora;
    private double horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario, double numeroHoras) {
        this.nome = nome;
        this.valorPorHora = salario;
        this.horasTrabalhadas = numeroHoras;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double salario) {
        this.valorPorHora = salario;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarSalario(float perc) {
        // salario = salario + salario * perc;
        // salario = salario * (1 + perc);
        valorPorHora *= (1 + perc);
    }

    public String toString() {
        String saida = String.format("%.2f", valorPorHora);
        return nome + " - R$ " + saida;
    }

    
    public double calcularSalario () {
        return valorPorHora * horasTrabalhadas;
    }
} 
