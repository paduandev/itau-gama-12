package exercicios.exercicio03;

public class Veiculo {
    private String marca, modelo;
    private double consumo;

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }

}
