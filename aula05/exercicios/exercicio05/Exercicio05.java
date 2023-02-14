package exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int QTDE_NOMES = 3;
        String nomes[] = new String[QTDE_NOMES];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes lidos:");
        for (int i = nomes.length - 1; i >= 0 ; i--) {
            System.out.println("Nome: " + nomes[i]);
        }

        scanner.close();
    }
}
