import java.util.Scanner;

public class SBAccount extends Account{
    @Override
    void calculateIntrest(Scanner sc){
        int[] years = new int[]{2, 4, 6, 8, 10, 12};
        System.out.println("This is SBAccount area");

        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter the amount to be deposited: ");
        float amount = sc.nextFloat();

        System.out.println("Select the time Duration: ");
        for (int i = 0; i < years.length; i++) {
            System.out.println((i + 1) + ". " + years[i] + "Years");
        }
        int option = sc.nextInt();
        System.out.println("The selected Duration is: " + years[(option - 1)]);
        
        System.out.println("Are you NRI?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        option = sc.nextInt();
        if (option == 1){
            System.out.println("You will get 6% account");
        }else{
            System.out.println("You will get 4% intrest rate");
        }

        // Formula to calculate intrest
    }
}
