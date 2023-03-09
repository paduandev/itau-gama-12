package exercicio02.modelos;

public class Circulo extends FiguraGeometrica {
    private static final double PI = 3.1415;
    private double raio;

    public Circulo(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * raio * raio;
    }
}
