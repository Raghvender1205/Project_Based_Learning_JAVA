public class SavingsAccount extends Account{
    public SavingsAccount(int newId, double newBalance){
        super(newId, newBalance);
    }    

    // Withdraw
    public double withdraw(double amount){
        if (getBalance() < amount){
            System.out.println("Not Enough Balance");
        }

        return super.withdraw(amount);
    }
}
