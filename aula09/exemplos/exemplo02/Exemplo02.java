package exemplos.exemplo02;

import java.util.TreeSet;

public class Exemplo02 {
    public static void main(String[] args) {
        int ListaDeNumeros[] = {2, 4, 1, 6, 2, 3, 7, 4, 5, 8};
        TreeSet<Integer> arvore = new TreeSet<>();

        // Para cada 'número' do vetor 'ListaDeNúmeros'
        // Adicione este 'número' na 'árvore'
        for (int numero : ListaDeNumeros) {
            // adicione o número na árvore
            arvore.add(numero);
        }

        // Exibir todos os valores da árvore
        // Para cada número Integer da árvore, exiba esse valor
        for (Integer numero : arvore) {
            System.out.print(numero + " ");
        }
    }
}
