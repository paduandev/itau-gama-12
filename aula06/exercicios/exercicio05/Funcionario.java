package exercicios.exercicio05;

public class Funcionario {
    private String nome;
    private double valorPorHora;
    private double numeroHoras;

    public Funcionario(String nome, double valorPorHora, double numeroHoras) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.numeroHoras = numeroHoras;
    }

    public void setValorPorHora(double novoValor) {
        valorPorHora = novoValor;
    }

    public String exibir() {
        return nome + " - R$ " + valorPorHora + " Horas: " + numeroHoras;
    }

    public double calcularSalario () {
        return valorPorHora * numeroHoras;
    }

}
