package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2;
        double media;

        // Entrada de dados
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        // Processamento
        media = (nota1 + nota2) / 2;

        // saída de dados
        System.out.println("\nMédia = " + media + "\n");

        entrada.close();
    }
}
