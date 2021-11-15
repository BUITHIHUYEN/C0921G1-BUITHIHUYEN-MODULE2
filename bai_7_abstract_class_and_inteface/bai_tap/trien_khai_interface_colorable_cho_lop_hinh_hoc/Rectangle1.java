package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class Rectangle1 extends Shape1 {
    public double width = 1.0;
    public double length = 1.0;

    public Rectangle1() {
    }

    public Rectangle1(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + "has an area of"
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

}
