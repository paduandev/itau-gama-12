package exercicios.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lulu", "rottweiler", 2015, "Marcos", "(11) 1234-5678");

        System.out.println(animal1.getDados());

        
        Proprietario pr1 = new Proprietario("Gisele", "(11) 1234-5678");

        Animal animal2 = new Animal("Lessie", "Lessie", 2020, pr1);

        System.out.println(animal2.getDados());

    }
}
