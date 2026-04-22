import exception.AuthenticationException;

public class AuthenticationService {

    public void authenticate(Account account, String clave) throws AuthenticationException {
        if (account.getClave().equals(clave)) {
            System.out.println("Authentication successful for account: " + account.getAccountNumber());
        } else {
            throw new AuthenticationException("Authentication failed for account: " + account.getAccountNumber());
        }
    }
}
