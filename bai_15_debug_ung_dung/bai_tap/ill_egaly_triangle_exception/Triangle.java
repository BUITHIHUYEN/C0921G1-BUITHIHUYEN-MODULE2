package bai_15_debug_ung_dung.bai_tap.ill_egaly_triangle_exception;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a>0 && b>0 &&c>0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("thõa mãn điều kiện yêu cầu");
            } else {
                throw new IllegalTriangleException("không được nhập cạnh nhỏ hơn 0");

            }
        } else {
            throw new IllegalTriangleException("tổng 2 canh không lớn hơn cạnh còn lại");

            }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    }
