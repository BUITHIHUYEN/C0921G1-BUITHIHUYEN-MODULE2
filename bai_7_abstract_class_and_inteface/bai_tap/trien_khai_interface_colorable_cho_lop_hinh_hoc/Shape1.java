package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class Shape1 {
    private String color = "red";
    private boolean filled = true;

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape1() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
