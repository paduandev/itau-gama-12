package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    

    // @BeforeAll
    @BeforeEach
    static void setup() {
        System.out.println("Preparando....");
    }


    @ParameterizedTest
    @CsvSource({"10,20", "0,-2", "0,0"})
    public void soma_retornaASoma_quandoDoisValoresValidos(int valor1, int valor2) {
        //preparação
        int esperado = valor1 + valor2; 

        // execução
        int resposta = Calculadora.soma(valor1, valor2);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    @DisplayName("valida diferença entre números")
    public void subtracao_retornaADiferenca_quandoDoisValoresValidos() {
        // preparação
        int valor1 = 20;
        int valor2 = 10;

        // execução
        int resposta = Calculadora.subtracao(valor1, valor2);

        // verificação
        assertEquals(10, resposta);
    }

    @Test
    public void multiplicacao_retornaOProduto_quandoDoisValoresValidos() {
        // preparação
        int valor1 = 20;
        int valor2 = 10;

        // execução
        int resposta = Calculadora.multiplicacao(valor1, valor2);

        // verificação
        assertEquals(200, resposta);
    }

    @Test
    public void divisao_retornaDivisao_quandoDoisValoresValidos() {
        // preparação
        int valor1 = 20;
        int valor2 = 10;

        // execução
        int resposta = Calculadora.divisao(valor1, valor2);

        // verificação
        assertEquals(2, resposta);
    }

    @Test
    public void divisao_retornaDivisaoInteira_quandoONumeradorNaoForDivisivel() {
        // preparação
        int valor1 = 15;
        int valor2 = 2;

        // execução
        int resposta = Calculadora.divisao(valor1, valor2);

        // verificação
        assertEquals(7, resposta);
    }

    @Test
    public void divisao_retornaZero_quandoODenominadorForZero() {
        // preparação
        int valor1 = 15;
        int valor2 = 0;

        // execução
        int resposta = Calculadora.divisao(valor1, valor2);

        // verificação
        assertEquals(0, resposta);
    }

}
