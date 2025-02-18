package ss20_furama.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int code, String name, String dob, String sex, String identificationNumber, String phoneNumber, String email, String customerType, String address) {
        super(code, name, dob, sex, identificationNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInfoCustomerData(){
        return this.getCode()+","+this.getName()+","+this.getDob()+","+this.getSex()+","+this.getIdentificationNumber()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getCustomerType()+","+this.getAddress();
    }
}
