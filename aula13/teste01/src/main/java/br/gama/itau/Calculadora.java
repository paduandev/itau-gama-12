package br.gama.itau;

public class Calculadora {

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicacao(int n1, int n2) {
        return n1 * n2;
    } 

    public static int divisao(int n1, int n2) {
        if(n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }
}
