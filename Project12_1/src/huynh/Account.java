package huynh;

import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable {

    private double Balance;

    public Account(){
        Balance = 0;
    }

    public void deposit(double amount) {

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
