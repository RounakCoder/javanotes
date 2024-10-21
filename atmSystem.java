import java.util.Scanner;

public class atmSystem {
    static int pin = 1234;
    static double userBalance = 10000;
    static double atmBalance = 5000;  // Task is -> Atm have Only 5000 rupees
    static final double MAX_DEPOSIT = 50000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // PIN validation
        System.out.print("Enter your PIN: ");
        if (sc.hasNextInt() && sc.nextInt() == pin) {
            System.out.println("1. Withdraw\n2. Deposit");
            int option = sc.nextInt();
            
            // Withdraw option
            if (option == 1) {
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
            // Deposit option
            else if (option == 2) {
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
            else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
        
    }
}
