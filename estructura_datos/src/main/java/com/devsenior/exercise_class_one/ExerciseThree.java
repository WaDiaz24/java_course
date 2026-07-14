package com.devsenior.exercise_class_one;

import java.util.LinkedList;
import java.util.List;

public class ExerciseThree {
    public static void main(String[] args) {
        List<Double>  tiempos = new LinkedList<>();
        tiempos.add(12.5);
        tiempos.add(13.2);
        tiempos.add(11.8);
        tiempos.add(0, 10.9);
        System.out.println("Lista de tiempos: " + tiempos);
    }
}
