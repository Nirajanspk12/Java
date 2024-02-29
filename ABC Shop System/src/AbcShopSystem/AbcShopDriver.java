package AbcShopSystem;

import java.text.DecimalFormat;

public class AbcShopDriver {
    public static void main(String[] args) {

        // Create Employee objects
        Employee employee1 = new Employee(30.0, 25.0, "Finance");
        Employee employee2 = new Employee(18.0, 20.0, "Human Resources");

        // Create Customer objects
        Customer customer1 = new Customer("avd@asd.com", CustomerType.GOLD, "SYD", "061567829");
        Customer customer2 = new Customer();
        customer2.setEmailAddress("abx@xye.com");
        customer2.setCustomerType(CustomerType.VIP);
        customer2.setAddress("SYD");
        customer2.setC_ph_number("07382900");

        // Create Supplier objects
        Supplier supplier1 = new Supplier(123.0, SupplierStatus.FUTURE, "SYD");
        Supplier supplier2 = new Supplier();
        supplier2.setCompanyName(456.0);
        supplier2.setSupplierStatus(SupplierStatus.ACTIVE);
        supplier2.setSupplier_address("SYD");

        // Call setDiscount for each object
        employee1.setDiscount();
        employee2.setDiscount();
        customer1.setDiscount();
        customer2.setDiscount();
        supplier1.setDiscount();
        supplier2.setDiscount();

        // Display details of all objects
        displayObjectDetails(employee1);
        displayObjectDetails(employee2);
        displayObjectDetails(customer1);
        displayObjectDetails(customer2);
        displayObjectDetails(supplier1);
        displayObjectDetails(supplier2);

        // Display the total amount of discount paid by ABC retail shop
        double totalDiscount = calculateTotalDiscount(employee1, employee2, customer1, customer2, supplier1, supplier2);
        System.out.println("\nTotal Discount Paid by ABC Retail Shop: " + formatCurrency(totalDiscount));
    }

    // Method to display details of an object and its discount
    private static void displayObjectDetails(Object obj) {
        System.out.println("Details for " + obj.getClass().getSimpleName());
        System.out.println(obj.toString());

        if (obj instanceof Employee) {
            System.out.println("Discount: " + formatPercentage(((Employee) obj).getDiscount()));
        } else if (obj instanceof Customer) {
            System.out.println("Discount: " + formatPercentage(((Customer) obj).getDiscount()));
        } else if (obj instanceof Supplier) {
            System.out.println("Discount: " + formatPercentage(((Supplier) obj).getDiscount()));
        }

        System.out.println();
    }

    // Method to calculate total discount paid by ABC retail shop
    private static double calculateTotalDiscount(Object... objects) {
        double totalDiscount = 0.0;

        for (Object obj : objects) {
            if (obj instanceof Employee) {
                totalDiscount += ((Employee) obj).getDiscount();
            } else if (obj instanceof Customer) {
                totalDiscount += ((Customer) obj).getDiscount();
            } else if (obj instanceof Supplier) {
                totalDiscount += ((Supplier) obj).getDiscount();
            }
        }

        return totalDiscount;
    }

    // Helper method to format currency
    private static String formatCurrency(double amount) {
        DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");
        return "$" + currencyFormat.format(amount);
    }

    // Helper method to format percentage
    private static String formatPercentage(double percentage) {
        DecimalFormat percentageFormat = new DecimalFormat("0.00%");
        return percentageFormat.format(percentage);
    }
}
