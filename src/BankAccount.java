public class BankAccount {
    //private variables
    private String accountNumber;
    private double balance;

    //public methods
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setBalance(1000);
        myAccount.deposit(500);
        System.out.println("Current balance: " + myAccount.getBalance());
        myAccount.withdraw(800);
        System.out.println("Current balance: " + myAccount.getBalance());

    }
}