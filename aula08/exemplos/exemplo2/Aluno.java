package exemplos.exemplo2;

public class Aluno extends Pessoa {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDados() {
        return getNome() + " - " + numero;
    }
}
