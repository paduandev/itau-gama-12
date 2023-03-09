package exercicio02.modelos;

import exercicio02.midias.Midia;

// classe abstrata não instancia objeto
public abstract class FiguraGeometrica {
    private int x, y;

    public FiguraGeometrica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]" + " area: " + area();
    }

    // inversão de controle
    public void mostrarDados(Midia midia) {
        midia.exibir(this.toString());
    }

    // método abstrato DEVE obrigatoriamente ser implementado nas classes filho
    public abstract double area();
}
