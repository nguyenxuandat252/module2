package ss6_kethua.bai_tap;

public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "("+getX()+','+getY()+"),speed=("+xSpeed+','+ySpeed+')';
    }

    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
