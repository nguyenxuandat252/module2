package ss6_kethua.bai_tap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, double area) {
        super(radius, color, area);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double dienTichXQ() {
        return 2 * Math.PI * getRadius() * height;
    }

    public double dienTichTP() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    public double volume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +"Volume"+ volume()+
                '}';
    }
}
