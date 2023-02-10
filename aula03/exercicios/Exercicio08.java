package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabulada, cont;

        System.out.print("Qual a tabuada? ");
        tabulada = entrada.nextInt();

        cont = 0;
        while (cont < 11) {
            // System.out.println(tabulada + " X " + cont + " = " + (tabulada * cont));
            // print formatado
            // %d = número, 2 e o número de casas numéricas
            System.out.printf("%d X %2d = %2d\n", tabulada, cont, (tabulada * cont) );
            cont++;
        }

        entrada.close();
    }
}
