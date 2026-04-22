import exception.InsufficientBalanceException;
import exception.InvalidAmount;

public class BancoApp {
    private ATM atm;

    public BancoApp() {
        this.atm = new ATM();
    }

    public void performWithdrawal(Account account, double amount) throws InsufficientBalanceException, InvalidAmount {
        atm.processWithdrawal(account, amount);
    }

    public void performDeposit(Account account, double amount) throws InvalidAmount {
        atm.processDeposit(account, amount);
    }

    public void performTransfer(Account fromAccount, Account toAccount, double amount) throws InsufficientBalanceException, InvalidAmount {
        atm.processTransfer(fromAccount, toAccount, amount);
    }
}
