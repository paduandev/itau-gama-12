package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Digite 3 valores inteiros:");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();

        System.out.println("Menor = " + menor(numero1, numero2, numero3));

        teclado.close();
    }

    static int menor(int n1, int n2, int n3) {
        // if(n1 <= n2 && n1 <= n3) {
        //     return n1;
        // } else {
        //     if(n2 <= n1 && n2 <= n3) {
        //         return n2;
        //     } else {
        //         return n3;
        //     }
        // }

        // if(n1 <= n2) {
        //     if(n1 <= n3) {
        //         return n1;
        //     } else {
        //         if(n2 <= n3) {
        //             return n2;
        //         } else {
        //             return n3;
        //         }
        //     }
        // } else {
        //     if(n2 <= n3) {
        //         return n2;
        //     } else {
        //         return n3;
        //     }
        // }

        int numMenor = n1;

        if(n2 < numMenor) {
            numMenor = n2;
        }

        if(n3 < numMenor) {
            numMenor = n3;
        }

        return numMenor;
    }
}
