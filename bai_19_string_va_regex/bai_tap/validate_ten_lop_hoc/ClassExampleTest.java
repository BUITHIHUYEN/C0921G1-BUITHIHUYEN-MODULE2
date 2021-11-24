package bai_19_string_va_regex.bai_tap.validate_ten_lop_hoc;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"C0318G","A2345G","P1265H"};
    public static final String[] invalidClass= new String[] {"M0318G","P0323A","C0318G_"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classname:validClass) {
            boolean isvalid = classExample.validate(classname);
            System.out.println("Class is " + classname+"is valid "+isvalid);
        }
        for (String classname:invalidClass){
            boolean isvalid = classExample.validate(classname);
            System.out.println("Email is"+ classname+"is valid"+ isvalid);
        }
    }

}
