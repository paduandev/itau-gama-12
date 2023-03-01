package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    // padrão de nomes de métodos de teste
    // given-when-then: Dado quê - Quando - Então
    // DadosDoisInteiros_ExcuitaASoma_retorneASoma

    // Outro padrão: nomeMétodo_Cenário_ResutladoEsperado

    @BeforeEach // esta anotação faz o método executar antes de cada teste
    void setupEach() {
        System.out.println("Preparando antes de cada Teste");
    }

    @BeforeAll // esta anotação faz o método executar 1 vez apenas no iníco dos testes
    static void setupAll() {
        System.out.println("Preparando antes de Todos (1 vez)");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando depois de todos (1 vez)");
    }

    @AfterEach
    void tearDownEachl() {
        System.out.println("Finalizando mais um teste");
    }

    @ParameterizedTest // indica que o teste será executados várias vezes com valores diferentes
    @CsvSource({"10,20", "0,-2", "0,0"}) // valores de entrada do teste
    public void soma_retornaASoma_quandoDoisValoresValidos(int valor1, int valor2) {
        //preparação
        int esperado = valor1 + valor2; 

        // execução
        int resposta = Calculadora.soma(valor1, valor2);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test // anotação indicando que este método é um Teste
    @DisplayName("valida diferença entre números") // Complemento de exibição dos resultados
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
