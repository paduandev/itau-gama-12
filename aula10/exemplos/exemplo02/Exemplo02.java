package exemplos.exemplo02;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean entradaInvalida = true;

        // enquanto a entrada for inválida, continua pedindo a digitação
        while (entradaInvalida) {
            try {
                System.out.println("Digite um número inteiro:");
                numero = entrada.nextInt();
                entradaInvalida = false;
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                entrada.nextLine(); // limpar o buffer de teclado
            }
        }

        System.out.println("Você digitou: " + numero);

        entrada.close();
    }
}
