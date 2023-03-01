package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void NumeroInteiro_NumeroValido_retornaTextoNumero() {
        // preparação
        FizzBuzz fizzBuzz = new FizzBuzz();
        int entrada = 1;
        String esperado = "1";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe3_NumeroValido_retornaFizz() {
        // preparação
        FizzBuzz fizzBuzz = new FizzBuzz();
        int entrada = 3;
        String esperado = "Fizz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }
}
