package baithi_module2.model;

public class PaymentAccount extends BankAccount {
    private String cardNumber;
    private int amount;

    public PaymentAccount() {
    }

    public PaymentAccount(int id, String code, String name, String date, String cardNumber, int amount) {
        super(id, code, name, date);
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                super.toString() +
                ", cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getInfoData() {
        return this.getId() + "," + this.getCode() + "," +
                this.getName() + "," + this.getDate() + "," +
                this.getCardNumber() + "," + this.getAmount();
    }
}
