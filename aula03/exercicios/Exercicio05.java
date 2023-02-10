package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean senhaValida;

        System.out.print("Informe a senha: ");
        senha = entrada.nextLine();

        senhaValida = senha.equals("R10p5");
        // valida = senha.equalsIgnoreCase("R10p5");

        if(senhaValida) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
