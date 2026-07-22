import java.util.Scanner;

public class Restaurant {

    static Scanner sc = new Scanner(System.in);

    static int totalItems = 0;
    static double totalBill = 0;

    public static void starters() {
        System.out.println("\n########## Starters ##########");
        System.out.println("1. Kebabs     - ₹200");
        System.out.println("2. Chicken 65 - ₹250");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Kebabs", 200);
                break;

            case 2:
                addItem("Chicken 65", 250);
                break;

            default:
                System.out.println("Invalid starter choice!");
        }
    }

    public static void mainCourse() {
        System.out.println("\n########## Main Course ##########");
        System.out.println("1. Mutton Biryani  - ₹350");
        System.out.println("2. Chicken Biryani - ₹280");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Mutton Biryani", 350);
                break;

            case 2:
                addItem("Chicken Biryani", 280);
                break;

            default:
                System.out.println("Invalid main-course choice!");
        }
    }

    public static void desserts() {
        System.out.println("\n########## Desserts ##########");
        System.out.println("1. Ice Cream - ₹100");
        System.out.println("2. Kaju Katli - ₹150");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Ice Cream", 100);
                break;

            case 2:
                addItem("Kaju Katli", 150);
                break;

            default:
                System.out.println("Invalid dessert choice!");
        }
    }

    public static void addItem(String itemName, double price) {
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        double itemTotal = price * quantity;

        totalItems += quantity;
        totalBill += itemTotal;

        System.out.println(quantity + " × " + itemName + " added to cart.");
        System.out.println("Item total: ₹" + itemTotal);
    }

    public static void displayBill() {
        System.out.println("\n========== YOUR BILL ==========");
        System.out.println("Total items: " + totalItems);
        System.out.println("Total bill: ₹" + totalBill);
        System.out.println("================================");
    }

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("******* Welcome to Chacha's *******");

        while (running) {
            System.out.println("\nHow can we help you?");
            System.out.println("1. Menu");
            System.out.println("2. Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n<<<<<< Here is the menu! >>>>>>");
                    System.out.println("1. Starters");
                    System.out.println("2. Main Course");
                    System.out.println("3. Desserts");
                    System.out.print("Select a category: ");

                    int menuChoice = sc.nextInt();

                    switch (menuChoice) {
                        case 1:
                            starters();
                            break;

                        case 2:
                            mainCourse();
                            break;

                        case 3:
                            desserts();
                            break;

                        default:
                            System.out.println("Invalid menu choice!");
                    }
                    break;

                case 2:
                    displayBill();
                    break;

                case 3:
                    displayBill();
                    System.out.println("Thank you for visiting Chacha's!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}