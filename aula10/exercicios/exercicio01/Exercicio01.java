package exercicios.exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        boolean invalido = true;

        while (invalido) {
            try {
                System.out.println("Digite um número inteiro:");
                n1 = scanner.nextInt();
                System.out.println("Digite outro número inteiro diferente de zero:");
                n2 = scanner.nextInt();

                System.out.println(n1 + " + " + n2 + " = " + calcula(n1, n2, '+'));
                System.out.println(n1 + " - " + n2 + " = " + calcula(n1, n2, '-'));
                System.out.println(n1 + " * " + n2 + " = " + calcula(n1, n2, '*'));
                System.out.println(n1 + " / " + n2 + " = " + calcula(n1, n2, '/'));
                invalido = false;

            } catch (ArithmeticException e) {
                System.out.println("Erro.");
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Digitação inválida.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }

    private static double calcula(int n1, int n2, char operacao) throws ArithmeticException {
        switch (operacao) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if (n2 == 0) {
                    throw new ArithmeticException("Divisão por zero.");
                }
                return (double) n1 / n2;

            default:
                return -1;
        }
    }
}
