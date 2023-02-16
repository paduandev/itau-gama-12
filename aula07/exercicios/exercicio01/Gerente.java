package exercicios.exercicio01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome) {
        super(nome);
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    public void aumentarSalario(float perc) {
        setSalario( (1.2 + perc) * getSalario() );
    }

    public String imprimir() {
        return super.imprimir() + " - " + numFuncionarios;
    }
}
