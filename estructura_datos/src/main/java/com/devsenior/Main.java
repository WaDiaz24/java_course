package com.devsenior;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal perro = new Perro();
        perro.makeSound();
        perro.eat();
        ((Perro)perro).fetch(); // This line will cause a compile-time error because the fetch() method is not defined in the Animal interface.
    }
}