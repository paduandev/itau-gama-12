package exercicios.exercicio02;

import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) {
        final int QTDE_MAX_FUNC = 3;
        Funcionario funcionarios[] = new Funcionario[QTDE_MAX_FUNC];
        Scanner entrada = new Scanner(System.in);
        String nomeFuncionario;
        double valorPorHora, numeroHoras;
        int opcaoMenu = 0;
        int qtdeFuncionarios = 0, numeroDoFuncionario, numeroDeFuncionarios;

        // buffer de teclado

        while (opcaoMenu != 8) {
            System.out.println("1- Cadastrar novo funcionário");
            System.out.println("2- Cadastrar novo Gerente");
            System.out.println("3- Listar funcionários");
            System.out.println("4- Procurar um funcionário");
            System.out.println("5- Procurar um funcionário pelo nome");
            System.out.println("6- Calcular salários");
            System.out.println("7- Apagar funcionário/gerente");
            System.out.println("8- Finalizar");
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
                    if (qtdeFuncionarios < QTDE_MAX_FUNC) {
                        System.out.println("Digite o nome do gerente:");
                        nomeFuncionario = entrada.nextLine();
                        System.out.println("valor pago por hora:");
                        valorPorHora = Double.parseDouble(entrada.nextLine());
                        System.out.println("Número de horas trabalhadas:");
                        numeroHoras = Double.parseDouble(entrada.nextLine());
                        System.out.println("Número de funcionários:");
                        numeroDeFuncionarios = Integer.parseInt(entrada.nextLine());

                        Gerente novoGerente = new Gerente(nomeFuncionario, valorPorHora, numeroHoras, numeroDeFuncionarios);
                        funcionarios[qtdeFuncionarios] = novoGerente;
                        qtdeFuncionarios++;
                    } else {
                        System.out.println("Não foi possíve cadastrar. Memória cheia.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < qtdeFuncionarios; i++) {
                        System.out.println(funcionarios[i]);
                    }
                    break;
                case 4:
                    System.out.println("Digite o número do funcionário: ");
                    numeroDoFuncionario = Integer.parseInt(entrada.nextLine());
                    if (numeroDoFuncionario >= 0 && numeroDoFuncionario < qtdeFuncionarios) {
                        System.out.println(funcionarios[numeroDoFuncionario]);
                    } else {
                        System.out.println("Número inválido");
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do funcionário/gerente:");
                    nomeFuncionario = entrada.nextLine();
                    for (int i = 0; i < qtdeFuncionarios; i++) {
                        if(funcionarios[i].getNome().equalsIgnoreCase(nomeFuncionario)) {
                            System.out.println(funcionarios[i]);
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < qtdeFuncionarios; i++) {
                        System.out.println(funcionarios[i] + " salário: R$ " + funcionarios[i].calcularSalario());
                    }
                    break;
                case 7:
                    System.out.println("Apagar.");
                    break;
                case 8:
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
