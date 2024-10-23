import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if 'exit' is entered
            }
            System.out.println("You entered: " + input);
        }

        System.out.println("Exited the loop.");
        scanner.close();
    }
}
