package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, soma = 0, cont;

        numero = 1;
        cont = 1;

        while (numero != 0) {
            System.out.println("Digite o " + cont + "º número inteiro ( 0 = fim ):");
            numero = in.nextInt();
            
            soma = soma + numero;
            cont++;
        }

        System.out.println("Soma = " + soma);

        in.close();
    }
}
