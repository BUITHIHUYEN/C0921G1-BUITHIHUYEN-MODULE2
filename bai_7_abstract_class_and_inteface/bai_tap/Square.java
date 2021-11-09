package bai_7_abstract_class_and_inteface.bai_tap;

public class Square extends InterfaceResizeable implements Resizeable {
    private double a = 1.0;
    public Square(){

    }
    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    double area() {
        return this.a*this.a;
    }

    @Override
    double perimeter() {
        return 4*this.a;
    }

    @Override
    public void resize(double percent) {
        this.setA(this.getA()*(100+percent)/100);
    }
}
