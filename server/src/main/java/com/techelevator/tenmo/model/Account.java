package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {
    //Account Values
    private int account_id;
    private int user_id;
    private BigDecimal balance = new BigDecimal(1000);

    //Constructor without parameters
    public Account() {
    }
    //Constructor with parameters
    public Account(int account_id, int user_id, BigDecimal balance) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.balance = balance;
    }

    //Getters and Setters
    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    //toString
    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", user_id=" + user_id +
                ", balance=" + balance +
                '}';
    }
}
