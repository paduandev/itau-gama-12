package exemplos.exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson");

        System.out.println(p.getNome());
        System.out.println(p);

        p = new Pessoa("Paduan");

        System.out.println(p.getNome());
        System.out.println(p);
    }
}
