package com.devsenior.exercise_class_two;
/*
Dispositivos conectados a una aplicación
Una aplicación móvil registra dispositivos que se conectan durante el día.

Un mismo dispositivo puede conectarse muchas veces.

El sistema necesita saber:

cuáles dispositivos únicos entraron,
y verificar rápidamente si un dispositivo ya estaba registrado.
 */

import java.util.HashSet;

public class ExerciseTwo {
    public static void main(String[] args) {

        HashSet<String> dispositivosConectados = new HashSet<>();
        dispositivosConectados.add("Dispositivo1");
        dispositivosConectados.add("Dispositivo2");
        dispositivosConectados.add("Dispositivo1"); // Intento de duplicado
        dispositivosConectados.add("Dispositivo3");

        System.out.println(dispositivosConectados.contains("Dispositivo2") ? "Dispositivo2 ya estaba registrado." : "Dispositivo2 es un nuevo dispositivo.");
        System.out.println("Cantidad de dispositivos únicos: " + dispositivosConectados.size());
    }
}