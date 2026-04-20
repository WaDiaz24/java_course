package exercise_eight;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un rectangulo:  ");
        double longitud = scanner.nextDouble();
        System.out.println("Ingrese el ancho de un rectangulo:  ");
        double ancho = scanner.nextDouble();
        System.out.println("Resultados: ");
        System.out.println("Area: " + (longitud * ancho));
        System.out.println("Perimetro: " + 2*(longitud + ancho));
    }
}
