package com.encapsulation;

public class BankApplication {
    private String bankName;
    private int totalAccounts;
    private BankAccount[] accounts;

    public BankApplication(String bankName) {
        setBankName(bankName);
        this.totalAccounts = 0;
        this.accounts = new BankAccount[100];
    }

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (totalAccounts < accounts.length) {
            BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
            accounts[totalAccounts] = account;
            totalAccounts++;
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Maximum number of accounts reached!");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            BankAccount account = accounts[i];
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void printAccountDetails(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
//            account.printAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    // Setters and Getters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {
        BankApplication bank = new BankApplication("My Bank");

        bank.createAccount("1234567890", "John Doe", 1000.0);
        bank.createAccount("9876543210", "Jane Smith", 500.0);

        bank.deposit("1234567890", 500.0);
        bank.withdraw("9876543210", 200.0);

        bank.printAccountDetails("1234567890");
        bank.printAccountDetails("9876543210");
        bank.printAccountDetails("1111111111"); // Account not found!

        System.out.println("Total accounts in " + bank.getBankName() + ": " + bank.getTotalAccounts());
    }
}

