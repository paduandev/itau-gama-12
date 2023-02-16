package exemplos.exemplo01;

public class Pessoa { // extends Object {
    private String nome; 

    public Pessoa() {
        nome = "Sem nome";
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getNome(String texto){
        return texto + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Pessoa: " + nome;
    }
}