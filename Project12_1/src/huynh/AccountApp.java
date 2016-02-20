package huynh;
import java.util.Scanner;

/**
 * Created by Eric on 2/19/2016.
 */
public class AccountApp {

    public static void main(String[] args) {
        //Scan for user input
        Scanner scan = new Scanner(System.in);

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
        System.out.println();
        System.out.println("Enter the transaction for the month");
        System.out.println();

        //variable to record whether user wants to continue or not
        String status = "y";

        while (status.equals("y")){
            //Ask whether to deposit or withdraw
            System.out.print("Withdrawal or deposit? (w/d): ");
            String answer = scan.next();

            //if withdraw, withdraw amount, if deposit, deposit amount
            if (answer.equals("w")||answer.equals("W")) {
                System.out.print("Amount: ");
                Double amount = scan.nextDouble(); //record input
                //withdraw
                account.withdraw(amount);
            } else if (answer.equals("d")||answer.equals("D")) {
                System.out.print("Amount: ");
                Double amount = scan.nextDouble(); //record input
                //deposit
                account.deposit(amount);
            } else {
                System.out.println("Invalid response.");
            }

            //Ask if the user would like to continue
            System.out.println();
            System.out.print("Continue? (y/n): ");
            answer = scan.next().toLowerCase();
            status = answer;
        }








    }

}
