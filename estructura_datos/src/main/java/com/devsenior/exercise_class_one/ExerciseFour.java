package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFour {
    public static void main(String[] args) {
        List<Double> precios = new ArrayList<>();
        precios.add(15.99);
        precios.add(5.50);
        precios.add(42.0);
        precios.add(10.0);
        precios.forEach(precio -> System.out.println("Precio: " + precio));
        double sumaTotal = 0.0;
        for (double precio: precios) {
            sumaTotal = sumaTotal + precio;
        }
        System.out.printf("Total a pagar: $%.2f%n", sumaTotal);
    }
}
