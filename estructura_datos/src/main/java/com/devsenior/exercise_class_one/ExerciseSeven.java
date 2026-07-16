package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

/*
 Limpieza de base de datos (Método clear y isEmpty)
Objetivo
Aprender a vaciar colecciones y verificar su estado.

Enunciado
Simula una lista de mensajesPendientes con 3 textos.

Imprime si la lista tiene mensajes.
Vacía la lista por completo.
Vuelve a comprobar si está vacía e imprime un mensaje confirmando que:
Bandeja de entrada limpia
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        List<String> mensajesPendientes = new ArrayList<>();
        mensajesPendientes.add("Mensaje 1");
        mensajesPendientes.add("Mensaje 2");
        mensajesPendientes.add("Mensaje 3");

        System.out.println("¿La lista tiene mensajes? " + (!mensajesPendientes.isEmpty() ? "Sí" : "No"));

        mensajesPendientes.clear();
        System.out.println("¿La lista tiene mensajes? " + (!mensajesPendientes.isEmpty() ? "Sí" : "No"));

        if (mensajesPendientes.isEmpty()) {
            System.out.println("Bandeja de entrada limpia");
        }
    }
}
