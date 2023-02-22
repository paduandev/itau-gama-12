package exemplos.exemplo01;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo01 {

    public static void main(String[] args) {
        // Queue é uma interface e por isso não pode instanciar (gerar) objetos
        // Podemos usar uma Lista Ligada que é uma classe que implementa Queue
        Queue<Integer> fila = new LinkedList<>();

        // inserindo alguns números na fila
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);

        // exibindo a fila através do método toString
        System.out.println(fila);

        // removendo todos os elementos da fila
        // enquanto a fila não (!) estiver vazia ...
        while(!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.remove());
            System.out.println(fila);
        }

    }
}