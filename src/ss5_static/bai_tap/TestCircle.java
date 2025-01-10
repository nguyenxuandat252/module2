package ss5_static.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
       AccessModifier accessModifier= new AccessModifier(2.0,"blue");
        System.out.println(accessModifier.getRadius());
        System.out.println(accessModifier.getArea());
        System.out.println(accessModifier.color);
    }
}
