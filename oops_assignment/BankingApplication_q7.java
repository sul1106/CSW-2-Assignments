package oops_assignment;
abstract class Account {
    private int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount.java
 class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("$" + amount + " deposited with interest. New balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

// CurrentAccount.java
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited. New balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
        } else {
            System.out.println("Exceeds overdraft limit. Withdrawal denied.");
        }
    }
}

// BankingApplication.java (Main class)
public class BankingApplication_q7 {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(1001, 5000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(2001, 3000, 1000);

        // Testing deposit and withdrawal operations
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(6000); // Should display insufficient funds message

        System.out.println(); // Separator

        currentAccount.deposit(2000);
        currentAccount.withdraw(500);
        currentAccount.withdraw(4000); // Should display overdraft limit message

        // Displaying account details
        System.out.println("\nSavings Account Details:");
        savingsAccount.display();

        System.out.println("\nCurrent Account Details:");
        currentAccount.display();
    }
}