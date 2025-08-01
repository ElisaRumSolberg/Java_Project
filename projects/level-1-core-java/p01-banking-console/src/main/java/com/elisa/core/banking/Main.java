package com.elisa.core.banking;

import java.util.Scanner;

public class Main {
    static double balance ;
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Welcome to the Mini Banking System ===");

            System.out.println("1. View account balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdraw");
            System.out.println("4. Exit application");
            System.out.println();
            System.out.print("Please enter your choice: ");
            String input = scan.nextLine().trim();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                choice = -1;
            }


            switch (choice) {
                case 1-> viewAccountBalance();
                case 2-> makeDeposit();
                case 3 -> makeWithdraw();
                case 4 -> exitMessage();
                default -> System.out.println("Invalid choice");
            }

        } while (choice!=4);
    }

    private static void exitMessage() {
        System.out.println("Thank you for using our Banking System.");
    }

    private static void makeWithdraw() {
    }

    private static void makeDeposit() {
    }

    private static void viewAccountBalance() {

    }
}
