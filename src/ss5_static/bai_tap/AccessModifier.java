package ss5_static.bai_tap;

public class AccessModifier {
    private double radius=1.0;
    public String color="red";
    public AccessModifier( double radius, String color ) {
        this.radius = radius;
        this.color = color;
    }
    public void Circle() {

    }
    public void Circle(double radius) {

    }
    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return Math.PI*radius*radius;
    }

//    public static void main(String[] args) {
//        AccessModifier mod = new AccessModifier(1.0,"red");
//        System.out.println(mod.getArea());
//        System.out.println(mod.color);
//    }
}
