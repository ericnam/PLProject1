/*
    Programmers: Eric Nam (en3643) & Richard Huynh (rlh3482)
    Assignment: PLProject 1
    Description: Create a customer application that takes a customer ID as input and outputs customer information
    Date Created: 1-28-2016
    Date Last Modified: 2-5-2016
 */
package nam.customer;

public class Customer {

    int customer_number;

    public Customer(int n) {
        customer_number = n;
    }

    // Initialize all variables
    private String name;
    private String address;
    private String city;
    private String state;
    private int postalCode;

    //All get functions
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public int getCustomerNumber() {
        return customer_number;
    }

    //All set functions
    public void setName (String n) {
        this.name = n;
    }
    public void setAddress (String n) {
        this.address = n;
    }
    public void setCity (String n) {
        this.city = n;
    }
    public void setState (String n) {
        this.state = n;
    }
    public void setPostalCode (int n) {
        this.postalCode = n;
    }
}