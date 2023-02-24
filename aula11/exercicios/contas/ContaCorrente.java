package exercicios.contas;

public class ContaCorrente extends Conta {
    // static pois é uma mesma constante para todos os objetos. É uma constante da classe
    // final pois é uma constante, não pode alterar o valor
    private static final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero) {
        super(numero);
    }

    // sobrescremos o método de saque pois a regra para a classe
    // ContaCorrente é diferente da regra da classe Conta
    // Aqui só pode fazer o saque se houver saldo na conta
    @Override
    public boolean sacar(double valor) {
        // verifica se valor do saque é menor ou igual ao saldo da conta
        // usamos o método GetSaldo pois não temos acesso direto ao saldo por ser privado
        if(valor <= getSaldo()) {
            return super.sacar(valor);
        }
        return false; // quando não tem saldo suficiente
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
