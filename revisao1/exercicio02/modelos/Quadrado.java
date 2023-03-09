package exercicio02.modelos;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    // esta sobrescrevendo o comportamento que tinha na super
    // (ainda que não tenha implementação anterior)
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString() + " lado: " + lado;
    }
}
