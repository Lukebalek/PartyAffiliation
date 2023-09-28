import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        String choice = scanner.next();

        String response;

        if ("D".equalsIgnoreCase(choice)) {
            response = "Democratic Donkey";
        } else if ("R".equalsIgnoreCase(choice)) {
            response = "Republican Elephant";
        } else if ("I".equalsIgnoreCase(choice)) {
            response = "Independent Person";
        } else {
            response = "That is an invalid command, please use [R,D,I] ";
        }

        System.out.println("You get a " + response + ".");

        scanner.close();

    }
}
