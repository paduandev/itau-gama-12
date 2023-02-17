package exemplos.exemplo04;

import java.util.ArrayList;

public class Exemplo04 {
    public static void main(String[] args) {
        // Nâo podepois int não é nome de classe
        // ArrayList<int>
        // Para o tipo int,devemos usar Integer
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        // o tipo double (primitivo) deve ser Double (nome da classe)

        ArrayList<Double> listaDouble = new ArrayList<>();
        
        // String é classe, então podemos usar
        ArrayList<String> listaPalavras = new ArrayList<>();

        //adiciona itens no final do array 

        listaPalavras.add("Zero");
        listaPalavras.add("Um");
        listaPalavras.add("Dois");
        listaPalavras.add("Três");
        listaPalavras.add("Quatro");

        System.out.println("Quantidade: " + listaPalavras.size());
        System.out.println(listaPalavras); // chama o toString implicaitamente

        // posso percorrer o ArrayList em quanquer direção. Neste exemplo, do final para o começo
        for (int i = listaPalavras.size()-1; i >= 0; i--) {
            System.out.print(listaPalavras.get(i) + " ");
        }
        
        System.out.println();
        // para apagar precisa ser exatamente igual
        if( listaPalavras.remove("Dois") ) {
            System.out.println("Apagado o Dois");
        } else {
            System.out.println("Não apagou");
        }
        
        System.out.println("Com o for i:");
        // percorre todo o ArrayList do início ao final
        for (int i = 0; i < listaPalavras.size(); i++) {
            System.out.print(listaPalavras.get(i) + " ");
        }

        System.out.println("\nCom o foreach:");
        // for - foreach - para cada elemento
        // Para cada 'palavra' da 'ListaPalvras'
        // cada vez que passar pelo 'for', preenche a variável 'palavra' com um elemento da lista
        for (String palavra : listaPalavras) {
            System.out.print(palavra + " ");
        }

    }
}
