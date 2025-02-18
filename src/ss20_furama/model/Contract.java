package ss20_furama.model;

public class Contract {
    private int numberContract;
    private String codeBooking;
    private float deposit;
    private float totalPayment;

    public Contract() {
    }

    public Contract(int numberContract, String codeBooking, float deposit, float totalPayment) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public Contract(int numberContract, float deposit, float totalPayment) {
        this.numberContract = numberContract;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(float totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", codeBooking=" + codeBooking +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
    public String getInfoEmployeeData(){
        return this.numberContract+","+this.codeBooking+","+this.deposit+","+this.totalPayment;
    }
}
