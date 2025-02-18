package ss20_furama.model;

public abstract class Facility {
    private String code;
    private String name;
    private float area;
    private float expense;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String code, String name, float area, float expense, int maxPeople, String rentalType) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.expense = expense;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        this.expense = expense;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", acreage=" + area +
                ", expense=" + expense +
                ", numberOfPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getInfoFacilityData() {
        return this.getCode() + "," + this.getName() + "," +
                this.getArea() + "," + this.getExpense() + "," +
                this.getMaxPeople() + "," + this.getRentalType();
    }
}
