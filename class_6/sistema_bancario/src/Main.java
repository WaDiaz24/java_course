import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static double saldo = 1000.00;

    public static void main(String[] args) {
        int accountNumber = 12345;
        String clave = "2026";
        int numberOfAttempts = 3;
        int option;

        System.out.println("Bienvenido al sistema de banca en línea.");
        System.out.print("Ingrese su número de cuenta: ");
        int inputAccountNumber = scanner.nextInt();
        System.out.print("Ingrese su clave: ");
        String inputClave = scanner.next();

        if (inputAccountNumber == accountNumber && inputClave.equals(clave)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, cliente " + accountNumber + "!");
        } else {
            for (int i = 1; i <= numberOfAttempts; i++) {
                System.out.println("Número de cuenta o clave incorrectos. Intento " + i + " de " + numberOfAttempts + ".");
                System.out.print("Ingrese su número de cuenta: ");
                inputAccountNumber = scanner.nextInt();
                System.out.print("Ingrese su clave: ");
                inputClave = scanner.next();

                if (inputAccountNumber == accountNumber && inputClave.equals(clave)) {
                    System.out.println("Inicio de sesión exitoso. Bienvenido, cliente " + accountNumber + "!");
                    return; // Salir del método main después de un inicio de sesión exitoso
                }
            }
            System.out.println("Número de cuenta o clave incorrectos. Se han agotado los intentos. Por favor, intente nuevamente más tarde.");
        }

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Trasferir dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            option = scanner.nextInt();
        } while (option < 1 || option > 4);

        switch (option) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;
            case 2:
                transferMoney();
                break;
            case 3:
                withdrawMoney();
                break;
            case 4:
                System.out.println("Gracias por usar nuestro servicio. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
        }
    }

    public static void transferMoney() {
        int destinationAccount;
        double amountToTransfer;

        System.out.println("Transferencia de dinero");
        System.out.print("Ingrese el número de cuenta de destino: ");
        destinationAccount = scanner.nextInt();
        System.out.print("Ingrese el monto a transferir: ");
        amountToTransfer = scanner.nextDouble();

        if (amountToTransfer <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return;
        }

        if (amountToTransfer > saldo) {
            System.out.println("Fondos insuficientes para realizar la transferencia.");
        } else {
            saldo -= amountToTransfer;
            System.out.printf("Transferencia a la cuenta %d exitosa. Su nuevo saldo es: $%.2f%n", destinationAccount, saldo);
        }
    }

    public static void withdrawMoney() {
        double amountToWithdraw;

        System.out.println("Retiro de dinero");
        System.out.print("Ingrese el monto a retirar: ");
        amountToWithdraw = scanner.nextDouble();

        if (amountToWithdraw <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return;
        }

        if (amountToWithdraw > saldo) {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        } else {
            saldo -= amountToWithdraw;
            System.out.printf("Retiro de $%.2f exitoso. Su nuevo saldo es: $%.2f%n", amountToWithdraw, saldo);
        }
    }
}