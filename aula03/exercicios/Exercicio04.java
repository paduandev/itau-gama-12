package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao;
        double valorMaximo;
        boolean podeEmprestar; // true / false

        System.out.print("Digite o valor do salário bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.print("Digite o valor da prestação:");
        valorPrestacao = teclado.nextDouble();

        valorMaximo = salarioBruto * 0.3;
        podeEmprestar = valorPrestacao <= valorMaximo;

        if(podeEmprestar) {
            System.out.println("Pode fazer o emprestimo");
        } else {
            System.out.println("Não pode fazer o emprestimo");
        }

        System.out.println("Fim de execução");

        teclado.close();
    }
}
