package com.devsenior.exercise_class_two;
/*
Correos únicos para campaña de marketing
Una empresa va a enviar una campaña de correos a sus usuarios.

El problema es que muchos correos vienen repetidos desde distintos sistemas.

Tu tarea será construir un programa que elimine automáticamente los duplicados.

Lo que debes practicar
Crear un HashSet
Usar add()
Recorrer elementos con for-each
Ver cómo HashSet evita duplicados automáticamente

 */


import java.util.HashSet;

public class ExerciseOne {

    public static void main(String[] args) {
        HashSet<String> correos = new HashSet<>();
        correos.add("correo1@gmail.com");
        correos.add("correo2@gmail.com");
        correos.add("correo3@gmail.com");
        correos.add("correo3@gmail.com");
        System.out.println("Lista de correos únicos: ");
        for (String correo : correos) {
            System.out.println(correo);
        }
        System.out.println("Cantidad de correos únicos: " + correos.size());
    }
}
