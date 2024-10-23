import java.util.Scanner;
// This File Not Connected with Database
public class atmSystemWithoutDatabase {
    static int pin = 1234;
    static double userBalance = 10000;
    static double atmBalance = 5000;  
    static final double MAX_DEPOSIT = 30000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean authenticated = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter your PIN: ");
            if (sc.nextInt() == pin) {
                authenticated = true;
                break;
            }
            System.out.println("Incorrect PIN. You have " + (2 - i) + " attempt(s) remaining.");
        }

        if (!authenticated) {
            System.out.println("Maximum attempts reached. Exiting the system.");
            return;
        }

        for (boolean sessionActive = true; sessionActive;) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw Funds");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Check Your Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the amount you wish to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount <= userBalance && withdrawAmount <= atmBalance) {
                        userBalance -= withdrawAmount;
                        atmBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful! Your new balance is: " + userBalance);
                    } else {
                        System.out.println("Error: Insufficient balance or ATM funds.");
                    }
                    break;

                case 2:
                    System.out.print("How much would you like to deposit? (Maximum allowed: " + MAX_DEPOSIT + "): ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount <= MAX_DEPOSIT) {
                        userBalance += depositAmount;
                        atmBalance += depositAmount;
                        System.out.println("Deposit successful! Your new balance is: " + userBalance);
                    } else {
                        System.out.println("Error: Deposit amount exceeds the limit.");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + userBalance);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Have a great day!");
                    sessionActive = false;
                    break;

                default:
                    System.out.println("Invalid selection. Please choose a valid option.");
            }
        }

        sc.close();
    }
}
