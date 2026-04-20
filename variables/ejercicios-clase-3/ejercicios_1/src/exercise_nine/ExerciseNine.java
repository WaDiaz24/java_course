package exercise_nine;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celsius:  ");
        double gradosCelsius = scanner.nextDouble();
        System.out.println("Resultados: ");
        System.out.println("Grados Fahrenheit: " + (gradosCelsius * (9/5)+32));
        System.out.println("Grados Kelvin: " + (gradosCelsius + 273.15));
    }
}
