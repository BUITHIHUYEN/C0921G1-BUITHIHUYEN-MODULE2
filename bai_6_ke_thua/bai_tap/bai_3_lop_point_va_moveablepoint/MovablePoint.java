package bai_6_ke_thua.bai_tap.bai_3_lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(){
    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x,y);
        this. xSpeed = xSpeed;
        this. ySpeed = ySpeed;
    }

    public float getXSpeed() {


        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float [] arr3 = new float[2];
        arr3[0] = xSpeed;
        arr3[1] = ySpeed;
        return arr3;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
    public MovablePoint move (){
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }
}
