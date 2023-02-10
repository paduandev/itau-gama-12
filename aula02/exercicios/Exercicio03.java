package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        // entrada dos dados
        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();

        // processamento: calcular salario + 25%
        // novoSalario = salario + salario * 0.25; // ou
        novoSalario = salario * 1.25;

        // exibir a resposta
        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}