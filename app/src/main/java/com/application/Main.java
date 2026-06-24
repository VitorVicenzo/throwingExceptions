package com.application;

import java.util.Scanner;

import com.model.entities.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();
            Account user = new Account(number, holder, balance, withdrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            user.withdraw(amount);
        } catch (Exception e) {

        }
    }
}