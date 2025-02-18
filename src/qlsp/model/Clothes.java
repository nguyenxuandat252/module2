package qlsp.model;

public class Clothes extends Product{
    private int size;

    public Clothes() {
    }

    public Clothes(int code, String type, int price, int size) {
        super(code, type, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                super.toString() +
                "size=" + size +
                '}';
    }
}
