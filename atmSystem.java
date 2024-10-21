import java.util.Scanner;

public class atmSystem {
    static int pin = 1234;
    static double accountbalance = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your ATM PIN: ");
        
        // Check if the next input is an integer
        if (sc.hasNextInt()) {
            int userPin = sc.nextInt();
            // Validate the PIN
            if (userPin == pin) {
               // System.out.println("Welcome to ATM");
               System.out.println("please of amount to withdraw");
               if(sc.hasNextInt()){
                int amount = sc.nextInt();
                if(amount <= accountbalance){
                    double remainingBalance = accountbalance-amount;
                    System.out.println("Amout withdrawble by user is: " + amount);
                    System.out.println("please collect your money");
                    System.out.println("Withdrawal successful. Remaining balance: "+remainingBalance);
               }
               else{
                System.out.println("Insufficient balance");
               }
            } else {
                System.out.println("Invalid PIN");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric PIN.");
        }
        
        // Close the scanner
        sc.close();
    }
}
}

//Task is need extra money but Atm balance is low , so its shows the error
//change in the code