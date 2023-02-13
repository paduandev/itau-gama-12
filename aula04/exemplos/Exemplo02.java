package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {
        int calculo;

        calculo = soma(5, 7);

        System.out.println(calculo);
    }

    static int soma(int numero1, int numero2) {
        int resultado;

        resultado = numero1 + numero2;

        return resultado;
    }

}
