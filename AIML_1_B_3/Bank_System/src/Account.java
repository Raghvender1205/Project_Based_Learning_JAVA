public class Account {

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    int tenure;
    float principal;
    float rateOfInterest;

    Account() {

        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }

    // constructor with specific id and initial balance
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }

    Account(int newId, double newBalance, double newAnnualInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
    }

    // accessor/mutator methods for id, balance, and annualInterestRate
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    // define method getMonthlyInterestRate
    double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100 * balance;
    }

    // define method withdraw
    double withdraw(double amount) {
        return balance -= amount;
    }

    // define method deposit
    double deposit(double amount) {
        return balance += amount;
    }

    public void setInterest(int age, String gender) {

        if (gender.equalsIgnoreCase("Male")){
            if (age < 60){
                rateOfInterest = (float) 9.8;
            }
            if (age >= 60){
                rateOfInterest = 10.5f;
            }
        }

        else{
            if (age < 58){
                rateOfInterest = 10.2f;
            }
            if (age >= 58){
                rateOfInterest = 10.8f;
            }
        }
    }

    public float calculateMaturityAmount(float totalPrincipleDeposited, float maturityInterest) {
        return (totalPrincipleDeposited + maturityInterest);
    }
    
    public float calculateInterest(){
        float result = 0.0f;
        float quat = 4;
        int totalMonths = tenure * 12;
        float monInYears = 0;
        float iRate = rateOfInterest / 100;
        for (int i = totalMonths; i > 0; i--) {
            monInYears = i / 12.0f;
            result += principal * ((Math.pow((1 + iRate / quat), quat * monInYears)) - 1);
        }
        return result;
    }
    public float calculateAmountDeposited(){
        return principal * tenure * 12;
    }
}
