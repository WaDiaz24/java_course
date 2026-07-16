package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

/*
Conversión de Array a List (Interoperabilidad)
Objetivo
Aprender a transformar un arreglo estático en una lista dinámica.

Enunciado
Tienes un arreglo fijo:

String[] colores = {"Rojo", "Verde", "Azul"};
Convierte ese arreglo en una ArrayList llamada listaColores. Luego, añade un color más ("Amarillo") para demostrar que ahora la lista sí puede crecer.


 */
public class ExerciseTen {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul"};
        List<String> listaColores = new ArrayList<>();
        listaColores.addAll(List.of(colores));
        System.out.println("Lista de colores inicial: " + listaColores);
        listaColores.add("Amarillo");
        System.out.println("Lista de colores después de agregar 'Amarillo': " + listaColores);
    }
}
