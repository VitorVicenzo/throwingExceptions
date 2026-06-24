package com.model.entities;

import com.model.exceptions.BalanceException;
import com.model.exceptions.WithdrawLimitException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;

    }

    public void withdraw(Double amount) {
        if (balance < amount && amount < withdrawLimit) {
            throw new BalanceException("Not enough balance.");
        }
        else if (amount > withdrawLimit){
            throw new WithdrawLimitException("The amount exceeds withdraw limit.");
        }
        balance -= amount;
    }

}
