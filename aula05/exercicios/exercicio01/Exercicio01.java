package exercicios.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        final int TAM_MAX = 10;
        Robo robo = new Robo(TAM_MAX);

        System.out.println("Posição atual: " + robo.posicaoAtual());
        
        for (int i = 0; i < TAM_MAX + 2; i++) {
            robo.moverSul();
            System.out.println("Posição atual: " + robo.posicaoAtual());
        }
    }
}
