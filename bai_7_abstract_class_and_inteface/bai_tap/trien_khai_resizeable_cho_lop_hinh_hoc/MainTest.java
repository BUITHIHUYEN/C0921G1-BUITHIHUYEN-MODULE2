package bai_7_abstract_class_and_inteface.bai_tap.trien_khai_resizeable_cho_lop_hinh_hoc;

public class MainTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("blue", false);
        System.out.println(shape + "\n");

        Circle tron = new Circle();
        System.out.println(tron);
        Circle hinh_tron = new Circle("red", false, 15.5);
        System.out.println(hinh_tron + "\n");

        Square vuong = new Square();
        System.out.println(vuong);
        Square hinh_vuong = new Square("green", false, 30.5);
        System.out.println(hinh_vuong + "\n");

        Rectangle hcn = new Rectangle();
        System.out.println(hcn);
        Rectangle hinh_chu_nhat = new Rectangle("blue", true, 15, 25);
        System.out.println(hinh_chu_nhat + "\n");
        System.out.println("hình chữ nhật:");
        System.out.println("\n");
        double myRandom = Math.floor(Math.random() * 100) + 1;

        Shape[] array = new Shape[3];
        array[0] = new Circle("white", true, 20);
        System.out.println((array[0]).toString());
        System.out.println("after increasing the area is " + ((Circle) array[0]).resize(myRandom) + "\n");

        array[1] = new Rectangle("red", true, 20, 40);
        System.out.println((array[1]).toString());
        System.out.println("after increasing the area is " + ((Rectangle) array[1]).resize(myRandom) + "\n");

        array[2] = new Square("red", false, 25);
        System.out.println((array[2]).toString());
        System.out.println("after increasing the area is " + ((Square) array[2]).resize(myRandom));

    }
}
