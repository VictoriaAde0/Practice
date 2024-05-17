package org.practice;

public class Account {
    private String accNumber;
    private int pin;
    private double accBalance;


    public Account(String accNumber, int pin, double accBalance) {
        this.accNumber = accNumber;
        this.pin = pin;
        this.accBalance = accBalance;
    }



    public String getAccNumber() {
        return accNumber;
    }
    public boolean confirm(int pin) {
        return this.pin == pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accBalance += amount;
            System.out.println("Payment Successful. Dial #123# to get new balance");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Withdrawal Successful. Dial #123# to get new balance");
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public double checkBalance() {
        return accBalance;
    }
    public void buyAirtime(double amount) {
        if (amount > 0 && amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Airtime purchase Successful. Dial #123# to get new balance");
        }else {
            System.out.println("Insufficient funds");
        }
    }


}
