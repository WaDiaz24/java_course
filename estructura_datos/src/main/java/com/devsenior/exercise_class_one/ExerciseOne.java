package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {

    public static void main(String[] args) {
        List<String> deseos = new ArrayList<>();
        deseos.add("Comprar un coche");
        deseos.add("Viajar a Japón");
        deseos.add(1,"Aprender a tocar la guitarra");
        deseos.add("Tener una casa en la playa");
        System.out.println("Lista de deseos: " + deseos);
        System.out.println("Cantidad de deseos: " + deseos.size());
        deseos.forEach(deseo -> System.out.println("Deseo: " + deseo));

    }
}
