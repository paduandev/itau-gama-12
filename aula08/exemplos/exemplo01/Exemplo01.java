package exemplos.exemplo01;

public class Exemplo01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // método estático é chamado a partir da classe
        // classe é Pessoa
        Pessoa.nomeDaClasse();

        // exemplo de constante estática
        System.out.println( Pessoa.PI );

        // Exemplo prático de uso de método estático
        // classe matemática do Java
        Math.sqrt(25);

        // estamos chamando a partir dos objetos
        // para "forçar" e entender o que ocorre
        // mas na realidade, deveríamos chamar sempre a partir da classe
        // Pessoa.setNome("Emerson")

        p1.setNome("Emerson");
        p2.setNome("Davi");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
    }

}
