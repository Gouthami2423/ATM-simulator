
import java.util.Scanner;

public class ATMsimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your balance: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: $");
                double withdraw = scanner.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("You withdrew: $" + withdraw);
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to deposit: $");
                double deposit = scanner.nextDouble();
                balance += deposit;
                System.out.println("You deposited: $" + deposit);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
