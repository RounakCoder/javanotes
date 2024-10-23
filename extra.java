import java.util.Scanner;

public class extra {
    static int pin = 1234;
    static double userBalance = 10000;
    static double atmBalance = 5000;
    static final double MAX_DEPOSIT = 30000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Validate PIN
        if (validatePin(sc)) {
            int option = getOption(sc);
            
            if (option == 1) {
                withdraw(sc);  // Call withdraw function
            } else if (option == 2) {
                deposit(sc);  // Call deposit function
            } else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    // Function to validate PIN
    public static boolean validatePin(Scanner sc) {
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        return enteredPin == pin;
    }

    // Function to get user's action option
    public static int getOption(Scanner sc) {
        System.out.println("1. Withdraw\n2. Deposit");
        return sc.nextInt();
    }

    // Function to handle withdrawal
    public static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= userBalance) {
            if (amount <= atmBalance) {
                userBalance -= amount;
                atmBalance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + userBalance);
            } else {
                System.out.println("ATM doesn't have enough cash. ATM balance is only: " + atmBalance);
            }
        } else {
            System.out.println("Insufficient account balance.");
        }
    }

    // Function to handle deposit
    public static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit (Max 50000): ");
        double amount = sc.nextDouble();

        if (amount <= MAX_DEPOSIT) {
            userBalance += amount;
            atmBalance += amount;
            System.out.println("Deposit successful. New balance: " + userBalance);
        } else {
            System.out.println("Deposit exceeds the limit.");
        }
    }
}
