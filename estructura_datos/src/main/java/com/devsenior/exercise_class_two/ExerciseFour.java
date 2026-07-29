package com.devsenior.exercise_class_two;
/*
Una plataforma necesita detectar palabras ofensivas rápidamente.

Cada mensaje debe validarse en tiempo real.

Lo que debes practicar
búsquedas rápidas con contains()
recorridos
comparación de texto

 */

import java.util.HashSet;

public class ExerciseFour {
    public static void main(String[] args) {
        boolean contienePalabraOfensiva = false;
        HashSet<String> palabrasOfensivas = new HashSet<>();
        String mensaje = "Este es un mensaje de prueba con una palabra ofensiva e insultos.";
        palabrasOfensivas.add("ofensivaa");
        palabrasOfensivas.add("insultoada");
        palabrasOfensivas.add("grosería");

        for (String palabra : palabrasOfensivas) {
            if (mensaje.contains(palabra)) {
                System.out.println("El mensaje contiene una palabra ofensiva: " + palabra);
                contienePalabraOfensiva = true;
            }
        }

        if (!contienePalabraOfensiva) {
            System.out.println("El mensaje no contiene palabras ofensivas.");
        }

    }
}
