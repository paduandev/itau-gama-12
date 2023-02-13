package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        int quantidade = 5;
        linha(quantidade);

        System.out.println("Bom dia");
        linha(15);

        linha2(10, '*'); 

        linha3("Contando os caracteres", '=');
    }

    static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha2(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    static void linha3(String mensagem, char simbolo) {
        System.out.println(mensagem);
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }


}