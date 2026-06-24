package com.application;

import java.util.Scanner;

import com.model.entities.Account;
import com.model.exceptions.BalanceException;
import com.model.exceptions.WithdrawLimitException;

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
        } 
        catch (BalanceException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (WithdrawLimitException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}