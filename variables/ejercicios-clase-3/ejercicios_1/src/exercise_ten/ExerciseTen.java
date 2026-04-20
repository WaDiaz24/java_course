package exercise_ten;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:  ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:  ");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer número:  ");
        double num3 = scanner.nextDouble();
        System.out.println("Media Aritmetica: " + ((num1 + num2 + num3) / 3));
    }
}
