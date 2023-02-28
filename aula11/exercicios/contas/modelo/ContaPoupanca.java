package exercicios.contas.modelo;

import exercicios.contas.excecao.ValorInvalidoException;

public class ContaPoupanca extends Conta {
    private static double taxa_saque = 0.01;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxaSaque(double novaTaxa) throws ValorInvalidoException {
        if(novaTaxa < 0) {
            throw new ValorInvalidoException("A taxa deve ser um valor positivo.");
        }
        taxa_saque = novaTaxa;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor + taxa_saque <= getSaldo()) {
            return super.sacar(valor + taxa_saque);
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
