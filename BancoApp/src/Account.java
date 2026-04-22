import exception.InsufficientBalanceException;
import exception.InvalidAmount;

public class Account {
    private final String accountNumber;
    private double balance;
    private String clave;

    public Account(String accountNumber, double balance, String clave) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clave = clave;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getClave() {
        return clave;
    }

    public void deposit(double amount) throws InvalidAmount {
        if (amount <= 0) {
            throw new InvalidAmount("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmount {
        if (amount <= 0) {
            throw new InvalidAmount("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
    }

    public void transfer(Account targetAccount, double amount) throws InsufficientBalanceException, InvalidAmount {
        if (amount <= 0) {
            throw new InvalidAmount("Transfer amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for transfer.");
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
}
