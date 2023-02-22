package exemplos.exemplo03;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        // Integer neste exemplo é o tipo da chave (Key)
        // String neste exemplo é o tipo da informação
        HashMap<Integer, String> mapa = new HashMap<>();

        // insere alguns pares (chave, valor) dentro do HashMap (Mapa de Hash)
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");
        mapa.put(4, "Quatro");

        // exibir alguns conteúdos a partir da chave fornecida
        System.out.println("key 3 = " + mapa.get(3));
        System.out.println("key 4 = " + mapa.get(4));

        System.out.println("key 5 = " + mapa.get(5)); // usando uma chave que não existe

        // lista todas as chaves do conjunto de chaves do Hash (KeySet)
        for (Integer key : mapa.keySet()) {
            System.out.println(key);
        }
    }
}
