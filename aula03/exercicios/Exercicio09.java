package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        int numero;

        System.out.println("Informe o valor limite:");
        limite = entrada.nextInt();

        // *** solução 1 ***
        System.out.print("\nSolução 1: ");
        numero = 1;
        while (numero <= limite) {
            if(numero * 2 <= limite){ // próximo = 2 * número
                System.out.print(numero + ", ");
            } else {
                System.out.print(numero);
            }
            numero = numero * 2;
        }

        // *** solução 2 ***
        System.out.print("\nSolução 2: ");
        numero = 1;
        while (numero <= limite) {
            System.out.print(numero);
            numero *= 2;
            if (numero <= limite) {
                System.out.print(", ");
            }

        }

        // *** solução 3 ***
        System.out.print("\nSolução 3: ");
        numero = 1;
        while (numero <= limite / 2) {
            System.out.print(numero + ", ");
            numero *= 2;
        }
        System.out.print(numero);

        // *** solução 4 ***
        System.out.print("\nSolução 4: ");

        numero = 2;
        System.out.print(1);
        while (numero <= limite) {
            System.out.print(", " + numero);
            numero *= 2;
        }


        // *** Pode ser feito com 'for' também: ***

        // for(numero = 1;numero <= limite; numero *= 2) {
        //     System.out.print(numero + " ");
        // }

        entrada.close();
    }
}
