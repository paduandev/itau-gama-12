package exercicios.exercicio05;

import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) {
        final int QTDE_MAX_FUNC = 3;
        Funcionario funcionarios[] = new Funcionario[QTDE_MAX_FUNC];
        Scanner entrada = new Scanner(System.in);
        String nomeFuncionario;
        double valorPorHora, numeroHoras;
        int opcaoMenu = 0;
        int qtdeFuncionarios = 0, numeroDoFuncionario;

        // buffer de teclado

        while (opcaoMenu != 5) {
            System.out.println("1- Cadastrar novo funcionário");
            System.out.println("2- Listar funcionários");
            System.out.println("3- Procurar um funcionário");
            System.out.println("4- Calcular salários");
            System.out.println("5- Finalizar");
            opcaoMenu = Integer.parseInt(entrada.nextLine()); // parse transforma o texto em número int

            switch (opcaoMenu) {
                case 1:
                    if (qtdeFuncionarios < QTDE_MAX_FUNC) {
                        System.out.println("Digite o nome do funcionário:");
                        nomeFuncionario = entrada.nextLine();
                        System.out.println("valor pago por hora:");
                        valorPorHora = Double.parseDouble(entrada.nextLine());
                        System.out.println("Número de horas trabalhadas:");
                        numeroHoras = Double.parseDouble(entrada.nextLine());

                        Funcionario novoFuncionario = new Funcionario(nomeFuncionario, valorPorHora, numeroHoras);
                        funcionarios[qtdeFuncionarios] = novoFuncionario;
                        qtdeFuncionarios++;
                    } else {
                        System.out.println("Não foi possíve cadastrar. Memória cheia.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < qtdeFuncionarios; i++) {
                        System.out.println(funcionarios[i].exibir());
                    }
                    break;
                case 3:
                    System.out.println("Digite o número do funcionário: ");
                    numeroDoFuncionario = Integer.parseInt(entrada.nextLine());
                    if (numeroDoFuncionario >= 0 && numeroDoFuncionario < qtdeFuncionarios) {
                        System.out.println(funcionarios[numeroDoFuncionario].exibir());
                    } else {
                        System.out.println("Número inválido");
                    }
                    break;
                case 4:
                    for (int i = 0; i < qtdeFuncionarios; i++) {
                        System.out.println(funcionarios[i].exibir() + " salário: R$ " + funcionarios[i].calcularSalario());
                    }
                    break;
                case 5:
                    System.out.println("Final do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        entrada.close();
    }
}
