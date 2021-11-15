package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class MainTest1 {
    public static void main(String[] args) {

        Shape1[] array = new Shape1[3];

        array[0] = new Circle1("red", true, 25);
        System.out.println((array[0]).toString());

        array[1] = new Rectangle1("white", true, 20, 40);
        System.out.println((array[1]).toString());

        array[2] = new Square1("blue", false, 30);
        System.out.println((array[2]).toString());

        System.out.println( ((Square1)array [2]).howToColor());
    }
    }
