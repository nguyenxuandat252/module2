package ss20_furama.model;

public class Room extends Facility {
    private String facilityFree;

    public Room() {
    }

    public Room(String code, String name, float area, float expense, int maxPeople, String rentalType, String facilityFree) {
        super(code, name, area, expense, maxPeople, rentalType);
        this.facilityFree = facilityFree;
    }

    public Room(String[] field) {
        super(field[0], field[1],
                Float.parseFloat(field[2]), Float.parseFloat(field[3]),
                Integer.parseInt(field[4]), field[5]);
        this.facilityFree = field[6];
    }


    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "facilityFree='" + facilityFree + '\'' +
                '}';
    }

    public String getInfoFacilityData() {
        return this.getCode() + "," + this.getName() + "," +
                this.getArea() + "," + this.getExpense() + "," +
                this.getMaxPeople() + "," + this.getRentalType() + "," +
                this.getFacilityFree();
    }
}
