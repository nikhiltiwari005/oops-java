package oops.encapsulation;

public class Example2 {

    public static void main(String[] args) {
        BankAccount ba = (new Example2()).new BankAccount("John", 100.00);
        ba.deposit(10);
        System.out.println(ba.getAccountHolder() + " " +ba.getBalance());
    }

    public class BankAccount {
        private String accountHolder;
        private double balance;

        public BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Invalid withdraw amount");
            }
        }
    }
}