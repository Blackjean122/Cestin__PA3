public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;
    //public double SavingsAccount;

    public SavingsAccount(){
        this.savingBalance = 0;
    }

    public SavingsAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    public double[] getMonthsSavingBalance(int totalMonths) {
        double[] monthly_month = new double[totalMonths];
        double monthly;
        for (int i = 0; i < totalMonths; i++) {
            monthly = (double) (this.savingBalance * annualInterestRate / 12);
            this.savingBalance += monthly;
            monthly_month[i] = this.savingBalance;
        }
        return monthly_month;
    }
    // new interest rate
    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
    public void calculateMonthlyInterest(){
        double monthly;
        monthly = (double)(this.savingBalance * annualInterestRate/12);
        this.savingBalance += monthly;
    }

}
