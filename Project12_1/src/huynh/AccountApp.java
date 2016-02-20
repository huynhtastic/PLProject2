package huynh;
import java.util.Scanner;

/**
 * Created by Eric on 2/19/2016.
 */
public class AccountApp {

    public static void main(String[] args) {
        //Scan for user input
        //Scanner scan = new Scanner(system.in);

        //Initializing Console
        System.out.println("Welcome to the Account Calculator.");
        System.out.println();
        System.out.println("Starting Balance");
        System.out.print("Checking: ");

        //Start new account
        Account account = new Account();
        account.setBalance(1000); //input 1000 into balance

        //print current balance formatted
        System.out.print(account.getBalanceFormatted());





    }

}
