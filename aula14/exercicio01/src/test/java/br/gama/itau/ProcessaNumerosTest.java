package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProcessaNumerosTest {

    private static ProcessaNumeros pn;
    private static ArrayList<Integer> lista;

    @BeforeAll
    static void setup() {
        pn = new ProcessaNumeros();
        lista = new ArrayList<>();
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(7);
    }

    @Test
    void listaNumeros_listaContemValores_retornaOMinimo() {
        int menorEsperado = 3;

        int resposta = pn.getMinimo(lista);

        assertEquals(menorEsperado, resposta);
    }
    
    @Test
    void listaNumeros_listaContemValores_retornaOMaximo() {
        int maiorEsperado = 7;

        int resposta = pn.getMaximo(lista);

        assertEquals(maiorEsperado, resposta);
    }
    
    @Test
    void listaNumeros_listaContemValores_retornaQuantidadeNumeros() {
        int quantidadeEsperada = 4;

        int resposta = pn.getSize(lista);

        assertEquals(quantidadeEsperada, resposta);
    }
    
    @Test
    void listaNumeros_listaContemValores_retornaMediaValores() {
        double mediaEsperada = 4.75;

        double resposta = pn.getMedia(lista);

        assertEquals(mediaEsperada, resposta);
    }

}
