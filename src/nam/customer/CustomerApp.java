/*
    Programmers: Eric Nam (en3643) & Richard Huynh (rlh3482)
    Assignment: PLProject 1
    Description: Create a customer application that takes a customer ID as input and outputs customer information
    Date Created: 1-28-2016
    Date Last Modified: 2-5-2016
 */
package nam.customer;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        // Initialize exit variable
        String displayAnother = "y";

        // Prints "Welcome to the Customer Viewer" onto terminal
        System.out.println("\nWelcome to the Customer Viewer");

        while (displayAnother.equals("y")) {

            // Prompt for user input
            System.out.println();
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a customer number: ");

            int customer_number = reader.nextInt(); //save cust number into variable
            reader.nextLine(); // discard leftover newline character
            System.out.println(); //newline

            Customer aCustomer = CustomerDB.getCustomer(customer_number);
            if (aCustomer != null) {
                System.out.printf("%d\n%s\n%s\n%s, %s %d", aCustomer.getCustomerNumber(), aCustomer.getName(), aCustomer.getAddress(), aCustomer.getCity(), aCustomer.getState(), aCustomer.getPostalCode());
            } else {
                System.out.printf("There is no customer number %d in our records.", customer_number);
            }
            System.out.print("\n\nDisplay another customer? (y/n): ");
            displayAnother = reader.nextLine();
        }
    }

}
