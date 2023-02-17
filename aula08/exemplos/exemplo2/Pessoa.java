package exemplos.exemplo2;

// abstract = classe que não pode gerar objetos
// ele é apenas um modelo
public abstract class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato obriga todas as classes
    // filhas a escreverem esse método
    public abstract String getDados();
}
