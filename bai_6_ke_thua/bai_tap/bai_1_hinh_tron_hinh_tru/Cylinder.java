package bai_6_ke_thua.bai_tap.bai_1_hinh_tron_hinh_tru;

public class Cylinder extends Circle{
    private double height;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder (){
    }
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI*this.getRadius()*this.getRadius()*this.height;
    }




    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Cylinder{" +
                " color " + this.getColor() +
                "height= " +  height  + " radius " + this.getRadius()+
                '}';
    }
}
