package bai_6_ke_thua.bai_tap.bai_2_lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.3f, 2.5f);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
