package businessLogic.Loan;


public class LoanApplication {
    private String personalNumber;
    private double monthlyIncome;
    private double currentLoanDebt;
    private double currentCreditDebt;
    private int appliedLoanAmount;
    private int appliedLoanDuration;

    public LoanApplication(String personalNumber, double monthlyIncome, double currentLoanDebt, double currentCreditDebt, int appliedLoanAmount, int appliedLoanDuration) {
        this.personalNumber = personalNumber;
        this.monthlyIncome = monthlyIncome;
        this.currentLoanDebt = currentLoanDebt;
        this.currentCreditDebt = currentCreditDebt;
        this.appliedLoanAmount = appliedLoanAmount;
        this.appliedLoanDuration = appliedLoanDuration;
    }
    // Attributes should not be allowed to set once created

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getCurrentLoanDebt() {
        return currentLoanDebt;
    }

    public void setCurrentLoanDebt(double currentLoanDebt) {
        this.currentLoanDebt = currentLoanDebt;
    }

    public double getCurrentCreditDebt() {
        return currentCreditDebt;
    }

    public void setCurrentCreditDebt(double currentCreditDebt) {
        this.currentCreditDebt = currentCreditDebt;
    }

    public double getAppliedLoanAmount() {
        return appliedLoanAmount;
    }

    public void setAppliedLoanAmount(int appliedLoanAmount) {
        this.appliedLoanAmount = appliedLoanAmount;
    }

    public double getAppliedLoanDuration() {
        return appliedLoanDuration;
    }

    public void setAppliedLoanDuration(int appliedLoanDuration) {
        this.appliedLoanDuration = appliedLoanDuration;
    }

}
