package exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int numeroPaginas, opcaoMenu = 0;
        Ebook livro;

        System.out.print("Qual o titulo do livro? ");
        titulo = entrada.nextLine();
        System.out.print("Qual o nome do autor? ");
        autor = entrada.nextLine();
        System.out.print("Qual o número de páginas? ");
        numeroPaginas = entrada.nextInt();

        livro = new Ebook(titulo, autor, numeroPaginas);

        System.out.println("Livro criado:");
        

        while (opcaoMenu != 4) {
            System.out.println("1 - mostrar a capa");
            System.out.println("2 - próxima página");
            System.out.println("3 - página anterior");
            System.out.println("4 - sair");
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    livro.mostrarCapa();
                    break;
                case 2:
                    livro.avancarPagina();
                    System.out.println("Agora vc está na página " + livro.exibirPagina());
                    break;
                case 3:
                    System.out.println("Vc escolheu 3");
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


        entrada.close();
    }
}
