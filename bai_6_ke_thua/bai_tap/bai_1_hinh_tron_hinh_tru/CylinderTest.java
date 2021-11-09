package bai_6_ke_thua.bai_tap.bai_1_hinh_tron_hinh_tru;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder =new Cylinder(6.5,"blue",5);
        System.out.println(cylinder);

        System.out.println("thể tích hình trụ : "+ cylinder.getVolume());
    }
}
