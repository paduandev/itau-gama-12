package exemplos.exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        // criando um objeto do tipo Pessoa
        Pessoa pessoa1 = new Pessoa("Emerson", 49);
        Pessoa pessoa2 = new Pessoa("Carina", 30);

        // pessoa1.nome = "Emerson";
        // pessoa1.idade = 49;
        // pessoa2.nome = "Carina";
        // pessoa2.idade = 30;

        // System.out.println(pessoa1.nome);
        // System.out.println(pessoa2.nome);
        pessoa1.apresentar();
        pessoa2.apresentar();

    }

}
