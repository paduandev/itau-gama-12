package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    // Indica que vamos executar este método uma única vez
    // Antes do início dos testes (desta classe)
    @BeforeAll
    static void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void NumeroInteiro_NumeroValido_retornaTextoNumero() {
        // preparação
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
        int entrada = 3;
        String esperado = "Fizz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe5_NumeroValido_retornaBuzz() {
        // preparação
        int entrada = 5;
        String esperado = "Buzz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe3E5_NumeroValido_retornaFizzBuzz() {
        // preparação
        int entrada = 15;
        String esperado = "FizzBuzz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }
}
