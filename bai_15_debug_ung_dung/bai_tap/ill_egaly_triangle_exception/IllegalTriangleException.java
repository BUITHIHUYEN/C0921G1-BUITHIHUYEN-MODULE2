package bai_15_debug_ung_dung.bai_tap.ill_egaly_triangle_exception;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "nhập không đúng, mời nhập lại";
    }
}

