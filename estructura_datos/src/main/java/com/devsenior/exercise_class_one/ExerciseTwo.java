package com.devsenior.exercise_class_one;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<String> invitados = new ArrayList<>();
        invitados.add("Ana");
        invitados.add("Pedro");
        invitados.add("Lucia");
        System.out.println("Lista de invitados: " + invitados);
        invitados.remove("Pedro");
        System.out.println("Lista de invitados después de eliminar a Pedro: " + invitados);
        boolean existAna = invitados.contains("Ana");
        System.out.println("¿Ana está en la lista de invitados? " + existAna);
    }
}