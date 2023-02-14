package exercicios.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        final int TAM_MAX = 10;

        // Area area = new Area();
        // Area area = new Area( 300, 400 );

        Area area = new Area(TAM_MAX);
        Robo robo = new Robo(area);

        System.out.println("Posição atual: " + robo.posicaoAtual());
        robo.navegar(Direcao.NORTE);
        System.out.println("Posição atual: " + robo.posicaoAtual());
        
        for (int i = 0; i < TAM_MAX + 2; i++) {
            robo.navegar(Direcao.SUL);
            System.out.println("Posição atual: " + robo.posicaoAtual());
        }
    }
}
