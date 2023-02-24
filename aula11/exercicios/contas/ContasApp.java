package exercicios.contas;

import exercicios.contas.modelo.ContaEspecial;

public class ContasApp {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial(123, 100);

        System.out.println(c1);

        c1.depositar(100);
        System.out.println(c1);

        if (c1.sacar(100)) {
            System.out.println("Sucesso");
            System.out.println(c1);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }

        if (c1.sacar(50)) {
            System.out.println("Sucesso");
            System.out.println(c1);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }

        if (c1.sacar(100)) {
            System.out.println("Sucesso");
            System.out.println(c1);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }

        c1.sacar(-50);
        System.out.println(c1);
    }
}
