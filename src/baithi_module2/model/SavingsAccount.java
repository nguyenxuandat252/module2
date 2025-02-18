package baithi_module2.model;

public class SavingsAccount extends BankAccount {
    private int savings;
    private String dateCreated;
    private int interestRate;
    private int term;

    public SavingsAccount() {
    }

    public SavingsAccount(int id, String code, String name, String date, int savings, String dateCreated, int interestRate, int term) {
        super(id, code, name, date);
        this.savings = savings;
        this.dateCreated = dateCreated;
        this.interestRate = interestRate;
        this.term = term;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                super.toString() +
                ", savings=" + savings +
                ", dateCreated='" + dateCreated + '\'' +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }

    public String getInfoData() {
        return this.getId() + "," + this.getCode() + "," +
                this.getName() + "," + this.getDate() + "," +
                this.getSavings() + "," + this.getDateCreated() + "," +
                this.getInterestRate() + "," + this.getTerm();
    }
}
