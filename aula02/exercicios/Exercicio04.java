package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, valorKw;
        double valorAPagar, valorComDesconto;
        int qtdeKw;

        // Entrada de dados
        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de KW consumido:");
        qtdeKw = entrada.nextInt();

        // Processamento
        valorKw = salarioMinimo / 500;
        valorAPagar = qtdeKw * valorKw;
        valorComDesconto = valorAPagar * 0.85;

        // Saída
        System.out.println("Um Kw custa: R$ " + valorKw);
        System.out.println("O valor a ser pago é: R$ " + valorAPagar);
        System.out.println("Valor com desconto: R$ " + valorComDesconto);

        entrada.close();
    }
}
