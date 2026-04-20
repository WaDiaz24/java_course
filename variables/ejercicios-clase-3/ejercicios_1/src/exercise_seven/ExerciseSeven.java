package exercise_seven;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:  ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:  ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultados: ");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("Dividir: " + (num1 / num2));
    }
}
