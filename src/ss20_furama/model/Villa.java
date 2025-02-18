package ss20_furama.model;

public class Villa extends Facility{
    private String standard;
    private float poolArea;

    public Villa() {
    }

    public Villa(String code, String name,
                 float area, float expense,
                 int maxPeople, String rentalType,
                 String standard, float poolArea) {
        super(code, name, area, expense, maxPeople, rentalType);
        this.standard = standard;
        this.poolArea = poolArea;
    }

    public Villa(String[] field) {
        super(field[0], field[1],
                Float.parseFloat(field[2]), Float.parseFloat(field[3]),
                Integer.parseInt(field[4]), field[5]);
        this.standard = field[6];
        this.poolArea = Float.parseFloat(field[7]);
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                '}';
    }
    public String getInfoFacilityData(){
        return this.getCode() + "," + this.getName() + "," +
                this.getArea() + "," + this.getExpense() + "," +
                this.getMaxPeople() + "," + this.getRentalType()+","+
                this.getStandard() + "," + this.getPoolArea();
    }
}
