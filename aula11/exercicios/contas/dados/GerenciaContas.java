package exercicios.contas.dados;

import java.util.HashMap;

import exercicios.contas.modelo.Conta;
import exercicios.contas.modelo.ContaCorrente;
import exercicios.contas.modelo.ContaEspecial;
import exercicios.contas.modelo.ContaPoupanca;

public class GerenciaContas {
    private HashMap<Integer, Conta> listaDeContas;

    public GerenciaContas() {
        listaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public String consultarSaldo(int numeroConta) {
        // busca a conta desejada
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            return "Conta não encontrada";
        }
        return conta.toString();
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            return false;
        }
        return conta.depositar(valor);
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            return false;
        }
        return conta.sacar(valor);
    }

}
