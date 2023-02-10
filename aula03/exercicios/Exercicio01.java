package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um número inteiro:");
        numero = teclado.nextInt();

        if( numero > 20) {
            metade = (double)numero / 2; // casting
            System.out.println(metade);
        }


        teclado.close();
    }
    
}