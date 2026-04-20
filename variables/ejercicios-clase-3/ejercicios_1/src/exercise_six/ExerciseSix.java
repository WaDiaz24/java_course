package exercise_six;

public class ExerciseSix {
    public static void main(String[] args) {
        double valorTotal = 34;
        double porcentajeDescuento = 15;

        double valorSinDescuento = valorTotal / (1 - porcentajeDescuento / 100);
        System.out.printf("Valor sin descuento: %.2f€%n", valorSinDescuento);
    }
}
