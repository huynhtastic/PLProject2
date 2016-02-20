package huynh.ui;

import java.util.Scanner;
import huynh.business.Customer;
import huynh.business.Employee;
import huynh.business.Person;

/**
 * Created by Richard Huynh on 2/19/2016.
 */
public class PersonApp {

    public static void main(String args[]) {
        // welcome text
        System.out.println("Welcome to the Person Tester application\n");

        // prompt input
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Create customer or employee? (c/e): ");
            String creationChoice = sc.nextLine(); // read input
            System.out.println();

            if (creationChoice.equalsIgnoreCase("c")) { // create customer object
                Customer c = new Customer();
                System.out.print("Enter first name: "); // prompt for first name
                c.setFirstName(sc.nextLine());
                System.out.print("Enter last name: "); // prompt for last name
                c.setLastName(sc.nextLine());
                System.out.print("Enter email address: "); // prompt for email
                c.setEmail(sc.nextLine());
                System.out.print("Customer number: "); // prompt for customer number
                c.setCustomerNumber(sc.nextLine());
                // end prompting

                // display entered data
                System.out.println("\nYou entered:");
                print(c);
            } else if (creationChoice.equalsIgnoreCase("e")) { // create employee object
                Employee e = new Employee();
                System.out.print("Enter first name: "); // prompt for first name
                e.setFirstName(sc.nextLine());
                System.out.print("Enter last name: "); // prompt for last name
                e.setLastName(sc.nextLine());
                System.out.print("Enter email address: "); // prompt for email
                e.setEmail(sc.nextLine());
                System.out.print("Social security number: "); // prompt for ssn
                e.setSocialSecurityNumber(sc.nextLine());
                // end prompting

                // display entered data
                System.out.println("\nYou entered:");
                print(e);
            }

            // see if the user wants to continue
            System.out.println("");
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }

    }

    private static void print(Person p) {
        System.out.println(p.getDisplayText());
    }

}

