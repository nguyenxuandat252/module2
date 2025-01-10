package ss4_oop_to_java.thuc_hanh;
import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle() {
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
    public String display(){
        return "Rectangle: width="+width+", height="+height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input width: ");
        double width = scanner.nextDouble();
        System.out.print("input height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle: \n"+ rectangle.display());
        System.out.print("Area of Rectangle: \n"+ rectangle.getArea());
        System.out.print("Perimeter of Rectangle: \n"+ rectangle.getPerimeter());
    }
}
