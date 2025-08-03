package com.elisa.core.banking;

import java.util.Scanner;

public class Main {
    static double balance =0.0;
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Welcome to the Mini Banking System ===");

            System.out.println("1. View account balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exit application");

            System.out.print("Please enter your choice: ");
            String input = scan.nextLine().trim();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");

                choice = -1;
                continue;
            }


            switch (choice) {
                case 1-> viewAccountBalance();
                case 2-> makeDeposit(scan);
                case 3 -> makeWithdraw(scan);
                case 4 -> exitMessage();
                default -> System.out.println("Invalid choice. Please select 1–4.");
            }

        } while (choice!=4);
        scan.close();
    }

    private static void exitMessage() {
        System.out.println("Thank you for using our Banking System.");
    }

    private static void makeWithdraw(Scanner scan) {

        double amount;
        while (true) {
            System.out.println("Please enter the amount to withdraw: ");
            String input = scan.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Amount cannot be empty. Please enter a number. ");
                continue;
            }
            try {
                amount = Double.parseDouble(input);
                if (amount > balance) {
                    System.out.println("Insufficient funds.");
                    continue;
                }
                if(amount <= 0){
                    System.out.println("Please enter a valid amount to withdraw: ");
                    continue;
                }
                balance -= amount;
                System.out.println("*****************************************");
                System.out.println("Your account balance is "+ balance);
                System.out.println("*****************************************");
                break;

            }catch (NumberFormatException e) {
                System.out.println("Please enter a valid amount to withdraw: ");
            continue;
            }
        }
    }

    private static void makeDeposit(Scanner scan) {

        double amount ;
    while(true) {
        System.out.print("Enter amount to make a deposit: ");
        String input = scan.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Please enter a valid amount to make a deposit: ");
            continue;
        }
        try {
            amount = Double.parseDouble(input);
            if (amount <= 0) {
                System.out.println("Amount must be greater than 0.");
                continue;
            }

            balance += amount;
            System.out.println("*****************************************");
            System.out.println("Your account balance is "+ balance);
            System.out.println("*****************************************");
            break;

        }catch (NumberFormatException e) {
            System.out.println("Please enter a valid amount to make a deposit: ");
        }
   }
}

    private static void viewAccountBalance() {
        System.out.println("*****************************************");
        System.out.println("Your account balance is "+ balance);
        System.out.println("*****************************************");

    }
}
