package br.gama.itau;

public class FizzBuzz {

    public String converte(int numero) {
        // verifica se o resto da divisão por 3 é zero
        // ou seja, se é multipo de 3
        if(numero % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(numero);
    }

}
