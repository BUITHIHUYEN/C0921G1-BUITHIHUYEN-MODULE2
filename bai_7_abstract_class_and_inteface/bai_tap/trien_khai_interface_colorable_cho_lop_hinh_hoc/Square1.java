package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class Square1 extends Shape1 implements Colorable {
    double edge = 1;

    public Square1() {
    }

    public Square1(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }
    @Override
    public String toString() {
        return "A Square with edge= "
                + getEdge()
                + ", has an area of "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }


    @Override
    public String howToColor() {
        return "color all four side ";
    }
}
