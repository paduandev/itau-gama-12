package br.gama.itau;

import java.util.ArrayList;
import java.util.Collections;

public class ProcessaNumeros {
    
    public int getMinimo(ArrayList<Integer> lista) {
        // int minimo = lista.get(0);

        // for (Integer numero : lista) {
        //     if(numero < minimo) {
        //         minimo = numero;
        //     }
        // }
        // return minimo;

        return Collections.min(lista);
    }

}
