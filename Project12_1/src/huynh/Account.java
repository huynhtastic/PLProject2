package huynh;

public class Account implements Depositable, Withdrawable, Balanceable {

    private double Balance;

    public Account(){
        Balance = 0;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double amount) {
        Balance = amount;
    }

    public String getBalanceFormatted() {

        return "";
    }

}
