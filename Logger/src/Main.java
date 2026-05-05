import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setFormatter(new MiFormato());
            logger.addHandler(fileHandler);

            FileHandler fileHandlerInfo = new FileHandler("info.log", true);
            fileHandlerInfo.setFormatter(new MiFormato());
            fileHandlerInfo.setLevel(Level.INFO);
            logger.addHandler(fileHandlerInfo);

            FileHandler fileHandlerError = new FileHandler("error.log", true);
            fileHandlerError.setFormatter(new MiFormato());
            fileHandlerError.setLevel(Level.SEVERE);
            logger.addHandler(fileHandlerError);

            AuthService authService = new AuthService();

            Scanner sc = new Scanner(System.in);

            System.out.print("Usuario: ");
            String user = sc.nextLine();

            System.out.print("Contraseña: ");
            String password = sc.nextLine();

            authService.login(user, password);

            System.out.println("Acceso concedido");

        } catch (AuthException e) {
            logger.severe("Error de autenticación: " + e.getMessage());
            System.out.println("Acceso denegado: " + e.getMessage());

        } catch (IOException e) {
            logger.severe("Error al configurar archivo de logs");
            e.printStackTrace();
        }
    }
}