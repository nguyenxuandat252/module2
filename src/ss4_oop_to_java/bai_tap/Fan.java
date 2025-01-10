package ss4_oop_to_java.bai_tap;

public class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private final int speed=SLOW;
    private final boolean on=true;
    private final double radius=5;
    private final String color="blue";
    public Fan(){

    }
    public Fan(int speed,boolean on,double radius,String color){

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if(on){
            return speed+" "+color+" "+radius+" fan is on";
        }
        else{
            return color+" "+radius+" fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan=new Fan();
        System.out.println(fan.toString());
    }
}
