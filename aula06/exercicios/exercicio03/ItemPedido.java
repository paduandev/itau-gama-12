package exercicios.exercicio03;

public class ItemPedido {
    private int numero;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(int numero, String descricao, int quantidade, double precoUnitario) {
        setNumero(numero);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        }
    }

    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    public String getDados() {
        return numero + "- " + descricao + " - " + quantidade + "  - " + precoUnitario;
    }
}
