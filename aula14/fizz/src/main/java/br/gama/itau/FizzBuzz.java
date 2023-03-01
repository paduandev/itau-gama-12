package br.gama.itau;

public class FizzBuzz {

    public String converte(int numero) {
        // verifica se é multiplo de 3 E 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        }
        // verifica se o resto da divisão por 3 é zero
        // ou seja, se é multipo de 3
        if (numero % 3 == 0) {
            return "Fizz";
        }
        if (numero % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(numero);
    }

}
