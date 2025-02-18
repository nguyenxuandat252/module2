package qlsp.model;

public abstract class Product {
    private int code;
    private String type;
    private int price;

    public Product() {
    }

    public Product(int code, String type, int price) {
        this.code = code;
        this.type = type;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "code=" + code +
                ", type='" + type + '\'' +
                '}';
    }
}
