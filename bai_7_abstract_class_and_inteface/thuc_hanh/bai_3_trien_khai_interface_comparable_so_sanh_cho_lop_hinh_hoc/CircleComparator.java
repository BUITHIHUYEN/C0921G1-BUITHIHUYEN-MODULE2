package bai_7_abstract_class_and_inteface.thuc_hanh.bai_3_trien_khai_interface_comparable_so_sanh_cho_lop_hinh_hoc;

import bai_6_ke_thua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
