package ss20_furama.model;

public class Employee extends Person{
    private String lever;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int code, String name, String dob, String sex, String identificationNumber, String phoneNumber, String email, String lever, String position, double salary) {
        super(code, name, dob, sex, identificationNumber, phoneNumber, email);
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String getInfoEmployeeData(){
        return this.getCode()+","+this.getName()+","+this.getDob()+","+this.getSex()+","+this.getIdentificationNumber()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getLever()+","+this.getPosition()+","+this.getSalary();
    }
}
