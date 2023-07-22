package com.encapsulation;

public class BankAccount {
    private String username;
    private String password;
    private double balance;

    public BankAccount(String username, String password,double a) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Perform validation or additional logic if needed
        balance += amount;
    }

    public void withdraw(double amount) {
        // Perform validation or additional logic if needed
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Object getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}
}
