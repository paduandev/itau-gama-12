package exemplos.exemplo01;

public class Pessoa {
    // variável de classe, e não de objeto
    private static String nome;

    //exemplo de constante de classe
    public static final double PI = 3.1415;
    
    // um método da classe, e não de um objeto
    // serve para chamar o método, sem precisar criar o objeto
    public static void nomeDaClasse() {
        System.out.println("Classe pessoa");
        System.out.println(PI);
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }
}