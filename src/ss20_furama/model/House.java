package ss20_furama.model;

public class House extends Facility {
    private String standard;
    private int floors;

    public House() {
    }

    public House(String code, String name, float area, float expense, int maxPeople, String rentalType, String standard, int floors) {
        super(code, name, area, expense, maxPeople, rentalType);
        this.standard = standard;
        this.floors = floors;
    }

    public House(String[] field) {
        super(field[0], field[1],
                Float.parseFloat(field[2]), Float.parseFloat(field[3]),
                Integer.parseInt(field[4]), field[5]);
        this.standard = field[6];
        this.floors = Integer.parseInt(field[7]);
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", floors=" + floors +
                '}';
    }
    public String getInfoFacilityData(){
        return this.getCode() + "," + this.getName() + "," +
                this.getArea() + "," + this.getExpense() + "," +
                this.getMaxPeople() + "," + this.getRentalType()+","+
                this.getStandard()+ "," + this.getFloors();
    }
}
