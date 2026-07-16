package com.devsenior.exercise_class_one;

import java.util.LinkedList;
import java.util.List;

/*
Fila del Banco - Triage (Uso de métodos de LinkedList)
Objetivo
Usar métodos específicos de la implementación LinkedList.

Enunciado
Crea una LinkedList de clientes.

Agrega a "Cliente A" y "Cliente B".
Llega un "Cliente VIP": agrégalo al puro inicio con .addFirst().
Atiende al primer cliente de la fila eliminándolo con .removeFirst() y muestra quién fue atendido.
 */
public class ExerciseNine {
    public static void main(String[] args) {
        LinkedList<String> clientes = new LinkedList<>();

        clientes.add("Cliente A");
        clientes.add("Cliente B");

        System.out.println("Fila de clientes: " + clientes);

        // Llega un cliente VIP
        clientes.addFirst("Cliente VIP");
        System.out.println("Fila de clientes después de agregar al Cliente VIP: " + clientes);

        // Atender al primer cliente
        String clienteAtendido = clientes.removeFirst();
        System.out.println("Atendiendo a: " + clienteAtendido);
        System.out.println("Fila de clientes después de atender al primer cliente: " + clientes);
    }
}
