package exemplos.exemplo01;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // tente fazer isso
        try {
            System.out.println("Digite um número inteiro:");
            numero = entrada.nextInt();
            
        } catch (Exception e) { // caso aconteça um erro, faça aqui o tratamento
            System.out.println("Ocorreu um erro.");
            // e.getMEssage pode trazer a mensagem de erro, caso o a Exception tenha uma mensagem
            System.out.println("Mensagem:" + e.getMessage());
            // podemos capturar toda a Stack (pilha) de chamadas de métodos
            e.printStackTrace();

            numero = 0; // um possível tratamento para a falta de valor digitado
        }

        System.out.println("Você digitou: " + numero);

        System.out.println("Final do programa.");

        entrada.close();
    }
}