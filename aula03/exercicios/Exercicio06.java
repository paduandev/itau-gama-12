package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe o valor do salário");
        salario = entrada.nextDouble();

        if(salario <= 600) {
            System.out.println("Isento");
        } else {
            if(salario <= 1200) {
                System.out.println("20%");
            }else {
                if(salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }
        }

        entrada.close();
    }
}
