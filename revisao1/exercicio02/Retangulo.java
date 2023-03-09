package exercicio02;

public class Retangulo extends Quadrado {
    private double lado2;

    public Retangulo(int x, int y, double lado, double lado2) {
        super(x, y, lado);
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return getLado() * lado2;
    }

    @Override
    public String toString() {
        return super.toString() + " lado2 = " + lado2;
    }
}
