package bai_7_abstract_class_and_inteface.bai_tap;

public class Rectangle extends InterfaceResizeable implements Resizeable {
    private double a = 1.0;
    private double b = 2.0;
    public Rectangle(){

    }
    public Rectangle(double a,double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    double area() {
        return this.a*this.b;
    }

    @Override
    double perimeter() {
        return 2*(this.a+this.b);
    }

    @Override
    public void resize(double percent) {
        this.setA(this.getA()*(100+percent)/100);
        this.setB(this.getB()*(100+percent)/100);


    }
}
