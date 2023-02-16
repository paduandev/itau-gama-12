package exercicios.exercicio02;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome) {
        super(nome);
    }

    public Gerente(String nome, double salario, double numeroHoras) {
        super(nome, salario, numeroHoras);
    }

    public Gerente(String nome, double salario, double numeroHoras, int numFuncionarios) {
        super(nome, salario, numeroHoras);
        this.numFuncionarios = numFuncionarios;
    }

    public void aumentarSalario(float perc) {
        setValorPorHora( (1.2 + perc) * getValorPorHora() );
    }

    public String toString() {
        return super.toString() + " - " + numFuncionarios;
    }
}
