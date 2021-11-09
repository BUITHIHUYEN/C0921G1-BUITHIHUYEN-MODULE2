package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;


import bai_6_ke_thua.thuc_hanh.Rectangle;
import bai_6_ke_thua.thuc_hanh.Shape;
import bai_6_ke_thua.thuc_hanh.Square;

import java.util.concurrent.Callable;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        for (Shape shape2 : shape) {
            if (shape2 instanceof Circle) {
                Circle circle = (Circle) shape2;
                System.out.println("diện tích = " + circle.getArea());
            } else if (shape2 instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape2;
                System.out.println("diện tích = " + rectangle.getArea());
            } else {


            }

        }
    }
}


