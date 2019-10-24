package SavingsAccount;

public class SavingsAccount {
    static private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount() {
        this.savingBalance = 0;
    }

    private SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    private double getSavingBalance(){
        return this.savingBalance;
    }

    private static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    private void calculateMonthlyInterest() {
        double monthly;
        monthly = (double) (this.savingBalance * annualInterestRate / 12);
        this.savingBalance += monthly;
    }

    public static void main(String[] args) {
        SavingsAccount Saver1;
        SavingsAccount Saver2;
        //int i;

        Saver1 = new SavingsAccount(2000.00);
        Saver2 = new SavingsAccount(3000.00);
        int total = 0;

        //for annual interest rate of 4%
        System.out.println("\nPercentage Interest Rate with 4%");
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Result monthly interest for Saving Account of Sever1\n");
        for (int i = 0; i < 12; i++) {

            Saver1.calculateMonthlyInterest();
            System.out.println("Month" + (i + 1) + ": " + Saver1.getSavingBalance());
        }
        //System.out.println("\n\n");
        System.out.println("\nPercentage Interest Rate with 4%");
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Result monthly interest for Saving Account of Saver2\n");
        for(int i = 0;i< 12;i++){
            Saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": " + Saver2.getSavingBalance());
        }

        System.out.println("\n\nNew Percentage Interest Rate with 5%");
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("Result monthly interest for saving account of Saver1\n");
        for(int i = 0;i< 12;i++){
            Saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": " + Saver1.getSavingBalance());
        }

        //System.out.print("\n\n");
        System.out.println("\nNew Percentage Interest Rate with 5%");
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("Result monthly interest for saving account of Saver2\n");
        for(int i = 0;i<12;i++){
            Saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": " + Saver2.getSavingBalance());
        }
    }
}
