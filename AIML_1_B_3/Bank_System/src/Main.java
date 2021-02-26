import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        float balance = 0f;
        Account a = new Account();
        do {
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.print("Your choice, 0 to quit: ");
            userChoice = in.nextInt();
            switch (userChoice) {
                case 1:
                    float amount;
                    System.out.print("Amount to deposit: ");
                    amount = in.nextFloat();
                    if (amount <= 0)
                        System.out.println("Can't deposit nonpositive amount.");
                    else {
                        a.deposit(amount);
                        System.out.println("$" + amount + " has been deposited.");
                    }
                    break;
                
                case 2:
                    System.out.print("Amount to withdraw: ");
                    amount = in.nextFloat();
                    if (amount <= 0 || amount > balance)
                        System.out.println("Withdrawal can't be completed.");
                    else {
                        a.withdraw(amount);
                        System.out.println("$" + amount + " has been withdrawn.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance: $" + a.getBalance());
                    break;

                case 0:
                    quit = true;
                    break;

                default:

                    System.out.println("Wrong choice.");
                    break;
            }
            System.out.println();
        } while (!quit);
        System.out.println("Bye!");
    }
}
