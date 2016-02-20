package huynh.business;

import huynh.account.interfaces.Balanceable;
import huynh.account.interfaces.Depositable;
import huynh.account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable {

    public double Balance;

    public Account(){
        Balance = 0;
    }

    public void deposit(double amount) {
        Balance = Balance + amount;
    }

    public void withdraw(double amount) {
        Balance = Balance - amount;
    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double amount) {
        Balance = amount;
    }

    public String getBalanceFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(Balance);
    }

}
