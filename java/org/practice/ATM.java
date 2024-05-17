package org.practice;
import java.util.HashMap;
import java.util.Scanner;
import  java.util.Map;

public class ATM {
    private Map<String,Account> accounts = new HashMap<>();
    public void addAccount(Account account) {
        accounts.put(account.getAccNumber(),account);
    }
    public Account confirmUser(String accNumber, int pin) {
        Account account = accounts.get(accNumber);
        if (account != null && account.confirm(pin)) {
            return account;
        }
        return null;
    }

    public void dropMenu() {
        System.out.println("ATM List:");
        System.out.println("1. To Withdraw");
        System.out.println("2. To Deposit");
        System.out.println("3. Balance Inquiry");
        System.out.println("4. To Buy Airtime");
        System.out.println("5. Exit");
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accNumber = scanner.nextLine();
        System.out.println("Enter your Pin");
        int pin = scanner.nextInt();

        Account account = confirmUser(accNumber, pin);
        if (account == null) {
            System.out.println("Invalid account details");
            return;
        }
        while (true) {
            dropMenu();
            System.out.println("Select an option: ");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Enter Airtime amount to buy: ");
                    double airtimeAmount = scanner.nextDouble();
                    account.buyAirtime(airtimeAmount);
                    break;
                case 5:
                    System.out.println("Thank you for Using this Channel");
                    return;
                default:
                    System.out.println("Invalid. Please ty again");
            }
        }
    }


    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.addAccount(new Account("0149900019", 2341, 2000000));

        atm.start();

    }


}
