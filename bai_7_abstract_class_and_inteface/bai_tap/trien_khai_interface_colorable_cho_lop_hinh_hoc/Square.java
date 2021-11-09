package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class Square extends bai_6_ke_thua.thuc_hanh.Square implements Colorable{
    public Square() {
    }



    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");

    }


}
