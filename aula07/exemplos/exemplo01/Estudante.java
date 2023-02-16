package exemplos.exemplo01;

public class Estudante extends Pessoa {
    public Estudante() {
        
    }
    public Estudante(String nome) {
       super(nome); // super = superclasse Pessoa(nome)
    }

    public String toString() {
        return "Estudante: " + getNome();
    }
} 
