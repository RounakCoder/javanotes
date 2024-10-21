import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Test Scanner function");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.print("Please enter a value: ");
        
        // Read the user input (assuming it's an integer)
        int userInput = scanner.nextInt();

        System.out.print("Enter your requirement Deposit and withdrawl : ");

        String  userInputStr = scanner.next();

        System.out.println("The value entered by the user value is: " + userInput+"  Given Reponse by user: "+userInputStr);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}