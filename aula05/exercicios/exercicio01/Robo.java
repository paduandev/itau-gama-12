package exercicios.exercicio01;

public class Robo {
    private final int MAX_DEFAULT = 1000;
    private int posX, posY;
    private int max;

    public Robo(int max) {
        if(max > 0) {
            this.max = max;
        } else {
            this.max = MAX_DEFAULT;
        }
    }

    public void moverNorte() {
        if(posY < max) {
            posY++;
        }
    }

    public void moverSul() {
        if(posY > -max) {
            posY--;
        }
    }
    
    public void moverLeste() {
        if(posX < max) {
            posX++;
        }
    }
    
    public void moverOeste() {
        if(posX > -max) {
            posX--;
        }
    }

    public String posicaoAtual() {
        return "x: " + posX + " y: " + posY;
    }


}