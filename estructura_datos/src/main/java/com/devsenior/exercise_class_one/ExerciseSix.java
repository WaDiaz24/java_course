package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

/*
Filtro de nombres cortos (Condicionales y Remoción)
Objetivo
Filtrar una lista basándose en una condición.

Enunciado
Crea una lista con nombres de ciudades:

{"Bogotá", "Lima", "Rio", "La Paz", "Cali"}
Recorre la lista y, si el nombre de la ciudad tiene 4 letras o menos, imprímelo indicando que es una:

Ciudad de nombre corto

 */
public class ExerciseSix {
    public static void main(String[] args) {
        List<String> ciudades = new  ArrayList<>();
        ciudades.add("Bogotá");
        ciudades.add("Lima");
        ciudades.add("Rio");
        ciudades.add("La Paz");
        ciudades.add("Cali");

        for (String ciudad : ciudades) {
            if (ciudad.length() <= 4) {
                System.out.println("Ciudad de nombre corto: " + ciudad);
            }
        }
        ciudades.forEach(ciudad -> {
            if (ciudad.length() <= 4) {
                System.out.println("Ciudad de nombre corto: " + ciudad);
            }
        });
    }
}
