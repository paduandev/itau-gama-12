package exercicios.contas;

import java.util.Scanner;
import java.util.ArrayList;

import exercicios.contas.modelo.Conta;
import exercicios.contas.modelo.ContaCorrente;
import exercicios.contas.modelo.ContaEspecial;
import exercicios.contas.modelo.ContaPoupanca;

public class ContasApp {
    public static void main(String[] args) {
        ArrayList<Conta> listaDeContas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        while (opcao != 7) {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Poupança");
            System.out.println("3- Nova Conta Especial");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Depositar");
            System.out.println("6- Sacar");
            System.out.println("7- Sair");
            System.out.print("--> ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    // ContaCorrente cc = new ContaCorrente(numeroConta);
                    listaDeContas.add(new ContaCorrente(numeroConta));
                    break;
                case 2:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    listaDeContas.add(new ContaPoupanca(numeroConta));
                    break;
                case 3:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = scanner.nextDouble();
                    listaDeContas.add(new ContaEspecial(numeroConta, limite));
                    break;
                case 4:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    // Para cada conta da ListaDeContas
                    for (Conta conta : listaDeContas) {
                        // Verifique se esta conta tem o número que estamos procurando
                        if (conta.getNumero() == numeroConta) {
                            System.out.println(conta);
                            break; // quando achou, interrompe o for
                        }
                    }
                    break;
                case 5:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Qual o valor do depósito: ");
                    valor = scanner.nextDouble();
                    // Para cada conta da ListaDeContas
                    for (Conta conta : listaDeContas) {
                        // Verifique se esta conta tem o número que estamos procurando
                        if (conta.getNumero() == numeroConta) {
                            // tenta fazer o depósito
                            if(conta.depositar(valor)){ // se o depósito foi feito
                                System.out.println("Deposíto realizado");
                                System.out.println(conta);
                            } else { // se deu erro no depósito
                                System.out.println("Falha ao depositar.");
                            }
                            break; // quando achou, interrompe o for
                        }
                    }    
                    break;
                case 6:

                    break;
                case 7:
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
}
