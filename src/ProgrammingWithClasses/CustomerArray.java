package ProgrammingWithClasses;

import java.util.Arrays;

public class CustomerArray {
    private Customer[] customers;

    public CustomerArray(Customer[] customers) {
        this.customers = customers;
    }

    public void sortByName() {
        Arrays.sort(customers, (c1, c2) -> c1.getLastName().compareToIgnoreCase(c2.getLastName()));
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void printCustomersByCreditCardRange(String startCardNumber, String endCardNumber) {
        for (Customer customer : customers) {
            String creditCardNumber = customer.getCreditCardNumber();
            if (creditCardNumber.compareTo(startCardNumber) >= 0 && creditCardNumber.compareTo(endCardNumber) <= 0) {
                System.out.println(customer);
            }
        }
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Smith", "John", "A.", "123 Main St", "1234567890123456", "987654321");
        Customer customer2 = new Customer(2, "Johnson", "Mary", "L.", "456 Elm St", "2345678901234567", "876543210");
        Customer customer3 = new Customer(3, "Brown", "David", "M.", "789 Oak St", "3456789012345678", "765432109");
        Customer customer4 = new Customer(4, "Davis", "Jennifer", "K.", "567 Pine St", "4567890123456789", "654321098");
        Customer customer5 = new Customer(5, "Wilson", "Robert", "S.", "890 Cedar St", "5678901234567890", "543210987");

        Customer[] customers = {customer1, customer2, customer3, customer4, customer5};

        CustomerArray customerArray = new CustomerArray(customers);
        customerArray.sortByName();
        System.out.println("Customers sorted by last name:");
        customerArray.printCustomers();

        System.out.println();

        String startCardNumber = "3000000000000000";
        String endCardNumber = "5000000000000000";
        System.out.println("Customers with credit card numbers in the range " + startCardNumber +
                " - " + endCardNumber + ":");
        customerArray.printCustomersByCreditCardRange(startCardNumber, endCardNumber);
    }
}