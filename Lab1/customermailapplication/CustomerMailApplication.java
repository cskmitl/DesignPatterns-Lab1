import java.util.Scanner;

public class CustomerMailApplication {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get customer type from user
        System.out.print("Please choose customer type (1. Regular, 2. Mountain, 3. Delinquent): ");
        int customerType = scanner.nextInt();

        // Create customer object based on customer type
        Customer customer;
        switch (customerType) {
            case 1:
                customer = new RegularCustomer();
                break;
            case 2:
                customer = new MountainCustomer();
                break;
            case 3:
                customer = new DelinquentCustomer();
                break;
            default:
                System.out.println("Invalid customer type");
                return;
        }

        // Create a CustomerMailApplication object and pass the customer object
        CustomerMailApplication app = new CustomerMailApplication(customer);

        // Generate the mail
        String mail = app.generateMail();

        // Print the mail
        System.out.println("Generated mail:");
        System.out.println(mail);
    }

    private final Customer customer;

    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }

    public String generateMail() {
        return customer.createMail();
    }
}
