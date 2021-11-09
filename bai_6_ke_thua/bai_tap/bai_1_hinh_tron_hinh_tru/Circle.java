package bai_6_ke_thua.bai_tap.bai_1_hinh_tron_hinh_tru;

public class Circle {
    private double radius;
    private String color;
    private double perimeter;
    private double area;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
