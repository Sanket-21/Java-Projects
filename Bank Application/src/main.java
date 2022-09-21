import java.util.*;

public class main {
    public static void main (String args[]) {

        BankAccount obj = new BankAccount("Sanket Gurav","SG0000021");
        obj.showMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cname,String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount)
    {
        if (amount > 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited : "+ previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdraw : "+ Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction Occured.");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SG "+ customerName);
        System.out.println(("Your ID : "+ customerID));
        System.out.println();

        System.out.println("A : Check your Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit the System");

        do {
            System.out.println("====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***");
            System.out.println("Enter Your Option.....");
            System.out.println("====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***====***===***===***===***===***");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A' :
                    System.out.println("_______________________________________________________________________");
                    System.out.println("Balance : "+ balance);
                    System.out.println("_______________________________________________________________________");
                    System.out.println("\n");
                    break;

                case 'B' :
                    System.out.println("_______________________________________________________________________");
                    System.out.println("Enter the amount to Deposit.....");
                    System.out.println("_______________________________________________________________________");

                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C' :
                    System.out.println("_______________________________________________________________________");
                    System.out.println("Enter the amount to Withdraw.....");
                    System.out.println("_______________________________________________________________________");

                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("_______________________________________________________________________");
                    getPreviousTransaction();
                    System.out.println("_______________________________________________________________________");
                    System.out.println("\n");
                    break;

                case 'E' :
                    System.out.println("_______________________________________________________________________");
                    break;

                default:
                    System.out.println("Invalid Option !!!");
                    System.out.println("Please Enter the Correct Option.....");
            }
        }
        while (option != 'E') ;
            System.out.println("Thank You For Using Our Services.....!!!\n");
    }
}
