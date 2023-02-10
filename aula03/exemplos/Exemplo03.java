package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 5; // constante: não permite mudar o valor
        Scanner teclado = new Scanner(System.in);
        double nota, media;
        int cont;

        cont = 1;
        media = 0;
        while ( cont <= QTDE_ALUNOS ) {
            System.out.println("Digite a próxima nota: ("+ cont + "/" + QTDE_ALUNOS + ")");
            nota = teclado.nextDouble();
            media = media + nota;
            cont++;
        }

        media = media / QTDE_ALUNOS;
        System.out.println("Média: " + media);

        teclado.close();
    }
}
