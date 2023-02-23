package duvidas;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Escolha uma opção: ");
        System.out.println("1 para somar: ");
        System.out.println("2 para subtrair: ");
        System.out.println("3 para multiplicar: ");
        System.out.println("4 para dividir: ");
        opcao = entrada.nextInt();

        System.out.println("Resultado: " + calculadora(opcao));

        entrada.close();
    }

    public static double calculadora(int opcao) {
        Scanner entrada = new Scanner(System.in);

        double valor1 = 0;
        double valor2 = 0;
        double resultado = -1;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            System.out.println("primeiro valor: ");
            valor1 = entrada.nextDouble();
            System.out.println("segundo valor: ");
            valor2 = entrada.nextDouble();
            entradaInvalida = false;
            switch (opcao) {
                case 1:
                    resultado = valor1 + valor2;
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    break;
                case 4:
                    try {
                        if(valor2 == 0) {
                            throw new ArithmeticException("Divisão por zero");
                        }
                        resultado = valor1 / valor2;
                    } catch (Exception e) {
                        System.out.println("Divisão por 0, por favor digite um valor valido!");
                        entradaInvalida = true;
                    }
            }
        }
        entrada.close();

        return resultado; 
    }

}
