package nam.customer;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        // Prints "Welcome to the Customer Viewer" onto terminal
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        // Prompt for user input
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a customer number: ");

        int customer_number = reader.nextInt(); //save cust number into variable
        System.out.println(); //newline
    }

}
