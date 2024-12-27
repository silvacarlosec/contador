package br.com.alura.contador.service;

import java.util.LinkedList;
import java.util.List;

public class GeradorSequencia {

    public List<Integer> geraSequencia(Integer numeroFinal) {
        var list = new LinkedList<Integer>();

        int acumulador = 0;

        while (acumulador < numeroFinal) {
            acumulador++;
            list.add(acumulador);
        }

        return list;
    }
}
