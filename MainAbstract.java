abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        System.out.println("Abstract BankAccount constructor called");
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    abstract void calculateInterest();

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void deposit(double amount, String note) {
        this.balance += amount;
        System.out.println("Deposited ₹" + amount + " | Note: " + note);
    }
}

class SavingsAccount extends BankAccount {
    private final double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Savings Interest: ₹" + interest);
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }

    void displayAccountType() {
        System.out.println("This is a Current Account");
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Pavithran", 10000, 5.5);
        BankAccount acc2 = new CurrentAccount("Karthik", 20000, 5000);

        acc1.displayDetails();
        acc1.calculateInterest(); // runtime polymorphism
        acc1.deposit(2000);
        acc1.deposit(1000, "Monthly Savings");

        System.out.println();

        acc2.displayDetails();
        acc2.calculateInterest(); // overridden version
        acc2.deposit(5000);

        if (acc1 instanceof SavingsAccount savingsAccount) {
            savingsAccount.displayAccountType();
        }

        if (acc2 instanceof CurrentAccount currentAccount) {
            currentAccount.displayAccountType();
        }
    }
}
