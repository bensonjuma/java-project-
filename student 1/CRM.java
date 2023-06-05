
public class CRM {
    private Customer[] customers; // Array to hold references to Customer objects
    private int numCustomers; // Number of customers added to the CRM system

    // Constructor to initialize the CRM object
    public CRM() {
        customers = new Customer[20]; // Initialize the customers array with a capacity of 20
        numCustomers = 0; // Initially, no customers have been added
    }

    // Method to add a Customer to the CRM system
    public void addCustomer(Customer customer) {
        customers[numCustomers] = customer; // Add the customer to the next available position in the array
        numCustomers++; // Increment the count of customers
    }

    // Method to get all Customer emails separated by semi-colons
    public String getAllCustomerEmails() {
        StringBuilder emails = new StringBuilder();

        for (int i = 0; i < numCustomers; i++) {
            emails.append(customers[i].getEmailAddress());
            if (i != numCustomers - 1) {
                emails.append("; ");
            }
        }

        return emails.toString();
    }

    // Method to print birthday cards for Customers with the specified birthMonth
    public void printBirthdayCards(BirthdayMonth birthMonth) {
        for (int i = 0; i < numCustomers; i++) {
            Customer customer = customers[i];
            if (customer.getBirthdayMonth() == birthMonth) {
                System.out.println("Dear " + customer.getFirstName() + ",");
                System.out.println("Happy Birthday! In honor of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000!");
                System.out.println("Best Regards,");
                System.out.println("<Your Name>");
                System.out.println("-------------------------------------------------------");
            }
        }
    }
}
