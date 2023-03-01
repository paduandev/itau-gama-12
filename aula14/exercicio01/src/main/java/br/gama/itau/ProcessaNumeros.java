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

    public int getMaximo(ArrayList<Integer> lista) {
        return Collections.max(lista);
    }

    public int getSize(ArrayList<Integer> lista) {
        return lista.size();
    }

    public double getMedia(ArrayList<Integer> lista) {
        double media = 0;

        // soma todos os valores
        for (Integer numero : lista) {
            media += numero; // media = media + numero;
        }
        // divide pela quantidade de valores
        // media = media / lista.size();
        media /= lista.size();

        return media;
    }

}
