package lop_va_doi_tuong_trong_java.bai_tap.bai_3_xay_dung_lop_fan;

public class XayDungLopFan {
    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST =3;
    int speed =1;
    boolean on=false;
    double radius=5;
    String color="blue";

    public XayDungLopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        if (!this.on){
            return " speed " + this.speed + " color" + this.color + " radius " + radius +" fan is on";
        }
        return "fan is off";
    }
    public XayDungLopFan (){
    }

}
