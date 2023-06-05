

public class Start {
    public static void main(String[] args) {
        // Instantiate the first customer with realistic data
        Customer customer1 = new Customer("John", "Doe", BirthdayMonth.JAN, "john.doe@example.com");
        System.out.println("Customer 1 ID: " + customer1.getCustomerID());

        // Instantiate the second customer, the customerID should be automatically assigned as 1
        Customer customer2 = new Customer("Jane", "Smith", BirthdayMonth.FEB, "jane.smith@example.com");
        System.out.println("Customer 2 ID: " + customer2.getCustomerID());

        // Instantiate additional customers with realistic data
        Customer customer3 = new Customer("David", "Johnson", BirthdayMonth.MAR, "david.johnson@example.com");
        Customer customer4 = new Customer("Sarah", "Williams", BirthdayMonth.MAR, "sarah.williams@example.com");
        Customer customer5 = new Customer("Michael", "Brown", BirthdayMonth.APR, "michael.brown@example.com");

        // Create a ragged array of Customers with 3 Customers in the first row and 2 Customers in the second row
        Customer[][] customersArray = {
                {customer1, customer2, customer3},
                {customer4, customer5}
        };

        // Use loops to print out the names of all Customers in the specified format
        for (int i = 0; i < customersArray.length; i++) {
            for (int j = 0; j < customersArray[i].length; j++) {
                System.out.print(customersArray[i][j].getFirstName() + " " + customersArray[i][j].getLastName());

                // Check if it's the last customer in the row
                if (j != customersArray[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Move to the next line for the next row
        }
        // Create a CRM object
        CRM crm = new CRM();

        // Add customers to the CRM system
        crm.addCustomer(customer1);
        crm.addCustomer(customer2);
        crm.addCustomer(customer3);
        crm.addCustomer(customer4);
        crm.addCustomer(customer5);

        // Get all customer emails and print them
        String allCustomerEmails = crm.getAllCustomerEmails();
        System.out.println("All Customer Emails: " + allCustomerEmails);

        // Print birthday cards for customers with March birth month
        System.out.println("Birthday Cards for March:");
        crm.printBirthdayCards(BirthdayMonth.MAR);
    }
}
