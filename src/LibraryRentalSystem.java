import java.util.Scanner;

public class LibraryRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        String choice;

        do {
            System.out.println("\n--- Library Rental System ---");
            System.out.println("1. View Available Books");
            System.out.println("2. View Available AudioBooks");
            System.out.println("3. Rent an Item");
            System.out.println("4. Return an Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.displayAvailableItems("Book");
                    break;
                case "2":
                    library.displayAvailableItems("AudioBook");
                    break;
                case "3":
                    System.out.print("Enter Item ID to rent: ");
                    String rentId = scanner.nextLine();
                    library.rentItem(rentId);
                    break;
                case "4":
                    System.out.print("Enter Item ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnItem(returnId);
                    break;
                case "5":
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }
}