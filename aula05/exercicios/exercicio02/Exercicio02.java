package exercicios.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lulu", "rottweiler", 2015, "Marcos", "(11) 1234-5678");

        System.out.println(animal1.getDados());


        Proprietario pr1 = new Proprietario("Gisele", "(11) 1234-5678");

        Animal animal2 = new Animal("Lessie", "Lessie", 2020, pr1);

        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal2 ? (set)
        pr1.setTelefone("(12) 9999-8888");
        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal1 ? (set)
        animal1.getProprietario().setTelefone("(23) 8876-2323");
        System.out.println(animal1.getDados());

    }
}
