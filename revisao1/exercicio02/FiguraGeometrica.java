package exercicio02;

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
        return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
    }

    // método abstrato DEVE obrigatoriamente ser implementado nas classes filho
    public abstract double area();
}
