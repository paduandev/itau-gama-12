package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        int numero;

        System.out.println("Informe o valor limite:");
        limite = entrada.nextInt();

        numero = 1;
        while (numero <= limite) {
            if(numero * 2 <= limite){ // próximo = 2 * número
                System.out.print(numero + ", ");
            } else {
                System.out.print(numero);
            }
            numero = numero * 2;
        }

        // for(numero = 1;numero <= limite; numero *= 2) {
        //     System.out.print(numero + " ");
        // }

        entrada.close();
    }
}
