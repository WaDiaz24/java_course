import java.util.logging.Logger;

public class AuthService {
    private static final Logger logger = Logger.getLogger(AuthService.class.getName());

    public void login(String usuario, String password) throws AuthException {

        logger.info("Intentando autenticar usuario: " + usuario);

        if (usuario == null || password == null) {
            logger.warning("Usuario o contraseña nulos");
            throw new AuthException("Datos de acceso inválidos");
        }

        if (!usuario.equals("admin") || !password.equals("1234")) {
            logger.warning("Credenciales incorrectas para usuario: " + usuario);
            throw new AuthException("Credenciales incorrectas");
        }

        logger.info("Usuario autenticado correctamente: " + usuario);
    }
}
