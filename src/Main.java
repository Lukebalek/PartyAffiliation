import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Select your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        // Read the user's choice
        char choice = scanner.next().charAt(0);

        // Determine the response based on the user's choice
        switch (choice) {
            case 'D':
            case 'd':
                System.out.println("You get a Democratic Donkey.");
                break;
            case 'R':
            case 'r':
                System.out.println("You get a Republican Elephant.");
                break;
            case 'I':
            case 'i':
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get an Other.");
        }

        scanner.close();
    }
}
