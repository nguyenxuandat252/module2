package ss6_kethua.thuc_hanh;

public class Rectang extends SystemOfGeometricObjects{
    private double width;
    private double height;
    public Rectang(){

    }
    public Rectang(double width, double height){
        this.width=width;
        this.height=height;
    }
    public Rectang(String color,boolean filled,double width, double height){
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+getWidth()+" and length = "+getHeight()+" , which is a subclass of "+super.toString() ;
    }
}
