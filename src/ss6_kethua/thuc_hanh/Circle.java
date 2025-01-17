package ss6_kethua.thuc_hanh;

public class Circle extends SystemOfGeometricObjects{
    private double radius=1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color,boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(double radius){
        return 2*Math.PI*radius;
    }
    public double getArea(double radius){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+getRadius() +", which is a subclass of "+ super.toString();
    }
}
