package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("BMW", "X1", -7.5);

        meuCarro.exibir();

        //meuCarro.consumo = -7;  não é permitido, pois o atributo é privado
        meuCarro.setConsumo(6);

        System.out.println("Consumo: " + meuCarro.getConsumo());
    }
}
