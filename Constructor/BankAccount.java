class BankAccount {
    private double balance;

    void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(2000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}
