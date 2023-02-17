package exemplo05;

import java.util.Stack;

public class Exemplo05 {
    public static void main(String[] args) {
        // Stack = Pilha
        Stack<String> pilha = new Stack<>();

        // insere na pilha os endereços da web, simulando que a cada site navagado
        // guardamos o endereço para poder voltar
        pilha.push("www.siteA.com");
        pilha.push("www.siteB.com");
        pilha.push("www.siteC.com");
        pilha.push("www.siteD.com");


        // voltar na navegação, é equivalente a remover um elemento da pilha
        // e desta forma, aparecendo o site anterior

        System.out.println("Agora estou em: " + pilha.peek());

        // Se estamos no site D e queremos voltar para o anterior,
        // removemos o site do TOPO e navegamos para aquele que ficou no TOPO da pilha
        pilha.pop(); // tira o elemento que está no TOPO da Pilha

        // simulando o site onde estou navegando agora:
        // exibe o site que aparece no TOPO
        System.out.println("voltei para: " + pilha.peek()); // retorna o que está no TOPO, sem remover

        // repete a operação de voltar para o site anterior:
        pilha.pop();
        System.out.println("voltei para: " + pilha.peek());

        // enquanto a pilha não(!) estiver vazia
        // mostra todos os sites que restaram
        System.out.println("Todos os outros:");
        while (!pilha.isEmpty()) {
            String site = pilha.pop(); // remove da pilha
            System.out.println(site);
        }
    }
}
