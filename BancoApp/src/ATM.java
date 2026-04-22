import exception.InsufficientBalanceException;
import exception.InvalidAmount;

public class ATM {

    public void processWithdrawal(Account account, double amount) throws InsufficientBalanceException, InvalidAmount {
        account.withdraw(amount);
    }

    public void processDeposit(Account account, double amount) throws InvalidAmount {
        account.deposit(amount);
    }

    public void processTransfer(Account fromAccount, Account toAccount, double amount) throws InsufficientBalanceException, InvalidAmount {
        fromAccount.transfer(toAccount, amount);
    }
}
