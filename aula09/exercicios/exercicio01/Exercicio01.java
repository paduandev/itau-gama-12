package exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int senha = 1;
        String nome;

        while (opcao != 5) {
            System.out.println("1- chegada cliente normal");
            System.out.println("2- chegada cliente prioridade");
            System.out.println("3- atendimento");
            System.out.println("4- exibir fila");
            System.out.println("5- sair");
            opcao = Integer.parseInt( scanner.nextLine() );

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    fila.inserir(nome, senha, false);
                    senha++;
                    break;
                case 2:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    fila.inserir(nome, senha, true);
                    senha++;                   
                    break;
                case 3:
                    Pessoa pessoa = fila.remover();
                    if(pessoa == null) {
                        System.out.println("Fila vazia");
                    } else {
                        System.out.println("Atendendo: " + pessoa.getSenha() + " - " + pessoa.getNome());
                    }
                    break;
                case 4:
                    System.out.println(fila.filaAtual());
                    break;
                case 5:
                    System.out.println("Fim");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        while (!fila.estaVazia()) {
            System.out.println(fila.remover().getNome());
        }

        scanner.close();
    }
}
