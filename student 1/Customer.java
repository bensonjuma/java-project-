

public class Customer {
    // Class variable to track the next available ID
    private static int nextAvailableID = 0;

    // Instance variables
    private String firstName;
    private String lastName;
    private int customerID;
    private final BirthdayMonth birthdayMonth;
    private String emailAddress;

    // Constructor that takes required parameters
    public Customer(String firstName, String lastName, BirthdayMonth birthdayMonth, String emailAddress) {
        // Assign the parameter values to instance variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayMonth = birthdayMonth;
        this.emailAddress = emailAddress;

        // Assign the next available ID to the customerID
        this.customerID = nextAvailableID;

        // Increment the next available ID for the next customer
        nextAvailableID++;
    }

    // Getter methods to retrieve the values of the instance variables
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public BirthdayMonth getBirthdayMonth() {
        return birthdayMonth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
