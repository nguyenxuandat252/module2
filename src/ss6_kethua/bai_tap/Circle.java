package ss6_kethua.bai_tap;

public class Circle {
    private double radius;
    private String color;
    private double area;
    public Circle(){
    }
    public Circle(double radius,String color, double area){
        this.radius=radius;
        this.color=color;
        this.area=area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
