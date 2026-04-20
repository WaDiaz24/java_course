package exercise_five;

public class ExerciseFive {
    public static void main(String[] args) {
        double valorTotal = 660;
        double porcentajeDescuento = 10;

        double valorAPagar = valorTotal * (1 - porcentajeDescuento / 100);
        System.out.printf("Valor Pagado: %.2f€%n", valorAPagar);
    }
}
