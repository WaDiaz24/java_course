package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Ranking de videojuegos (Acceso por índice)
Objetivo
Obtener y reemplazar elementos específicos.

Enunciado
Crea una lista con el Top 3 de tus juegos favoritos.

Imprime el juego que está en el puesto #1 (índice 0).
El juego en el puesto #2 ha sido superado por uno nuevo: usa .set()
para cambiar el nombre del segundo juego por otro diferente.
 */
public class ExerciseFive {
    public static void main(String[] args) {
        List<String> juegosFavoritos = new ArrayList<>();
        juegosFavoritos.add("The Legend of Zelda: Breath of the Wild");
        juegosFavoritos.add("Super Mario Odyssey");
        juegosFavoritos.add("Red Dead Redemption 2");
        System.out.println("Juego en el puesto #1: " + juegosFavoritos.get(0));
        juegosFavoritos.set(1, "Hollow Knight");
        System.out.println("Lista de juegos favoritos actualizada: " + juegosFavoritos);
    }
}
