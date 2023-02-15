package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        ItemPedido item = new ItemPedido(1234, "Mouse Gamer", 4, 80);

        System.out.println("Produto:");

        // %d = número inteiro
        // %s = String
        // %f = double ou float
        System.out.printf("%d - %s (%d) R$ %.2f\n",
                item.getNumero(),
                item.getDescricao(),
                item.getQuantidade(),
                item.getPrecoUnitario());

        System.out.printf("Valor total: R$ %.2f\n", item.getValorTotal());

        item.setQuantidade(5);

        System.out.printf("%d - %s (%d) R$ %.2f\n",
                item.getNumero(),
                item.getDescricao(),
                item.getQuantidade(),
                item.getPrecoUnitario());

        System.out.printf("Valor total: R$ %.2f\n", item.getValorTotal());

        System.out.println(item.getDados());

    }
}
