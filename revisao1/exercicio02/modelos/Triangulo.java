package exercicio02.modelos;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

}
