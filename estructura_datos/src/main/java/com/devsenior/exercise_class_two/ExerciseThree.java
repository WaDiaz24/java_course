package com.devsenior.exercise_class_two;
/*
Sistema de cupones de e-commerce
Una tienda online quiere evitar que un cupón se use dos veces.

Cada vez que un usuario intenta usar un cupón:

si ya fue usado → rechazar,
si no existe → permitir.
 */

import java.util.HashSet;

public class ExerciseThree {
    public static void main(String[] args) {
        HashSet<String> cuponesValidos = new HashSet<>();
        String cuponIngresado = "DESCUENTO100"; // Simulación de un cupón ingresado por el usuario
        cuponesValidos.add("DESCUENTO10");
        cuponesValidos.add("ENVIOGRATIS");
        cuponesValidos.add("PRIMAVERA20");

        boolean cuponValido = false;
        for (String cupon : cuponesValidos) {
            if (cupon.contains(cuponIngresado)) {
                cuponValido = true;
                break;
            }
        }
        cuponesValidos.add("DESCUENTO10");

        if (cuponValido) {
            System.out.println("Cupón válido. ¡Descuento aplicado!");
        } else {
            System.out.println("Cupón inválido o ya usado. No se puede aplicar el descuento.");
        }
    }
}
