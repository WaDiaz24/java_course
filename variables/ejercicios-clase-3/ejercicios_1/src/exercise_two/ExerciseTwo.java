package exercise_two;

public class ExerciseTwo {
    public static void main(String[] args) {
        double precioPorcion = 5.95;
        int gramos = 100;
        double precioVendedor = 29.75;

        double precioKiloCorrecto = precioPorcion * (1000.0 / gramos);
        System.out.printf("Precio calculado por kilo: %.2f€%n", precioKiloCorrecto);
        System.out.printf("Precio indicado por el vendedor: %.2f€%n", precioVendedor);

        String resultado = (precioKiloCorrecto == precioVendedor)
                ? "El precio por kilo es correcto"
                : "El precio por kilo es incorrecto";
        System.out.println(resultado);
    }
}
