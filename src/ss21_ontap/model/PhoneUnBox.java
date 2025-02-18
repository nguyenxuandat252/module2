package ss21_ontap.model;

public class PhoneUnBox extends Phone{
    private String status;
    private String present;
    private String country;

    public PhoneUnBox() {
    }

    public PhoneUnBox(String code, int id, String trademark, String name, double price, String status, String present, String country) {
        super(code, id, trademark, name, price);
        this.status = status;
        this.present = present;
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "status='" + status + '\'' +
                ", present='" + present + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public String getInfoData(){
        return this.getCode()+","+this.getId()+","+
                this.getTrademark()+","+this.getName()+","+
                this.getPrice()+","+this.getStatus()+","+
                this.getPresent()+","+this.getCountry();
    }
}
