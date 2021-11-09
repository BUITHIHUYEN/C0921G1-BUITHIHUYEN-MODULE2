package bai_7_abstract_class_and_inteface.bai_tap;

public class Circle extends InterfaceResizeable implements Resizeable {
    private double radius = 1.0;
    public Circle(){

    }
   public Circle (double radius) {
       this.radius = radius;
   }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    double area() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    double perimeter() {
        return 2*this.radius*Math.PI;
    }


    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*(100+percent)/100);

    }
}
