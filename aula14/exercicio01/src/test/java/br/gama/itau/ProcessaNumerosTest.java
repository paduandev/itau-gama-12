package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ProcessaNumerosTest {

    @Test
    void listaNumeros_listaContemValores_retornaOMinimo() {
        ProcessaNumeros pn = new ProcessaNumeros();
        ArrayList<Integer> lista = new ArrayList<>();
        int menorEsperado = 3;

        lista.add(5);
        lista.add(4);
        lista.add(menorEsperado);
        lista.add(7);

        int resposta = pn.getMinimo(lista);

        assertEquals(menorEsperado, resposta);
    }
}
