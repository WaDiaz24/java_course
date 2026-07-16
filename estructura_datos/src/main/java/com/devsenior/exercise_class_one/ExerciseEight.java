package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Sorteo rápido (Uso de Collections.sort)
Objetivo
Ordenar una lista alfabética o numéricamente.

Enunciado
Crea una lista de frutas desordenadas:

"Pera", "Manzana", "Ananá", "Uva"
Usa la clase utilidad Collections para ordenar la lista alfabéticamente e imprímela.
 */
public class ExerciseEight {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Ananá");
        frutas.add("Uva");

        System.out.println("Lista de frutas desordenadas: " + frutas);

        Collections.sort(frutas);

        System.out.println("Lista de frutas ordenadas alfabéticamente: " + frutas);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        System.out.println("Lista de números desordenados: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista de números ordenados: " + numeros);
    }
}
