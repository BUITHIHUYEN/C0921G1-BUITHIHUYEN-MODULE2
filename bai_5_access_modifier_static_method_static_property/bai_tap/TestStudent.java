package bai_5_access_modifier_static_method_static_property.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setClasses("C0921G1");
        student.setName( "Huyen");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
