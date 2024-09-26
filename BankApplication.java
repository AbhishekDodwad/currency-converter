import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        // Using polymorphism to refer to a specific account type (like CurrentAccount)
        BankAccount obj1 = new CurrentAccount("Abhishek Dodwadd", "BA0001");
        obj1.showMenu();
    }
}

// Abstract class representing a general BankAccount
abstract class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        this.customerName = cname;
        this.customerId = cid;
    }

    // Abstract methods for deposit and withdraw (to enforce these methods in subclasses)
    abstract void deposit(int amount);
    abstract void withdraw(int amount);

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposit: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transactions occurred.");
        }
    }

    // Concrete method to show the account menu
    void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("===================================================");
            System.out.println("Enter an option:");
            System.out.println("===================================================");
            option = sc.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("----------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("----------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("----------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("----------------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("----------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("----------------------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("----------------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("===================================================");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        } while (option != 'E');
        System.out.println("Thank you for using our services.");
    }
}

// Concrete class for CurrentAccount
class CurrentAccount extends BankAccount {

    CurrentAccount(String cname, String cid) {
        super(cname, cid);
    }

    // Implementing deposit method
    @Override
    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println(amount + " deposited.");
        }
    }

    // Implementing withdraw method
    @Override
    void withdraw(int amount) {
        if (amount != 0) {
            if (balance >= amount) {
                balance -= amount;
                previousTransaction = -amount;
                System.out.println(amount + " withdrawn.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }
}

// You can create more classes like SavingAccount, etc., for different types of accounts.
