package bai_7_abstract_class_and_inteface.bai_tap;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        InterfaceResizeable[] sc = new InterfaceResizeable[3];
        sc[0] = new Circle();
        sc[1] = new Rectangle();
        sc[2] = new Square();
        for (InterfaceResizeable interfaceResizeable : sc) {
            System.out.println(interfaceResizeable);
            System.out.println("diện tích = " + interfaceResizeable.area());
            interfaceResizeable.resize(Math.random() * 99 + 1);
            System.out.println("diện tích = " + interfaceResizeable.area());
            System.out.println("chu vi = " + interfaceResizeable.perimeter());
        }

    }
}