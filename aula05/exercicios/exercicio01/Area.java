package exercicios.exercicio01;

public class Area {
    private final int MAX_DEFAULT = 100;
    private int limiteX, limiteY;

    public Area() {
        limiteX = MAX_DEFAULT;
        limiteY = MAX_DEFAULT;
    }

    public Area(int limite) {
        if(limite > 0) {
            limiteX = limite;
            limiteY = limite;
        }
    }

    public Area(int limiteX, int limiteY) {
        if(limiteX > 0 && limiteY > 0) {
            this.limiteX = limiteX;
            this.limiteY = limiteY;
        }
    }

    public int getLimiteX() {
        return limiteX;
    }

    public int getLimiteY() {
        return limiteY;
    }
}
