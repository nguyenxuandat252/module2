package ss21_ontap.model;

public abstract class Phone {
    private String code;
    private int id;
    private String trademark;
    private String name;
    private double price;

    public Phone() {
    }

    public Phone(String code, int id, String trademark, String name, double price) {
        this.code = code;
        this.id = id;
        this.trademark = trademark;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{code='" + code + '\'' +
                ", id=" + id +
                ", trademark='" + trademark + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
