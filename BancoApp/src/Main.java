import exception.AuthenticationException;
import exception.InsufficientBalanceException;
import exception.InvalidAmount;

public class Main {
    public static void main(String[] args) {
        BancoApp bancoApp = new BancoApp();
        AuthenticationService authService = new AuthenticationService();


        Account account1 = new Account("123456", 1000, "123");
        Account account2 = new Account("654321", 500, "321");
        try {
            authService.authenticate(account1, "123");
            bancoApp.performDeposit(account1, 200);
            System.out.println("Account 1 Balance: " + account1.getBalance());
            bancoApp.performWithdrawal(account1, 150);
            System.out.println("Account 1 Balance: " + account1.getBalance());
            bancoApp.performTransfer(account1, account2, 300);
            System.out.println("Account 1 Balance: " + account1.getBalance());
            System.out.println("Account 2 Balance: " + account2.getBalance());

        } catch (InvalidAmount | InsufficientBalanceException | AuthenticationException e) {
            System.out.println("Error: " + e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}