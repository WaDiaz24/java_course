package com.devsenior;

public class Perro implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Guau Guau");
    }

    @Override
    public void eat() {
        System.out.println("El perro está comiendo.");
    }

    public void fetch() {
        System.out.println("El perro está buscando la pelota.");
    }
}
