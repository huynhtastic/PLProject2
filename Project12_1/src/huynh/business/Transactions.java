package huynh.business;

import huynh.account.interfaces.Depositable;
import huynh.account.interfaces.Withdrawable;

/**
 * Created by Eric on 2/19/2016.
 */
public class Transactions {

    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
