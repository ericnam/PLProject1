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
    private int postal;

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

    public int getPostal() {
        return postal;
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
    public void setPostal (int n) {
        this.postal = n;
    }
}