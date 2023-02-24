package exercicios.contas;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor; // saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if(valor > 0) {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "[numero=" + numero + ", saldo=" + saldo + "]";
    }

}