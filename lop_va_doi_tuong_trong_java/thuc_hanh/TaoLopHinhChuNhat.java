package lop_va_doi_tuong_trong_java.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class TaoLopHinhChuNhat {
    double width, height;

    public TaoLopHinhChuNhat() {

    }

    public TaoLopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width + this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "TaoHinhChuNhat {" + "width=" + width + ",height=" + height + "}";
    }
}



