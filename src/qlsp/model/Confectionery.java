package qlsp.model;

public class Confectionery extends Product {
    private int expiry;

    public Confectionery() {
    }

    public Confectionery(int code, String type, int price, int expiry) {
        super(code,type,price);
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Confectionery{" +
                super.toString() +
                "expiry=" + expiry +
                '}';
    }
}
